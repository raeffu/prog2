package _threads.main.java.LockSamples;

public final class Lock {

	private boolean isLocked = false;

	public synchronized void lock() throws InterruptedException {
		while (isLocked) wait();
		isLocked = true;
	}

	public synchronized void unlock() {
		isLocked = false;
		notify();
	}
}
