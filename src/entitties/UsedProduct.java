package entitties;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	//Constructors
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	//Getters and Setters
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufacturedate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	//Actions
	
	@Override
	public String priceTag() {
		return name
				+ " (used) $ "
				+ price
				+ " Manufacture date: "
				+ sdf.format(manufactureDate);
	}
		
}
