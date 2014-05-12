package DaemonThreadSample;

public final class DaemonTestUserThread {
	
	private DaemonTestUserThread(){}
	
//	UserWorker[false]: 0
//	UserWorker[false]: 1
//	UserWorker[false]: 2
//	UserWorker[false]: 3
//	UserWorker[false]: 4
//	Main Thread ends!
//	UserWorker[false]: 5
//	UserWorker[false]: 6
//	UserWorker[false]: 7
//	etc.
//  UserWorker is NOT a Daemon (==> it's a User-Thread
//  that ends when its run - method terminates.
	
	public static void main(String[] args) {
		new UserWorker(false).start();
	try{Thread.sleep(5000);}
		catch (InterruptedException e) {}
		System.out.println("Main Thread ends!");
	}
}

class UserWorker extends Thread {

	private boolean state;

	public UserWorker(boolean state) {
		this.state = state;
		setDaemon(state);
	}

	public void run() {
		int count = 0;
		while(true){
			System.out.println("UserWorker[" + state + "]: " + count++);
			try{Thread.sleep(1000);}
			catch (InterruptedException e) {}
		}
	}
}