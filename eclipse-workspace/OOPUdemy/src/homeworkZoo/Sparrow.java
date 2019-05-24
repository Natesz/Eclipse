package homeworkZoo;

public class Sparrow extends Bird implements Flyable{
	
	public Sparrow(int age, String name, int wingLength) {
		super(age,name,wingLength);
	}
	
	public void fly() {
		System.out.println("I am flying...");
	}
}
