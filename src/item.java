import java.util.ArrayList;

public class item {
		
	ArrayList<item> List;
	private double vat;
	private String type;
	private double price;
	
	public item() {
		
		String type;
		double vat;
		double price;
		int test;
	}
	
	public item(String type, double vat, double price) {
		
		this.type = type;
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
		return "Item type: "+ type + " Vat: "+ vat +"%" + "Price: " + price + " cd EURO";
		
	}
	
	
}