//import java.time.LocalDate;

public class Statistics {

	String day;
	String winner;
	
	public Statistics(String day, String winner) {
		setDay(day);
		setWinner(winner);
	}
	
		
	public String getDay() {
		return day;
	}
	
	public String getWinner() {
		return winner;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	@Override
	public String toString() {
		super.toString();
		return getDay() + getWinner();
	}
}
