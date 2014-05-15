package AnimWithThreads;

// An example for thread programming

import java.awt.*;

public final class TimerThread extends Thread {

	private Component comp; // Component that need repainting
	private int timediff; // Time between repaints of the component

	public TimerThread(Component comp, int timediff) {
		// Constructor
		this.comp = comp;
		this.timediff = timediff;
	}

	public void run() { // Will be started with the start method
						// of the thread
		while(!this.isInterrupted()) {
			try {
				comp.repaint(); // Start paint of applet
								// In between change the picture
								// to be displayed
				sleep(timediff);// Go to sleep for a while
			}
			catch (Exception e) {}
		}
	}
}
