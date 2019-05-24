package udemyJava;

public class EmberBuilder {
	int age;
	String name;
	String nem;
	int bjj;
	
	public EmberBuilder setAge(int age) {
		this.age=age;
		return this;
	}
	
	public EmberBuilder setName(String name) {
		this.name=name;
		return this;
	}
	
	public EmberBuilder setNem(String nem) {
		this.nem=nem;
		return this;
	}
	
	public EmberBuilder setBjj(int bjj) {
		this.bjj=bjj;
		return this;
	}
	
	public Ember create() {
		return new Ember(age,name,nem,bjj);
	}
	
	
}
