package LockSamples;

public final class Reentrant2 {

	private Lock lock = new Lock();

	public void outer() {
		try {
			lock.lock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		inner();
		lock.unlock();
	}

	public synchronized void inner() {
		try {
			lock.lock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// do something
		lock.unlock();
	}
}
