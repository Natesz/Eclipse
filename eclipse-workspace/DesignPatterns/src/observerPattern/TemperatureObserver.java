package observerPattern;

public class TemperatureObserver implements Observer{
	public void update(int temperature, int humility) {
		System.out.println("temperature:" +temperature);
	}
}
