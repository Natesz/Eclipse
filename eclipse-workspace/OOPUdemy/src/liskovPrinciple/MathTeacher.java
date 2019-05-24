package liskovPrinciple;

public class MathTeacher extends SchoolStuff implements CourseIntructor{
	public void teach() {
		System.out.println("Teaching matek");
	}
}
