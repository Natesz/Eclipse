
public class highlyDivTriangNumber {
	public static void main(String[] args) {
		long i=1;
		long sum = 0;
	    long numOfDivisors = 0;
		while(numOfDivisors<500) {
			sum = sum +i;
			
			numOfDivisors = numOfDiv(sum);
			
			//System.out.println(sum + ": "+ numOfDivisors);
			i++;
		}
		
		System.out.println(sum + " :"+numOfDivisors);
	}
	
	public static long numOfDiv(long number) {
		long count = 0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		return count;
	}
}
