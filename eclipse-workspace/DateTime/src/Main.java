import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Set;

public class Main {
	public static void main(String args[]) {
		
		
		LocalDate date = LocalDate.of(2019, Month.MARCH, 26);
		LocalTime time = LocalTime.of(15, 24);
		
		date = date.plusYears(1000);
		System.out.println(date);
		
		System.out.println(date.getDayOfWeek());
		
		/*LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		System.out.println(dateTime);
		
		dateTime = dateTime.plusHours(121);
		
		System.out.println(dateTime);
		System.out.println(time);
		
		Duration duration = Duration.between(dateTime, dateTime.minusDays(2));
		System.out.println(duration.getSeconds());
		
		Set<String> zoneId = ZoneId.getAvailableZoneIds();*/
		
		/*for(String zone: zoneId) {
			System.out.println(zone);
			onlyCity(zone);
			System.out.println("++++++++++");
		}*/
	}
	
	public static void onlyCity(String zone) {
		String orszag = "";
		String city = "";
		
		String[] items = zone.split("/");
		orszag = items[0];
		
		if(items.length>1) {
			city = items[1];
		}
		
		System.out.println(city);
	}
}
