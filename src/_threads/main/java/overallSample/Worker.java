package overallSample;

import java.awt.Color;
import javax.swing.JTextArea;

public final class Worker extends Thread{
	
	private static final int DELAY=100;
	
	private ColoredJLabel[][] labelArray;
	private Color myColor;
	private int displayDimension, cycle, speed;
	private String name;
	private JTextArea history;
	
	public Worker(int cycle, int speed, int priority, String name, ColoredJLabel[][] labelArray,
			      int displayDimension, JTextArea history){
		this.labelArray=labelArray;
		this.history=history;
		this.displayDimension=displayDimension;
		this.displayDimension=displayDimension;
		this.speed=speed;
		this.cycle=cycle;
		this.name=name;
		myColor = Tools.genColor();
		this.setPriority(priority);
		this.setDaemon(true);
		start();
	}
	
	public void run(){
		int x, y;
		int cycleCounter=0;
		String s =history.getText();
		history.setText("Thread "+name+" started.\n"+s);
		while(cycleCounter < cycle){
			try {
				x=Tools.genRandomNumber(displayDimension);
				y=Tools.genRandomNumber(displayDimension);
				labelArray[x][y].setNewBackGroundColor(myColor);
				labelArray[x][y].displayText("T: "+name);
				Thread.sleep(speed*DELAY);
			}
			catch (InterruptedException e) {e.printStackTrace();}
			finally{cycleCounter++;}
		}
		s =history.getText();
		history.setText("Thread "+name+" finished.\n"+s);
	}
}