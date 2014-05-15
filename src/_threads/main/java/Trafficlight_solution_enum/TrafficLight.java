package Trafficlight_solution_enum;

import java.awt.*;

import javax.swing.JPanel;

public final class TrafficLight extends JPanel {

	private static final long serialVersionUID = 1L;
	Color backGround = Color.yellow;
	Trigger tackt;

	Bulb green = new Bulb(Color.green);
	Bulb orange = new Bulb(Color.orange);
	Bulb red = new Bulb(Color.red);

	int deltaRed = 2000; // for state 2
	int deltaGreen = 3000; // for state 3
	int deltaOrange = 1000; // for state 0 and 1
	int waitTime = deltaOrange;

	enum State {
		OrangeToGreen, OrgangeToRed, RedToOrange, GreenToOrange
	}

	State state = State.OrangeToGreen;

	TrafficLight(int deltaRed, int deltaGreen, int deltaOrange) {
		this.deltaRed = deltaRed;
		this.deltaGreen = deltaGreen;
		this.deltaOrange = deltaOrange;
		setLayout(new BorderLayout());
		add(green, BorderLayout.NORTH);
		add(red, BorderLayout.SOUTH);
		add(orange, BorderLayout.CENTER);
		setBackground(Color.lightGray);
		tackt = new Trigger(this);
		tackt.start();
	}

	public void changeState() {
		if (state == State.OrangeToGreen) { // Orange
			state = State.GreenToOrange;
			waitTime = deltaOrange;
			green.setOff();
			orange.setOn();
			red.setOff();

		} else if (state == State.OrgangeToRed) { // Orange
			state = State.RedToOrange;
			waitTime = deltaOrange;
			green.setOff();
			orange.setOn();
			red.setOff();
		} else if (state == State.RedToOrange) { // Red
			state = State.OrangeToGreen;
			waitTime = deltaRed;
			green.setOff();
			orange.setOff();
			red.setOn();
		} else if (state == State.GreenToOrange) { // Green
			state = State.OrgangeToRed;
			waitTime = deltaGreen;
			green.setOn();
			orange.setOff();
			red.setOff();
		}
	}
}
