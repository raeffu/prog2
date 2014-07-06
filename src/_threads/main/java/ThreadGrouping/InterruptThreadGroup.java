package _threads.main.java.ThreadGrouping;

public final class InterruptThreadGroup {
	
	private InterruptThreadGroup(){}
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.setName("A");
		mt.start();
		mt = new MyThread();
		mt.setName("B");
		mt.start();
		// Wait 2 seconds
		try{Thread.sleep(2000);}
		catch (InterruptedException e) {}
		// Interrupt all methods in the same thread group as the main thread
		Thread.currentThread().getThreadGroup().interrupt();
	}
}

class MyThread extends Thread {
	public void run() {
		synchronized(InterruptThreadGroup.class) {
			System.out.println(getName() + " about to wait.");
			try{InterruptThreadGroup.class.wait();}
			catch(InterruptedException e){System.out.println(getName() + " interrupted.");}
			System.out.println(getName() + " terminating.");
		}
	}
}
