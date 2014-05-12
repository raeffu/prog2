package Chronometer_ex;

import java.awt.event.*;
import javax.swing.JButton;

public final class StartButton extends JButton {

	private static final long serialVersionUID = 1L;
	private Chrono u;
	private DisplayFrame f;

	public StartButton(Chrono pu, DisplayFrame pf) {
		super("Start");
		u = pu;
		f = pf;
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent me) {

				
			}
		});
	}
}
