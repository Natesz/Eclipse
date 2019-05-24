package person;

public class Person {
	String name;
	String job;
	Gender gender;
	int age;
	
	
	
	public String toString() {
		return "name: " + name+ " job: "+job+" gender: " + gender+" age: "+age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, String job, Gender gender, int age) {
		
		
		this.name = name;
		this.job = job;
		this.gender = gender;
		this.age = age;
		
	}
	
	public static Person makePerson(String name, String job, Gender gender, int age) {
		if(age>2017 || age<1900) {
			return null;
		}
		return new Person(name,job,gender,age);
	}
}
