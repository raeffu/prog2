package Trafficlight_solution;

import java.awt.*;

public final class TrafficLight extends Panel {

	private static final long serialVersionUID = 1L;
	private Tackt tackt;

	private Bulb green = new Bulb(Color.green);
	private Bulb orange = new Bulb(Color.orange);
	private Bulb red = new Bulb(Color.red);

	@SuppressWarnings("unused")
	private int deltaRed = 2000; // for state 2
	@SuppressWarnings("unused")
	private int deltaGreen = 3000; // for state 3
	@SuppressWarnings("unused")
	private int deltaOrange = 1000; // for state 0 and 1
	private int state = 0;
	public long waitTime=1000;

	// 0: Orange-->Green
	// 1: Orange-->Red
	// 2: Red-->Orange
	// 3: Green-->Orange

	TrafficLight() {
		setLayout(new BorderLayout());
		add(green, BorderLayout.NORTH);
		add(red, BorderLayout.SOUTH);
		add(orange, BorderLayout.CENTER);
		setBackground(Color.lightGray);
		tackt = new Tackt(this);
		tackt.start();
	}

	public void changeState() {
		if (state == 0) { // Orange
			state = 3;
			green.setOff();
			orange.setOn();
			red.setOff();

		} else if (state == 1) { // Orange
			state = 2;
			green.setOff();
			orange.setOn();
			red.setOff();
		} else if (state == 2) { // Red
			state = 0;
			green.setOff();
			orange.setOff();
			red.setOn();
		} else if (state == 3) { // Green
			state = 1;
			green.setOn();
			orange.setOff();
			red.setOff();
		}
	}
}
