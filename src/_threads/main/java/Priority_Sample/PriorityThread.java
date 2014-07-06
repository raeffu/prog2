package _threads.main.java.Priority_Sample;

public final class PriorityThread extends Thread {
	
	private int countDown = 3;
	private volatile double d = 0;

	public PriorityThread(int priority) {
		setPriority(priority);
		start();
	}

	public String toString(){return super.toString() + ": " + countDown;}

	public void run() {
		while (true) {
			// Doing some work ...
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			for (int i = 1; i < 9999999; i++) d = d + (Math.PI + Math.E) / (double) i;
			System.out.println(this);
			if (--countDown == 0) break;;
		}
		System.out.println("Thread: "+this+" finished!");
	}
}