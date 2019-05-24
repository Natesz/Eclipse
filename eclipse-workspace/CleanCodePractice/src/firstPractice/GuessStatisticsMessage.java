package firstPractice;

public class GuessStatisticsMessage {
	private String number;
	private String verb;
	private String pluralModifier;
	
	public String make(char candidate, int count){
		getMessageWithPlural(count);
		return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
		//System.out.println(guessMessage);
	}
	
	private void getMessageWithPlural(int count) {
		if(count==0) {
			thereAreNoLetters();
		}else if(count==1) {
			thereIsOneLetter();
		}else {
			thereIsManyLetters(count);
		}
		
		
		
	}
	
	 private void thereAreNoLetters() {
		number = "no";
		verb="are";
		pluralModifier="s";
	 }
	 private void thereIsOneLetter() {
		number = "1";
		verb="is";
		pluralModifier= "";
	 }
	 private void thereIsManyLetters(int count) {
		number= Integer.toString(count);
		verb="are";
		pluralModifier="s";
	 }
	
	
}
