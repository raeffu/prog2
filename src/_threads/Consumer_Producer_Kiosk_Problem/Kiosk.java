package Consumer_Producer_Kiosk_Problem;

public final class Kiosk {
	
	private Product product;

	public Product consumeProduct() {
		Product p=product;
		product=null;
		return p;
	}

	public void storeNewProduct(Product prod) {
		if(product != null)
			System.out.println("Product "+prod+" can not be stored as store is full");
		else product=prod;
	}
}
