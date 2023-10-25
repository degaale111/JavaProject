public class CocaCola extends Product{
	private String type;
	private int cost;

	public CocaCola(int quantity, String type, int cost) {
		super(quantity);
		this.type = type;
		this.cost = cost;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public int getPrice() {
		return cost;
	}
	
	
	
	

}
