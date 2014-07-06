package _threads.main.java.Greeting_Thread;

import java.util.Date;

/**
 * A runnable that repeatedly prints a greeting.
 */
public final class GreetingThread extends Thread {
	
	private String greeting;

	private static final int REPETITIONS = 10;
	private static final int DELAY = 1000;
	
	/**
	 * Constructs the Thread object. 
	 * @param aGreeting
	 *            the greeting to display
	 */
	public GreetingThread(String aGreeting) {greeting = aGreeting;}

	public void run() {
		try{for (int i = 1; i <= REPETITIONS; i++) {
				Date now = new Date();
				System.out.println(now + " " + greeting);
				Thread.sleep(DELAY);
			}
		}
		catch (InterruptedException exception) {}
	}
}
