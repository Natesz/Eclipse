package interju;

public class Building {
	
	private int peopleNum;
	private int age;
	private int cost;
	
	public Building(int peopleNum, int age) {
		this.peopleNum = peopleNum;
		this.age = age;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getPeopleNum() {
		return peopleNum;
	}
	
	public void ageBuilding() {
		age = age+1;
	}
}
