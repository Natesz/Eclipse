
public class LongestCollactz {
	public static void main(String[] args) {
		int max = 0;
		int maxIndex = 0;
		for(int j=1;j<1000000;j++) {
			//System.out.print(j+": ");
			int i=j;
			int count = 0;
			while(i!=1) {
				//System.out.print(i+" ");
				if(i%2==0) {
					i=i/2;
					count++;
				}else {
					i=3*i+1;
					count++;
				}
				
			}
			if(count>max) {
				max = count;
				maxIndex = j;
			}
			//System.out.print("chain size: " + count+" current max chainSize: " +max +"which is countains to: "+j);
			//System.out.println();
		}
		System.out.println(maxIndex);
	}
}
