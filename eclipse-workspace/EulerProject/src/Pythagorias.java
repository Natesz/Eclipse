import java.util.HashSet;

public class Pythagorias {
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=1;i<=1000;i++) {
			set.add(i);
		}
		
		for(int i=1;i<1000;i++) {
			for(int k:set) {
				for(int j:set) {
				if((i+k+j==1000) && (k>i) && (i>j) && ((k*k) == (i*i) + (j*j))){
					System.out.println(k);
					System.out.println(i);
					System.out.println(j);
				}
				}
			}
		}
	}
	
}
