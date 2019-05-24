import java.util.ArrayList;
import java.util.List;

public class MultiplesOf3And5 {
	
	
	public static void main(String args[]) {
		List<Integer> subWithThree = new ArrayList<Integer>();
		List<Integer> subWithFive = new ArrayList<Integer>();
		
		for (int i=0;i<1000;i++) {
			if (i%3 == 0) {
				subWithFive.add(i);
			}
		}
		
		
		for (int i=0;i<1000;i++) {
			if (i%5 == 0) {
				subWithFive.add(i);
			}
			
		}
		for (int i : subWithFive) {
			System.out.println(i);
			}
		
		System.out.println("ez utan kiveszem a kozoset");
		
		for (int i=0;i<subWithFive.size();i++) {
			if (subWithFive.get(i) % 3 == 0 && subWithFive.get(i) % 5 ==0) {
				subWithFive.remove(i);
			}
		}
				for (int i : subWithFive) {
					System.out.println(i);
					}
				
				for (int i=0;i<1000;i++) {
					if (i % 3 == 0 && i % 5 ==0) {
						subWithFive.add(i);
					}
				}	
				
				for (int i : subWithFive) {
					System.out.println(i);
					}
		
				int sum = 0;
				for (int i : subWithFive) {
					sum = sum + i;
				
					}
		
				System.out.println(sum);
		
		
	}
}
