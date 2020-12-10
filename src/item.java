
public class item {
		
	private double vat;
	private String type;
	private double price;
	private String expiry;
	
	public item() {
		
		String type;
		String expiry;
		double vat;
		double price;
	}
	
	public item(String type, double vat, double price) {
		
		this.type = type;
		this.vat = vat;
		this.price = price;
	}
	
	public item(String type, String expiry, double vat, double price) {
		
		this.type = type;
		this.expiry = expiry;
		this.vat = vat;
		this.price = price;
	}
	
	
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