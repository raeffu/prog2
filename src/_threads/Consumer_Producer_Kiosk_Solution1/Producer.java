package Consumer_Producer_Kiosk_Solution1;

public final class Producer extends Thread{

	private Kiosk kiosk;
	private String name;
	private int i;
	
	Producer(Kiosk kiosk, String name){
		this.kiosk=kiosk;
		this.name=name;
		start();
	}
	
	public void produce(){
		Product prod = new Product(name+": "+i++);
		kiosk.storeNewProduct(this, prod);
		System.out.println("Producer "+name+" produced new product "+prod);
	}
	
	public void run(){
		while(true){
			produce();
			try {Thread.sleep(500);}
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}
