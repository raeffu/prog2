package _threads.main.java.Consumer_Producer_Kiosk_Problem;

public final class Producer extends Thread{

	private Kiosk kiosk;
	private String name;
	private int i;
	
	public Producer(Kiosk kiosk, String name){
		this.kiosk=kiosk;
		this.name=name;
		start();
	}
	
	public void produce(){
		Product prod = new Product(name+": "+i++);
		kiosk.storeNewProduct(prod);
		System.out.println("Producer "+name+" produced nee product "+prod);
	}
	
	public void run(){
		while(true){
			produce();
			try {Thread.sleep(500);}
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}
