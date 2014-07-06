package _threads.main.java.Greeting_Thread;

/**
 * This program tests the greeting thread by running two threads in parallel.
 */
public final class GreetingThreadTester {

	private GreetingThreadTester() {}

	public static void main(String[] args) {
		GreetingThread r1 = new GreetingThread("Hello, World!");
		GreetingThread r2 = new GreetingThread("Goodbye, World!");
		r1.start();
		r2.start();
	}
}
