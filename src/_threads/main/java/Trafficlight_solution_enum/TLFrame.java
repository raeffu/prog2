package _threads.main.java.Trafficlight_solution_enum;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public final class TLFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public TLFrame() {

		super("Ampel-Demo");
		setLayout(new FlowLayout());
		setBackground(Color.lightGray);

		TrafficLight a1 = new TrafficLight(4000, 8000, 1000);
		add(a1);

		TrafficLight a2 = new TrafficLight(500, 1000, 3000);
		add(a2);

		TrafficLight a3 = new TrafficLight(2000, 1000, 1000);
		add(a3);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		});
	}
}