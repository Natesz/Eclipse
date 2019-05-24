
public class Main {

	public static void main(String args[]){
		
		//HashMap<String,Statistics> map1 = new HashMap<>();
		StatisticsManager statman = new StatisticsManager();
		
		Statistics statistics1 = new Statistics("ma", "Atesz");
		
		
		Statistics statistics4 = new Statistics("holnap", statman.getAtesz("Atekhjkvbsz"));
		Statistics statistics2 = new Statistics("tegnap", "Bobi");
		Statistics statistics3 = new Statistics("2017.1.1", "Beks");

		statman.addStatistic("game1", statistics1);
		statman.addStatistic("game2", statistics2);
		statman.addStatistic("game3", statistics3);
		statman.addStatistic("game4", statistics4);
		
	
		System.out.println(statman.getStatisticsByWinner("Atesz"));
		
		/*void persistsStatistics(Statistics statistics) {
			map1.put(, statistics);
		}*/
		
		
		/*Statistics statistics1 = new Statistics(LocalDate.now(), "Atesz");
		List<Statistics> stat1 = new ArrayList<Statistics>();
		static HashMap<String,Statistics> map1 = new HashMap<>();*/
		
		
		//System.out.println((map1.get("Kenny")).getWinner());
		
		
		
	}
	
}
