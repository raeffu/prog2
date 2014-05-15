package DaemonThreadSample;

public final class DaemonTest {
	
	private DaemonTest(){}

	public static void main(String[] args) {
		new DaemonWorker(false).start();
		new DaemonWorker(true).start();
		try{Thread.sleep(5000);}
		catch (InterruptedException e) {}
		System.out.println("Main Thread ends!");
	}
}

// DEFINITION:
// Daemon threads are threads that run in background as long as other non-daemon
// threads of the process are still running.
// Thus, when all of the non-daemon threads complete, the daemon threads are terminated.
// An example for non-daemon thread is the thread running the Main.
// A thread is made daemon by calling the setDaemon() method before the thread is started
final class WorkerThread extends Thread {

	private boolean state;

	public WorkerThread(boolean state) {
		this.state = state;
		setDaemon(state);
		// When false, (i.e. when it's a user thread),
		// the Worker thread continues to run.
		// When true, (i.e. when it's a daemon thread),
		// the Worker thread terminates when the main thread terminates.
	}

	public void run() {
		int count = 0;
		while (true) {
			System.out.println("Worker[" + state + "]: " + count++);
			try{Thread.sleep(1000);}
			catch (InterruptedException e) {}
		}
	}
}