package homeworkZoo;

public abstract class Animal {
	int age;
	String name;
	int weightInPound;
	String sex;
	
	public Animal(int age, String name) {
		this.age=age;
		this.name=name;
		
	}
	
	public Animal(int age, String name, int weightInPound, String sex) {
		this.age=age;
		this.name=name;
		this.weightInPound=weightInPound;
		this.sex=sex;
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public abstract void move();
}
