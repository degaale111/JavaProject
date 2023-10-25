import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class VendingMachine {
	private List<Product> products;
	
	public VendingMachine (Collection<Product> initialProduct) {		
		products = new ArrayList<Product>();
		products.addAll(initialProduct);
	}	
	
	public void incrementaQuantitaProdotto(int pos, int qt) throws PositionIncorrectException{
		Product p = getProduct(pos);
		p.increaseQuantity(qt);
	}
	
	public int acquista(int pos, int value) throws ProductNotAvailableException, PositionIncorrectException{
		
		Product p = getProduct(pos);
			
		if(p.getPrice()>value) {
			throw new ProductNotAvailableException("insufficient value");
		}
		
		if(p.getQuantity()==0) {
			throw new PositionIncorrectException("insufficient quantity");
		}
		
		p.decreaseQuantity(1);
		
		return value - p.getPrice();
	}
		
	public Product getProduct(int pos) throws PositionIncorrectException {
		Product p = null;
		try{
			p = products.get(pos);
		}catch(IndexOutOfBoundsException e) {
			throw new PositionIncorrectException();
		}
		return p;
	}
	
}
