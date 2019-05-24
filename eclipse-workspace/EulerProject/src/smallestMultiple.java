
public class smallestMultiple {

	public static void main(String args[]) {
		boolean isTheSmallestMultiple = true;
		int i = 2521;
		
		while(isTheSmallestMultiple) {
			i = i+1;
			if(isDivideabeLessThan20(i)) {
				isTheSmallestMultiple = false;
			}
			
			System.out.println(i);
		}
		
		System.out.println(i);
	}

	private static boolean isDivideabeLessThan20(int i) {
		return (i%20==0)&&(i%19==0)&&(i%18==0)&&(i%17==0)&&(i%16==0)&&(i%15==0)&&(i%14==0)&&(i%13==0)&&(i%12==0)&&(i%11==0);
	}
}
