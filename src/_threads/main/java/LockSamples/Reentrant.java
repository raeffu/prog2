package LockSamples;

public final class Reentrant {

	public synchronized void outer() {
		inner();
	}

	public synchronized void inner() {
		// do something
	}
}
