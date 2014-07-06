package _threads.main.java.StoppingThreadSample3;

public final class StartUp {

	private StartUp() {}

	@SuppressWarnings("deprecation")
	public static void main(String[] l) {
		A a1 = new A("Adam");
		try{Thread.sleep(2000);
			a1.stop();
			System.out.println("Main is stopping "+a1.getName());
		}
		catch (InterruptedException e) {e.printStackTrace();}
		try{Thread.sleep(3000);
			System.out.println("Main is ending");
		}
		catch (InterruptedException e) {e.printStackTrace();}
	}
}
