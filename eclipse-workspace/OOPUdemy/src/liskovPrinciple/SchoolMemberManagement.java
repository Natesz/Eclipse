package liskovPrinciple;

public class SchoolMemberManagement {
	public static void main(String args[]) {
		MathTeacher matekTanar = new MathTeacher();
		EnglishTeacher angolTanar = new EnglishTeacher();
		SubstituteTeacher csereTanar = new SubstituteTeacher();
		
		matekTanar.performOtherResponsibilities();
		matekTanar.teach();
		
		angolTanar.performOtherResponsibilities();
		angolTanar.teach();
		
		csereTanar.performOtherResponsibilities();
		
	}
}
