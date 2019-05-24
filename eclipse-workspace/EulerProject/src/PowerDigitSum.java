
public class PowerDigitSum {
	public static void main(String args[]) {
		long a = (long) Math.pow(2,1000);
		String aa = a+""; 
		int sum=0;
		for(int i=0;i<aa.length();i++) {
			char b= aa.charAt(i);
			int bb = (int) b -48;
			
			sum = sum+bb;
		}
		System.out.println(a);
		System.out.println(sum);
	}
}
