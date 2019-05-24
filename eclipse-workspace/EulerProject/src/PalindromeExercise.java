import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class PalindromeExercise {

	public static void main(String[] args) {
		
		int maxPalindrome = 0;
		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {
				
			int testPalindrome = i*j;
						
			if(isPalindromeNumber(testPalindrome)) {
				if (maxPalindrome < testPalindrome) {
					maxPalindrome = testPalindrome;
				}
			}
		}
	}
		
		System.out.println(maxPalindrome);

	
}
	private static boolean isPalindromeNumber(int number) {
		StringBuilder baseNumber  = new StringBuilder(number+"");
		StringBuilder stringNumber  = new StringBuilder(number+"");
		baseNumber.reverse();
		
		return baseNumber.toString().equals(stringNumber.toString());
	}
}
