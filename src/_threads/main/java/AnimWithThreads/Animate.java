package AnimWithThreads;

// Sample Animator This example requires the TimerThread class to run.  

import java.applet.*;
import java.awt.*;

public final class Animate extends Applet {

	private static final long serialVersionUID = 1L;
	private int count, lastcount;
	private Image pictures[];
	private TimerThread timer;  // The thread

    public void init() {
        lastcount = 26; count = 0;
        pictures = new Image[26];
        MediaTracker tracker = new MediaTracker(this);
        for (int a = 0; a < lastcount; a++) {
            pictures[a] = getImage (	// Picture filenames: 0.jpg, 1.jpg, etc
                getCodeBase(), "./AnimWithThreads/pictures/"+new Integer(a).toString()+".JPG");
            tracker.addImage(pictures[a], 0);
        }
        tracker.checkAll(true);
    }

    public void start() {	// The Applet
        timer = new TimerThread(this, 2000);
        timer.start();		// The thread
    }

	public void stop() {	// The Applet
        timer.interrupt();		// The Thread
        timer = null;		// Destroy the timer
    }

    public void paint(Graphics g) {
        g.drawImage(pictures[count++], 0, 0, null);
		// Draw and schange picture
        if (count == lastcount) count = 0; // Reset
		
    }
}

