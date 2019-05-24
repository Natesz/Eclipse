package threeIntSum;

import java.util.HashSet;

public class App {
	public static void main(String args[]) {
		int[] testArray = new int[100];
		for(int i=0;i<testArray.length;i++) {
			testArray[i]=i+2;
		}
		
		int targetSum=120;
		int[] result = new int[3];
		result = findThreeNumber(testArray, targetSum);
		for(int i:result) {
			System.out.println(i);
		}
	}
	
	public static int[] findThreeNumber(int[] array, int targetSum) {
		int[] result = new int[3];
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i: array) {
			set.add(i);
		}
		
		/*for(int i:array) {
			for(int j:array) {
				if(i<j &&(targetSum/i/j!=i)&&(targetSum/i/j!=j)&& set.contains(targetSum/i/j) && targetSum%i==0 && targetSum%j==0) {
					result[0]=i;
					result[1]=targetSum/i/j;
					result[2]=j;
				
				}
			}
		}*/
		
		for(int i:array) {
			for(int j:array) {
				for(int k:array) {
					if((i*j*k==targetSum) && (i>j) && (j>k)) {
						result[0]=i;
						result[1]=j;
						result[2]=k;
					}
				}
			}
		}
		
		
		
		return result;
	}
}
