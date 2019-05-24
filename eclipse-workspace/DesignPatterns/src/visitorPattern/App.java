package visitorPattern;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		ShoppingItem chair = new Chair("faszEk", 15);
		ShoppingItem chair2 = new Chair("faszEk2", 155);
		ShoppingItem laptop= new Laptop("Dell", 125);
		ShoppingItem table = new Table("Lenovo", 1115);
		
		List<ShoppingItem> shoppingList = new ArrayList<ShoppingItem>();
		
		shoppingList.add(chair);
		shoppingList.add(chair2);
		shoppingList.add(laptop);
		shoppingList.add(table);
		
		double sum = 0;
		
		ShoppingCartVisitor shoppingCart = new ShoppingCart();
		
		for(ShoppingItem item: shoppingList) {
			sum = sum + item.accept(shoppingCart);
		}
		
		System.out.println(sum);
	}
}
