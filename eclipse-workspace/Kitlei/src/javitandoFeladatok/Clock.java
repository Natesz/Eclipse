package javitandoFeladatok;

public class Clock{
	public static void main(String[] args){
		int minutes = 0;
		for (int ms = 0; ms < 3600000; ms++){
			if (ms % 60000 == 0 ){
				minutes++;
			}
		}
		System.out.println(minutes);
	}
}
