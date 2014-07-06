package _threads.main.java.ThreadGrouping;

public final class ThreadLocalDemo1 {
	
	public static void main(String[] args) {
		AThread mt1 = new AThread("A");
		AThread mt2 = new AThread("B");
		AThread mt3 = new AThread("C");
		mt1.start();
		mt2.start();
		mt3.start();
	}
}

class AThread extends Thread {
	
	private static ThreadLocal<Object> tl = new ThreadLocal<Object>() {
		protected synchronized Object initialValue() {
			return new Integer(sernum++);
		}
	};
	
	private static int sernum = 100;

	AThread(String name) {super(name);}

	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(getName() + " " + tl.get());
	}
}