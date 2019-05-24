package person;

public class App {
	public static void main(String[] args) {
		Person person = Person.makePerson("Atesz","Programozo",Gender.MALE,1991);
		Person person1 = Person.makePerson("Atesz","Programozo",Gender.MALE,1991);
	
		System.out.println(person.age);
		System.out.println(person.name);
		System.out.println(person.job);
		System.out.println(person.getGender());
		
		System.out.println(person1);
		
		System.out.println(person.equals(person1));
	}
}
