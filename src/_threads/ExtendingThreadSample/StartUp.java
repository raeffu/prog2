package ExtendingThreadSample;

public final class StartUp {

	private StartUp() {}

	public static void main(String[] l) {
		A a1 = new A("Peter");
		A a2 = new A("Eva");
		A a3 = new A("Adam");
		A a4 = new A("Marie");
		a1.start();
		a2.start();
		a3.start();
		a4.start();
	}
}
