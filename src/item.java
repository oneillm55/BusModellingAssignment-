
public class item {
		
	private double vat;
	private String type;
	private double price;
	private String expiry;
	private double basketTotal;
	private int qty;
	
	public item() {
		
		String type;
		String expiry;
		double vat;
		double price;
		double vatamt;
		double basketTotal;
		int qty;
	}
	
	public item(String type, double vat, double price, int qty) {
		
		this.type = type;
		this.vat = vat;
		this.price = price;
		this.qty = qty;
	}
	
	public item(String type, String expiry, double vat, double price) {
		
		this.type = type;
		this.expiry = expiry;
		this.vat = vat;
		this.price = price;
	}
	
	/*
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	*/
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public double basketTotal(double basketTotal) {
		
		//should probably go in the shopping basket class.
		
		double pric = this.price;
		double vt = this.vat;
		double vatamt = price*vt/100;
		
		basketTotal = pric + vatamt;
		return basketTotal;
	}
	
	public String toString()
	{
		return "Item type: "+ type + " Vat: "+ vat +"%" + "Price: " + price + " cd EURO" + "Expiry date:" + expiry ;
		
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	
	
}