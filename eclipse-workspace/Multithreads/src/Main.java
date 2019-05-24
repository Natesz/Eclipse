import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		
		ArrayList<ArrayList<Double>> randomNumLists = new ArrayList<ArrayList<Double>>();
		
		long startTime = System.currentTimeMillis(); 
		
		for(int i=0;i<10;i++) {
			randomNumLists.add(new ArrayList<Double>());
		
		
			for(int j=0;j<100;j++) {
				randomNumLists.get(i).add(Math.random()*100);
			}
		}	
		
	/*	ArrayList<Thread> joinedThreads = new ArrayList<Thread>();
		for(ArrayList<Double> list : randomNumLists) {
			
			System.out.println("Firing up new thread");
			
			Thread t = new Thread(new Runnable()
			{
				
				@Override
				public void run(){
					
					Collections.sort(list);
					System.out.println("Finished sorting");
				}	
			});
			
			t.start();
			joinedThreads.add(t);
		}	
		
		for(int i=0;i<joinedThreads.size();i++) {
			try {
				joinedThreads.get(i).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*for(ArrayList<Double> list: randomNumLists) {
			Collections.sort(list);
		}*/
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		System.out.println(Runtime.getRuntime().freeMemory());
		
		
		
	
		
		System.out.println("Took " + (System.currentTimeMillis() - startTime) + " millisec.");
	}
}
