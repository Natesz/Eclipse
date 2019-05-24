package puzzle2;

public class Main {
	public static void main(String args[]) {
		System.out.println(sumOfTwo(1,2,3));
		System.out.println(sumOfTwo(1,2,1));
		System.out.println(sumOfTwo(3,2,1));
		System.out.println(sumOfTwo(2,2,3));
		System.out.println(sumOfTwo(10,5,5));
	}
	
	public static boolean sumOfTwo(int a, int b, int c) {
		
		return (a+b==c) || (a+c==b) || (c+b==a);
	}
}
