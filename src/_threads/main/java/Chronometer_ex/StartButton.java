package _threads.main.java.Chronometer_ex;

import java.awt.event.*;

import javax.swing.JButton;

public final class StartButton extends JButton {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private Chrono u;
	@SuppressWarnings("unused")
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
