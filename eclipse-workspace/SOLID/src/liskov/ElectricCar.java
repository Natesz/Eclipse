package liskov;

public class ElectricCar implements IElectricCar{
	public void accelerate() {
		System.out.println("Electric car accelerating...");
	}
	
	public void chargeUp() {
		System.out.println("Charging up");
	}
}
