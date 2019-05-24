package strategyPatternPractice;

public class Doctor extends Employee{
	
	public Doctor(long id, String name, String department, boolean working) {
		super(id,name,department,working);
	}
	
	public void employeeDuties() {
		writeRecipe();
	}
	
	public void writeRecipe() {
		System.out.println("Writeing recipe...");
	}
}
