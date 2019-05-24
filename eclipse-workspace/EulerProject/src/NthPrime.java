import java.util.ArrayList;
import java.util.List;

public class NthPrime {
	
	static List<Integer> primeNumbers = new ArrayList<Integer>();
	
	public static void main(String args[]) {
		int nthPrime = 1;
		int number = 3;
		
		primeNumbers.add(2);
		while(nthPrime!= 2) {
			
				if(isPrime(number)) {
					primeNumbers.add(number);
					nthPrime++;
				}
			
			number++;
		}
		
		System.out.println(primeNumbers);
	}
	
	public static boolean isPrime(int n) {
		for(int i: primeNumbers) {
			if(n%i==0) {
				return false;
			}
		}
		
		
		return true;
	}
}
