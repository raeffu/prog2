package Chronometer_sol;

import java.awt.event.*;
import javax.swing.JButton;

public final class StopButton extends JButton {

	private static final long serialVersionUID = 1L;
	private Chrono u;

	public StopButton(Chrono pu) {
		super("Stopp");
		u = pu;
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent me) {
				u.stop();
			}
		});
	}
}
