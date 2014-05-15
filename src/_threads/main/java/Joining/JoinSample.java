package Joining;

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
					Thread.sleep(10000);
					System.out.println(Thread.currentThread().getName()+ " is Completed");
				}
				catch (InterruptedException ex) {
					Logger.getLogger(JoinSample.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		};
		
		th1.start();
		
		System.out.println("Main is waiting for: "+th1.getName() + " to complete.");
		th1.join();

		for(int i=0; i<5;i++){
			System.out.println(Thread.currentThread().getName() + " is continuning to work...");
			Thread.sleep(1000);
		}
		System.out.println(Thread.currentThread().getName() + " is completed now.");
	}
}
