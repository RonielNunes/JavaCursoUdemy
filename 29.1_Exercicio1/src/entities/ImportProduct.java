package entities;

public class ImportProduct extends Product{
	private Double customsFree;
	
	public ImportProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	public Double totalPrice() {
		return customsFree + super.getPrice();
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " $ " + totalPrice() + " Customs Free: $ " + customsFree;
	}
 
}
