package Yield_Sample;

public class YieldSample implements Runnable {

	public void run() {
		for (int x = 1; x <= 4; x++) 
			if (x == 2) Thread.yield(); // let another thread
										// get scheduler time
			else System.out.println(x + " Thread name is  "+
					Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new YieldSample());
		Thread t2 = new Thread(new YieldSample());
		Thread t3 = new Thread(new YieldSample());
		t1.start();
		t2.start();
		t3.start();
	}
}