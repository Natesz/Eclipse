package interju;

public class Shop {
	public static void main(String args[]) {
		
		
		Phone phone = new PhoneBuilder().setBattery(1000).setOs("asd").getPhone();
	
		int val = 10;
		switch (val)
		{
		case 1:
		System.out.println("Orange");
		break;
		case 2:
		System.out.println("Pear");
		break;
		default:
		System.out.println("Apples!");
		break;
		}
			
		String in = "hello";
		String out = in.replaceAll("l", "");
		in = out.toUpperCase();
		System.out.println(in);
		
		String lowercaseString = "this is a very long lower case string";
		// Your code here
		lowercaseString = lowercaseString.substring(0,1).toUpperCase() + lowercaseString.substring(1);
		System.out.println(lowercaseString);
		
		Person person1 = new Person("",7);
		Person[] personArray = new Person[5];
		
		for(int i=0;i<personArray.length;i++) {
			personArray[i]=new Person("",i);
		}
		
		System.out.println(person1.age);
		System.out.println(personArray[1].age);
		
		//String[] myArray = new String[];
		//String[] myArray = { "Hey", "Bye", "Hello" };
		//int myArray = new int[10];
		//int[] myArray = new int[10];
	}

	


}
*-+63
+++++++++++++++++++++=
\`z|CV\