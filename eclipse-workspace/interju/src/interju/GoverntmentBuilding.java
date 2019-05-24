package interju;

public class GoverntmentBuilding extends Building{
	
	private String name;
	
	public GoverntmentBuilding(int peopleNum, int age, String name){
		super(peopleNum, age);
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
}
