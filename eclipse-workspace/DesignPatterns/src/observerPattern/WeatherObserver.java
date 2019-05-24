package observerPattern;

public class WeatherObserver implements Observer{
	public void update(int temperature, int humility) {
		System.out.println("temperature:" +temperature + " huimlity:" +humility);
	}
}
