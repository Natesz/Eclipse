package builderPattern;

public class App {
	public static void main(String args[]) {
		User atesz = new User.Builder("Atesz").getAge(15).build();
		System.out.println(atesz);
	}
}
