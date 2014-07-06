package _threads.main.java.Chronometer_sol;

import java.awt.*;

public final class Chrono extends Canvas {

	private static final long serialVersionUID = 1L;
	private Color backGround = Color.black;
	private Color color = Color.white;
	private int fontSize = 20;
	private Font font = new Font("Arial", 1, fontSize);
	private int deltaHigh = 10;
	private int maxNbrOfDigits = 8;

	private int h = fontSize + deltaHigh;
	private int w = (maxNbrOfDigits * (fontSize / 2));

	private int miSec;
	private int sec;
	private int min;

	private boolean show = true;

	private Ticker ticker;

	public void reset() {
		miSec = 0;
		sec = 0;
		min = 0;
		show = true;
	}

	public Chrono() {
		setSize(w, h);
		setFont(font);
		setBackground(backGround);
		setForeground(color);
		reset();
	}

	public void start() {
		reset();
		ticker = new Ticker(this);
	}

	public void stop() {
		ticker.stoppIt();
		ticker = null;
	}

	public void intermediateTime() {show = false;}

	public void next() {show = true;}

	public void increment() {
		miSec += 1;
		if (miSec == 100) {
			miSec = 0;
			sec += 1;
		}
		if (sec == 60) {
			sec = 0;
			min += 1;
		}
		if (min == 60)
			min = 0;
		if (show)
			repaint();
	}

	public void paint(Graphics g) {
		String s = "";
		s = s + min + ":" + sec + ":" + miSec;
		g.setColor(Color.yellow);
		g.drawString(s, 0, 20);
	}
}
