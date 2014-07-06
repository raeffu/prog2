package _threads.main.java.overallSample;

import java.awt.Color;

import javax.swing.JLabel;
public final class ColoredJLabel extends JLabel {
	
	private static final long serialVersionUID = 1L;
	private Color fgColor=Color.BLACK;
	
	public ColoredJLabel(){
		this.setForeground(fgColor);
		this.setOpaque(true);
	}
	
	public void setNewBackGroundColor(Color c){this.setBackground(c);}
	public void displayText(String s){this.setText(s);}
	
}
