package _threads.DeadLockSamples;

public final class DeadLockTest {
	
	private DeadLockTest(){}
	private static long sleepMillis=10;
	private final Object lock1 = new Object();
	private final Object lock2 = new Object();

	public static void main(String[] args) {
		if(args.length != 0) sleepMillis = Long.parseLong(args[0]);
		new DeadLockTest().doTest();
	}

	private void doTest() {
		new Thread(new Runnable(){public void run(){lock12();}}).start();
		new Thread(new Runnable(){public void run(){lock21();}}).start();
	}

	private void lock12() {
		synchronized(lock1) {
			sleep();
			synchronized(lock2){sleep();}
		}
	}

	private void lock21() {
		synchronized(lock2) {
			sleep();
			synchronized(lock1){sleep();}
		}
	}

	private void sleep() {
		try{Thread.sleep(sleepMillis);}
		catch (InterruptedException e) {e.printStackTrace();}
	}
}
