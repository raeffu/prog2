package ImplementingRunnableSample1;

public final class StartUp {

	private StartUp() {}

	public static void main(String[] l) {
		A a1 = new A("Peter");
		A a2 = new A("Eva");
		A a3 = new A("Adam");
		A a4 = new A("Marie");
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		Thread t3 = new Thread(a3);
		Thread t4 = new Thread(a4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
