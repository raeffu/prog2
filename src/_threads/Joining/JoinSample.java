package _threads.Joining;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sample Java class to illustrate how to join two threads in Java. join()
 * method allows you to serialize processing of two threads.
 */
public class JoinSample{

	public static void main(String args[]) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " is Started");
		Thread th1 = new Thread() {
			public void run() {
				try{System.out.println(Thread.currentThread().getName()+ " is Started");
					Thread.sleep(2000);
					System.out.println(Thread.currentThread().getName()+ " is Completed");
				}
				catch (InterruptedException ex) {
					Logger.getLogger(JoinSample.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		};
		th1.start();
		th1.join();
		System.out.println(Thread.currentThread().getName() + " is Completed");
	}
}
