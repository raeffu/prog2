package _threads.main.java.LockSamples;

public final class ConterWithLock2 {

	private Lock3 lock = new Lock3();
	private int count = 0;

	public int inc() {
		int newCount = ++count;
		try {
			lock.lock();
			// do critical section code, which may throw exception
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return newCount;
	}
}
