package entitties;

public class Product {

	protected String name;
	protected Double price;
	
	//Constructors
	
	public Product() {
		
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	//Gettes and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	//Actions

	public String priceTag() {
		return name 
				+ " $ " 
				+ price;
	}
	
}
