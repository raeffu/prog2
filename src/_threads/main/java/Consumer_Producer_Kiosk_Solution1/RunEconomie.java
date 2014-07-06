package _threads.main.java.Consumer_Producer_Kiosk_Solution1;

public final class RunEconomie {
	
	private RunEconomie(){}

	public static void main(String[] args) {
		Kiosk kiosk = new Kiosk();
		new Producer(kiosk, "Adam");
		new Producer(kiosk, "Max");
		new Producer(kiosk, "Hans");
		new Producer(kiosk, "John");
		new Consumer(kiosk, "Eva");
		new Consumer(kiosk, "Marie");
		new Consumer(kiosk, "Clara");
		new Consumer(kiosk, "Lara");
	}
}
