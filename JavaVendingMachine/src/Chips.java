public class Chips extends Product {
	private String flavour;
	private int cost;
	
	public Chips(int quantity, int cost, String flavour) {
		super(quantity);
		this.cost = cost;
		this.flavour = flavour;
	}

	public String getFlavour() {
		return flavour;
	}
	
	@Override
	public int getPrice() {
		return cost;
	}
	
}
