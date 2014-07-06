package _threads.main.java.LockSamples;

public final class Lock2 {

	private boolean isLocked = false;

	public synchronized void lock() throws InterruptedException {
		while (isLocked) wait();
		isLocked = true;
	}

	// ....
}
