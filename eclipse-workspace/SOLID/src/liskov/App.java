package liskov;

public class App {
	public static void main(String args[]) {
		ElectricCar ec = new ElectricCar();
		ec.accelerate();
		ec.chargeUp();
		
		IElectricCar ec2 = new ElectricCar();
		ec2.accelerate();
		ec2.chargeUp();
		
		Vehicle car = new BenzinCar();
		car.accelerate();
		car.fuelUp();
		
		BenzinCar car2 = new BenzinCar();
		car2.accelerate();
		car2.fuelUp();
	}
}
