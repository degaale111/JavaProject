
public class Croissant extends Product {
	private int baseCost;
	private boolean big;

	public Croissant(int baseCost, boolean big, int quantity) {
		super(quantity);
		this.baseCost = baseCost;
		this.big = big;
	}

	@Override
	public int getPrice() {
		return (big?2:1) *baseCost;
	}
}
