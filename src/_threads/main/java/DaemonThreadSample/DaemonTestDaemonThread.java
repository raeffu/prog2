package _threads.main.java.DaemonThreadSample;

public final class DaemonTestDaemonThread {
	
	private DaemonTestDaemonThread(){}
	
//	DaemonWorker[true]: 0
//	DaemonWorker[true]: 1
//	DaemonWorker[true]: 2
//	DaemonWorker[true]: 3
//	DaemonWorker[true]: 4
//	Main Thread ends!
	
//  DaemonWorker is a daemon thread (==> it terminates
//	if NO non-daemon are running
//  The only non-daemon thread running is the main-Thread
//  If this thread terminates, all daemon threads terminate
	
	public static void main(String[] args) {
		new DaemonWorker(true).start();
		//new DaemonWorker(true).start();
	try{Thread.sleep(5000);}
		catch (InterruptedException e) {}
		System.out.println("Main Thread ends!");
	}
}

class DaemonWorker extends Thread {

	private boolean state;

	public DaemonWorker(boolean state) {
		this.state = state;
		setDaemon(state);
	}

	public void run() {
		int count = 0;
		while(true){
			System.out.println("DaemonWorker[" + state + "]: " + count++);
			try{Thread.sleep(1000);}
			catch (InterruptedException e) {}
		}
	}
}