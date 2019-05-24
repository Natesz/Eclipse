import java.util.ArrayList;
import java.util.List;

public class SumPrimes {
	
	static List<Long> primeNumbers = new ArrayList<Long>();
	
	public static void main(String args[]) {
		int nthPrime = 1;
		long number = 3;
		long sum = 2;
		
		primeNumbers.add(sum);
		while(number != 2000000) {
			
				if(isPrime(number)) {
					sum = sum+number;
					primeNumbers.add(number);
					
				}
			
			number++;
			
		}
		System.out.println(sum);
		
	}
	
	public static boolean isPrime(long n) {
		for(long i: primeNumbers) {
			if(n%i==0) {
				return false;
			}
		}
		
		
		return true;
	}
}
