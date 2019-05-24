package puzzle;

public class Main {
	public static void main(String args[]) {
		System.out.println(fineAmount(60,false));
		System.out.println(fineAmount(80,false));
		System.out.println(fineAmount(100,false));
		System.out.println(fineAmount(85,true));
	}
	
	public static int fineAmount(int speed, boolean isHoliday) {
		int extraSpeedLimit = 0;
		int MIN_SPEED_LIMIT = 60;
		int MAX_SPEED_LIMIT = 80;
		
		if(isHoliday) {
			extraSpeedLimit =+ 5;
		}
		
		if(speed <= MIN_SPEED_LIMIT+ extraSpeedLimit) {
			return 0;
		}else if((speed > MIN_SPEED_LIMIT+ extraSpeedLimit) && (speed <= MAX_SPEED_LIMIT+ extraSpeedLimit)) {
			return 100;
		}else {
			return 200;
		}
	}
}
