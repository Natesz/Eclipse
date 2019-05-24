package udemyJava;

public class Ember {
	int age;
	String name;
	String nem;
	int bjj;
	
	public Ember(int age, String name,String nem, int bjj) {
		this.age=age;
		this.name=name;
		this.nem=nem;
		this.bjj=bjj;
	}
	
	public String toString() {
		 return "age> " + age +"name: " + name + "nem: " +nem +"bjj> "+bjj;
	}
}
