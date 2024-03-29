package visitorPattern;

public class Table implements ShoppingItem {

	String type;
	double price;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Table(String type, double price) {
		
		this.type = type;
		this.price = price;
	}
	
	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
