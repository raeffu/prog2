package Yield_Sample;

public class YieldSample implements Runnable {
	
	public YieldSample(){new Thread(this).start();}

	public void run() {
		for (int x = 1; x <= 4; x++) 
			if (x == 2) Thread.yield(); // let another thread get scheduler time
			else System.out.println(x + " Thread name is  "+
					Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		new YieldSample();
		new YieldSample();
		new YieldSample();
		new YieldSample();
		new YieldSample();
		new YieldSample();
		new YieldSample();
		new YieldSample();
		new YieldSample();
	}
}