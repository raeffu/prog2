package StoppingThreadSample2;

public final class StartUp {

	private StartUp() {}

	public static void main(String[] l) {
		A a1 = new A("Adam");
		try{Thread.sleep(2000);
			a1.interrupt(); // Interrupt the thread
			System.out.println("Main is interrupting "+a1.getName());
		}
		catch (InterruptedException e) {e.printStackTrace();}
		try{Thread.sleep(3000);
			System.out.println("Main is ending");
		}
		catch (InterruptedException e) {e.printStackTrace();}
	}
}
