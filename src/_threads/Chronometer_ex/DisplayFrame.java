package Chronometer_ex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class DisplayFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private LapTimeButton next;

	public LapTimeButton getNext() {return next;}


	public DisplayFrame() {

		super("... Chronometer ... ");
		setLayout(new FlowLayout());
		setBackground(Color.lightGray);

		Chrono u1 = new Chrono();
		add(u1);
		next = new LapTimeButton(u1);
		StartButton start = new StartButton(u1, this);
		StopButton stop = new StopButton(u1);
		add(start);
		add(stop);
		add(next);
		next.setEnabled(false);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		});
	}
}
