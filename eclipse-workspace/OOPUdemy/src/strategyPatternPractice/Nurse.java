package strategyPatternPractice;

public class Nurse extends Employee{

	public Nurse(long id, String name, String department, boolean working) {
		super(id,name,department,working);
	}
	
	public void takingBlood() {
		System.out.println("Taking blood...");
	}
	
	public void employeeDuties() {
		takingBlood();
	}
}
