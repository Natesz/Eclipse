package observerPattern;

public class App {
	public static void main(String args[]) {
		WeatherStation weatherStation = new WeatherStation();
		Observer observer = new WeatherObserver();
		Observer observer2 = new TemperatureObserver();
		
		weatherStation.addObserver(observer);
		weatherStation.addObserver(observer2);
		
		weatherStation.setHumility(100);
		weatherStation.setHumility(140);
		weatherStation.setTemperature(100);
		weatherStation.setHumility(100);
	}
}
