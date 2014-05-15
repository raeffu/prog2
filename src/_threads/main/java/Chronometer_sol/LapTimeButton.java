package Chronometer_sol;

import java.awt.event.*;
import javax.swing.JButton;

public final class LapTimeButton extends JButton {

	private static final long serialVersionUID = 1L;
	private Chrono u;

	public LapTimeButton(Chrono pu) {
		super("Intermediate Time");
		u = pu;
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent me) {
				if (me.getActionCommand().compareTo("Next") == 0) {
					setNext();
				} else {
					setIntermediateTime();
				}
			}
		});
	}

	public void setNext() {
		u.next();
		setText("Intermediate Time");
	}

	public void setIntermediateTime() {
		u.intermediateTime();
		setText("Next");
	}
}
