package strategyPatternPractice;

public abstract class Employee {
	long id;
	String name;
	String department;
	boolean working;
	
	public Employee(long id, String name, String department, boolean working) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.working=working;
	}
	
	public abstract void employeeDuties();
	
	public String toString() {
		return "id: " + id + ",name: " + name;
	}
}
