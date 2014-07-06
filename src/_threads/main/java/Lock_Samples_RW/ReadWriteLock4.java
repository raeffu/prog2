package _threads.main.java.Lock_Samples_RW;

import java.util.HashMap;
import java.util.Map;

public final class ReadWriteLock4 {

	private Map<Thread, Integer> readingThreads = new HashMap<Thread, Integer>();

	private int writeAccesses = 0;
	private int writeRequests = 0;
	private Thread writingThread = null;

	public synchronized void lockWrite() throws InterruptedException {
		writeRequests++;
		Thread callingThread = Thread.currentThread();
		while (!canGrantWriteAccess(callingThread))
			wait();
		writeRequests--;
		writeAccesses++;
		writingThread = callingThread;
	}

	public synchronized void unlockWrite() throws InterruptedException {
		writeAccesses--;
		if (writeAccesses == 0)
			writingThread = null;
		notifyAll();
	}

	private boolean canGrantWriteAccess(Thread callingThread) {
		if (isOnlyReader(callingThread))
			return true;
		if (hasReaders())
			return false;
		if (writingThread == null)
			return true;
		if (!isWriter(callingThread))
			return false;
		return true;
	}

	private boolean hasReaders() {
		return readingThreads.size() > 0;
	}

	private boolean isWriter(Thread callingThread) {
		return writingThread == callingThread;
	}

	private boolean isOnlyReader(Thread thread) {
		return readingThreads.size() == 1 && readingThreads.get(thread) != null;
	}

	private boolean isReader(Thread thread) {
		return readingThreads.containsKey(thread);
	}

	@SuppressWarnings("unused")
	private boolean canGrantReadAccess(Thread callingThread) {
		if (isWriter(callingThread))
			return true;
		if (writingThread != null)
			return false;
		if (isReader(callingThread))
			return true;
		if (writeRequests > 0)
			return false;
		return true;
	}

}
