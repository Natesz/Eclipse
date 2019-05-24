package homeworkZoo;

public class Fish extends Animal{
	int age;
	String name;
	
	
	
	public Fish(int age, String name) {
		super(age,name);
	}
	
	
	public void move() {
		System.out.println("swimming...");
	}
}
