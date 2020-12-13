
public class basket extends item{

	//String type;
	int quantity;
	public basket() {
		
		String type;
		int quantity;
		
	}
	
	public basket(int quantity) {
		
		this.quantity = quantity;
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}

	@Override
	public double getVat() {
		// TODO Auto-generated method stub
		return super.getVat();
	}

	@Override
	public void setVat(double vat) {
		// TODO Auto-generated method stub
		super.setVat(vat);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}

	@Override
	public double basketTotal(double basketTotal) {
		// TODO Auto-generated method stub
		return super.basketTotal(basketTotal);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String getExpiry() {
		// TODO Auto-generated method stub
		return super.getExpiry();
	}

	@Override
	public void setExpiry(String expiry) {
		// TODO Auto-generated method stub
		super.setExpiry(expiry);
	}

	public int getQuantity() {
		
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
	}
	
	
}
