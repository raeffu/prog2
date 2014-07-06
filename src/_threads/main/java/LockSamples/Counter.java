package _threads.main.java.LockSamples;

public final class Counter {

	private int count = 0;

	public int inc() {
		synchronized (this) {
			return ++count;
		}
	}
}
