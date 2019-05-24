package coffeeHomework;

public class Customer implements WaitingCustomer {
	String name;
	String drinkOrdered;
	
	public Customer(String name, String drinkOrdered) {
		this.name=name;
		this.drinkOrdered = drinkOrdered;
	}
	
	public void orderReady(String preparedDrink) {
		if(preparedDrink.equals(drinkOrdered)) {
			exit();
		};
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDrinkOrdered() {
		return drinkOrdered;
	}

	public void setDrinkOrdered(String drinkOrdered) {
		this.drinkOrdered = drinkOrdered;
	}

	public void exit() {
		System.out.println("kapjatok be gyikok, en leleptem");
	}
}
