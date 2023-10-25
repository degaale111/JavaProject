public abstract class Product {
	private int quantity;
	
	public Product (int quantity) {
		if (quantity <0) quantity = 0;
		else this.quantity = quantity;
	}

	public abstract int getPrice();
	
	public int getQuantity() {
		return quantity;
	}

	public void increaseQuantity(int quantity) {
		this.quantity += quantity;
	}

	public void decreaseQuantity(int quantity) {
		this.quantity -= quantity;
	}
}
