package interju;

public class staircase {
	
	public static boolean simpleFunction(int num) {
		if(num>=0) {
			return false; 
		}else {
			return true;
		}
	}
	public static void main(String args[]) {
		int n=6;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(j<n-i) {
				System.out.print(" ");
				}else {
					System.out.print("x");
				}
			}
			
			System.out.println();
		}
		
		System.out.println(simpleFunction(5));
	}
	
	
}
