package Consumer_Producer_Kiosk_Solution2;

public final class Kiosk {

	private Product product;

	public Product consumeProduct() {
		Product p=null;
		synchronized (this) {
			if (product == null) {
				try {wait();}
				catch (InterruptedException e) {e.printStackTrace();}
				p = product; // is not null anymore
				product = null;
			}
			return p;
		}
	}

	public void storeNewProduct(Product prod) {
		synchronized (this) {
				product = prod;
				notify();
		}
	}
}
