package visitorPattern;

public class ShoppingCart implements ShoppingCartVisitor{

	@Override
	public double visit(Chair chair) {
		return chair.getPrice();
	}

	@Override
	public double visit(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptop.getPrice();
	}

	@Override
	public double visit(Table table) {
		return table.getPrice();
	}
	
	
}
