package coffeeHomework;

public class CoffeeShop {
	
	public static void main(String args[]){
		
		
		Customer robert = new Customer("Robert", "French Vanilla");
		Customer bill = new Customer("Bill", "Hot Coffee");
		
		CoffeeAttendant coffeeAttendent = new CoffeeAttendant();
		coffeeAttendent.takeOrder(robert);
		coffeeAttendent.takeOrder(bill);
		
		// prepare drink
		coffeeAttendent.prepareDrink("French Vanilla");
		coffeeAttendent.prepareDrink("Hot Coffee");

		// order up...
		coffeeAttendent.callOutCompletedOrders();
	}
}