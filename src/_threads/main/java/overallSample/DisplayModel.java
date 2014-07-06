package _threads.main.java.overallSample;

import java.awt.GridLayout;
import javax.swing.JTextArea;

public final class DisplayModel {
	
	private int displayDimension;
	private ColoredJLabel[][] labelArray;
	
	public DisplayModel(int displayDimension, OverAllFrame overAllFrame) {
		this.displayDimension=displayDimension;
		labelArray= new ColoredJLabel[displayDimension][displayDimension];
		GridLayout gridLayout=new GridLayout(displayDimension,displayDimension);
		overAllFrame.getDisplayPanel().setLayout(gridLayout);
		for(int i=0; i<displayDimension; i++){
			for(int j=0; j<displayDimension; j++){
				labelArray[i][j] = new ColoredJLabel();
				overAllFrame.getDisplayPanel().add(labelArray[i][j]);
				labelArray[i][j].displayText(""+i+" : "+j);
			}
		}
	}
	
	public void setAndStartNewWorker(int cycle, int speed, int priority, String name, JTextArea history){
		new Worker(cycle, speed, priority, name,labelArray,displayDimension, history);
	}
}
