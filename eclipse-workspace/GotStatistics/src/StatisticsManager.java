import java.time.LocalDate;

import java.util.*;

public class StatisticsManager {
	
	private HashMap<String,Statistics> map1 = new HashMap<>();
	
	public List<Statistics> getAllStatistics(){
		List<Statistics> stat1 = new ArrayList<Statistics>();
		Set<String> keys = map1.keySet();
		
		for(String key: keys) {
			stat1.add(map1.get(key));
		}
		
		return stat1;
	}
	
	public List<Statistics> getStatisticsByWinner(String winner){
		List<Statistics> stat1 = new ArrayList<Statistics>();
		Set<String> keys = map1.keySet();
		
		for(String key: keys) {
			if((map1.get(key).getWinner()).equals(winner)) {
			stat1.add(map1.get(key));
			
			}
			
		}
		
		return stat1;
	}
	
	public List<Statistics> getStatisticsByDate(String date){
		List<Statistics> stat1 = new ArrayList<Statistics>();
		Set<String> keys = map1.keySet();
		
		for(String key: keys) {
			stat1.add(map1.get(key));
		}
		
		return stat1;
	}
	
	public Map<String,Statistics> persistsStatistics(Map<String,Statistics> map) {
		
		return map;
	}
	
	public String getAtesz(String str) {
		str = "Atesssssssssssz";
		return str;
	}

	public void addStatistic(String key, Statistics stat) {
		map1.put(key, stat);
		
	}
	
	
	
	/*public static void editlist(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			if(l2.contains(it.next()))
				it.remove();
		}
	}*/
}
