
public class sumSquareDiff {
	public static void main(String args[]) {
		
		double sumOfTheSquares = 0;
		double squaresOfTheSum = 0;
		double sum = 0;
		for(int i=1;i<=100;i++) {
			sumOfTheSquares = Math.pow(i,2) + sumOfTheSquares;
		}
		
		for(int i=1;i<=100;i++) {
			sum = i + sum;
		}
		squaresOfTheSum = Math.pow(sum,2);
		
		System.out.println(squaresOfTheSum);
		System.out.println(sumOfTheSquares);
		
		System.out.printf("%.0f%n", squaresOfTheSum - sumOfTheSquares);
	}
	
}
