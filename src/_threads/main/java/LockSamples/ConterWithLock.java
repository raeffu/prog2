package LockSamples;

public final class ConterWithLock {

	private Lock lock = new Lock();
	private int count = 0;

	public int inc() {
		try{lock.lock();}
		catch (InterruptedException e) {e.printStackTrace();}
		int newCount = ++count;
		lock.unlock();
		return newCount;
	}
}
