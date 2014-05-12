package ThreadGrouping;

public final class ThreadLocalDemo2 {
	
	public static void main(String[] args) {
		OThread mt1 = new OThread("A");
		OThread mt2 = new OThread("B");
		OThread mt3 = new OThread("C");
		mt1.start();
		mt2.start();
		mt3.start();
	}
}

class OThread extends Thread {
	private static ThreadLocal<Object> tl = new ThreadLocal<Object>();
	private static int sernum = 100;

	OThread(String name) {super(name);}

	public void run() {
		synchronized ("A") {tl.set("" + sernum++);}
		for (int i = 0; i < 10; i++) System.out.println(getName() + " " + tl.get());
	}
}
