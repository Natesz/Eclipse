import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class primeFactor {

	public static void main(String args[]) {
		
		
		List<BigInteger> prime = new ArrayList<BigInteger>();
		
		BigInteger number = new BigInteger("600851475143");
		BigInteger i = new BigInteger("2");
		BigInteger k = new BigInteger("1");
		
		
		while(!number.equals(i)) {
			if(number.mod(i).equals(BigInteger.ZERO)){
				number = number.divide(i);
				prime.add(i);
				System.out.println(i);
			}
			i=i.add(k);
			
		}
		
		prime.add(i);
		System.out.println(i);
		
	}
	
}
