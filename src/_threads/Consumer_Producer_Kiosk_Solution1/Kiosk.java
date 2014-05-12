package Consumer_Producer_Kiosk_Solution1;

public final class Kiosk {

	private Product product;

	public synchronized Product consumeProduct(Consumer c) {
		int i = 0;
		// Get the product locally
		Product p = product;
		
		// Set the global product to null - The global product is consumed
		product = null;
		while (i< 1000) { // Remain a little while
			System.out.println(i + ": consumes procuct: " + p);
			i++;
		}
		return p;
	}

	public synchronized void storeNewProduct(Producer producer, Product prod) {
		if (product != null)
			System.out.println("Product " + prod+ " can not be stored as store is full");
		else product = prod;
		int i=0;
		while(i<10000){ // Remain a while
			System.out.println(i+" Producer: "+producer+" produces product");
			i++;
		}
	}
}
