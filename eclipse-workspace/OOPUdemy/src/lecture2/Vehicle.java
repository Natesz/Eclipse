package lecture2;

public class Vehicle {
	Engine engine;
	
	public Vehicle(Engine engine) {
		this.engine = engine;
	}
	
	public void accelerate() {
		System.out.println("Accelerating...");
	}
	
	public void operateVehicle() {
		engine.start(); 
	}
}
