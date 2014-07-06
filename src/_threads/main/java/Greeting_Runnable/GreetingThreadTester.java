package _threads.main.java.Greeting_Runnable;

/**
 * This program tests the greeting thread by running two threads in parallel.
 */
public final class GreetingThreadTester {

	private GreetingThreadTester() {}

	public static void main(String[] args) {
		GreetingRunnable r1 = new GreetingRunnable("Hello, World!");
		GreetingRunnable r2 = new GreetingRunnable("Goodbye, World!");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
