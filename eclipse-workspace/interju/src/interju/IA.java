package interju;

import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

class Employee{
	String name;
	int age;
	int test;
	
	Employee(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	Employee(String name, int age, int test){
		this.name=name;
		this.age=age;
		this.test=test;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getTest() {
		return test;
	}
	

	public String getName() {
		return name;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee employee = (Employee) obj;
        return employee.getAge() == this.getAge()
                && employee.getName() == this.getName()
                  && employee.getTest() == this.getTest();
    }
	
	
    public int hashCode() {
        int result=17;
        result=31*result+age+test;
        result=31*result+(name!=null ? name.hashCode():0);
        return result;
    }
}

public class IA {
	public static void main(String args[]) {
		
		Employee emp1 = new Employee("Attila",27,15);
		Employee emp2 = new Employee("Attila",27);
		HashSet<Employee> set = new HashSet<Employee>();
		
		set.add(emp1);
		System.out.println(set.contains(emp2));
		System.out.println(emp1.equals(emp2));
		System.out.println("employee.hashCode():  " + emp1.hashCode()
        + "  employee2.hashCode():" + emp2.hashCode());
		
		String str1 = "asdasd";
	    String str2 = "asasdd";
		boolean bool = isAnagram(str1,str2);
		//System.out.println(bool);
	}
	
	
	
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char[] char1 = str1.toCharArray(); 
		char[] char2 = str2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		/*for(int i=0;i<char1.length;i++) {
			if(char1[i]!=char2[i]) {
				return false;
			}
		}*/
		return Arrays.equals(char1,char2);
	}
}
