import java.util.ArrayList;
import java.util.List;

public class fibonacci {
	
	public static void main(String args[]) {
		
		List<Integer> fibonacci = new ArrayList<Integer>();
		int fib1 = 1;
		int fib2 = 2;
		
		int fib = 0;
		
		
		while (fib<4000000){
			if (fib % 2 == 0) { 
			fibonacci.add(fib);
			};
			fib = fib1 + fib2; 
			fib1 = fib2;
			fib2 = fib;
		} 
		
		int sum = 0; 
		for(Integer fibo : fibonacci) {
			sum = sum + fibo;
			System.out.println(fibo);
			
		}
		
		
		
	}

}
