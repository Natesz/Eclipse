package stackHeap;

public class Main {
	public static void main(String args[]) {
	
		Car car1 = new Car();
		car1.horsePower = 5;
		Engine engine1 = new Engine();
		car1.myEngine = engine1;
		
		//engine1.numberOfDugattyu = 4;
		engine1.type = "asdasd";
		
		System.out.println(car1.myEngine.numberOfDugattyu);
		System.out.println(car1.myEngine.type);
		System.out.println(car1.horsePower);
	}
}
