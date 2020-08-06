package entitties;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	//Constructors
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	//Getters and Setters
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	//Actions
	
	public double totalPrice() {
		return price + customsFee;
	}

	@Override
	public String priceTag() {
		return name
				+ " $ "
				+ totalPrice()
				+ " (Customs fee: $ "
				+ customsFee
				+ ")";
	}
		
}
