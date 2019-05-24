package liskovPrinciple;

public class EnglishTeacher extends SchoolStuff implements CourseIntructor{
	public void teach() {
		System.out.println("Teaching inglish");
	}
}
