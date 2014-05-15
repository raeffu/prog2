package Trafficlight_solution;

import java.awt.*;
import java.awt.event.*;

public final class TLFrame extends Frame {

	private static final long serialVersionUID = 1L;

	public TLFrame() {

		super("Ampel-Demo");
		setLayout(new FlowLayout());
		setBackground(Color.lightGray);

		TrafficLight a1 = new TrafficLight();
		add(a1);

		TrafficLight a2 = new TrafficLight();
		add(a2);

		TrafficLight a3 = new TrafficLight();
		add(a3);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		});
	}
}