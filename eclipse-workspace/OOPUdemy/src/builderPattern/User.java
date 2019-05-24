package builderPattern;

public class User {
	String name;
	String lastName; //optional
	int age; //optional
	String email; //optional
	
	private User(Builder builder) {
		this.name=builder.name;
		this.lastName=builder.lastName;
		this.age=builder.age;
		this.email=builder.email;
	}
	
	public String toString() {
		return name + " " + lastName + " " + age + " " + email; 
	}
	
	
	public static class Builder{
		String name;
		String lastName;
		int age;
		String email;
		
		public Builder(String name) {
			this.name=name;
		}
		
		public Builder getLastName(String value) {
			this.lastName = value;
			return this;
		}
		public Builder getAge(int value) {
			this.age = value;
			return this;
		}
		public Builder getEmail(String value) {
			this.email = value;
			return this;
		}
		
		public User build(){
			return new User(this);
		}
		
		
	}
}
