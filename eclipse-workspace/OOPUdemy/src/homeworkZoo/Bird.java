package homeworkZoo;

public class Bird extends Animal{
	int age;
	String name;
	int wingLength;
	
	
	public Bird(int age, String name, int wingLength) {
		super(age, name);
		this.wingLength = wingLength;
		
	}
	
	public void move() {
		System.out.println("Flapping wings...");
	}
}
