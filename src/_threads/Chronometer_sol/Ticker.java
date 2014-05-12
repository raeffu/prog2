package Chronometer_sol;

public final class Ticker extends Thread {

	private Chrono u;
	private boolean isStopped = false;

	public Ticker(Chrono u) {
		this.u = u;
		this.start();
	}
	
	public void stoppIt(){isStopped=true;}

	public void run() {
		while(!isStopped) {
			try{
				Thread.sleep(10);
			}
			catch (InterruptedException e) {isStopped=true;}
			u.increment();
		}
	}
}
