package liskov;

public class BenzinCar implements Vehicle{
	@Override
	public void accelerate() {
		System.out.println("Accelerating a benzinCar...");
	}
	
	@Override
	public void fuelUp() {
		System.out.println("Tele a tank benzinnel...");
	}
}
