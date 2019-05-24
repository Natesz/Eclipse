package visitorPattern;

public interface ShoppingCartVisitor {

	public double visit(Chair chair);
	public double visit(Laptop laptop);
	public double visit(Table table);
}
