package _threads.main.java.Consumer_Producer_Kiosk_Solution1;

public final class Consumer extends Thread{
	
	private Kiosk kiosk;
	private String name;
	
	public Consumer(Kiosk kiosk, String name){
		this.kiosk=kiosk;
		this.name=name;
		start();
	}
	
	public void consume(){
		Product prod = kiosk.consumeProduct(this);
		System.out.println("Consumer "+name+" consumed product "+prod);
	}

	public void run(){
		while(true){
			consume();
			try {Thread.sleep(500);}
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
