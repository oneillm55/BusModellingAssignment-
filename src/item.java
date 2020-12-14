import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class item {
		
	private double vat;
	private String type;
	private double price;
	private String expiry;
	private String id;
	private Date date;
	
	public item() {
		
		String id;
		String type;
		String expiry;
		double vat;
		double price;
	}
	
	public item(String id, String type, String expiry, double vat, double price) {
		
		this.id = id;
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
		return "ID: " + id + " Type: "+ type + " Vat: "+ vat +"%" + " Price: " + price + " Expiry date: " + expiry ;
		
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Date getDate() {
		
		Date date1 = null;
		try {
			 date1 = new SimpleDateFormat("dd/MM/yyyy").parse(this.expiry);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date1;
	}
	
	
}