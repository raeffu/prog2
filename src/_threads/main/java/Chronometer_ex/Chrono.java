package Chronometer_ex;

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


	public Chrono() {
		setSize(w, h);
		setFont(font);
		setBackground(backGround);
		setForeground(color);

	}

	public void paint(Graphics g) {
		String s = "";
		s = s + 0 + ":" + 0 + ":" + 0;
		g.setColor(Color.yellow);
		g.drawString(s, 0, 20);
	}
}
