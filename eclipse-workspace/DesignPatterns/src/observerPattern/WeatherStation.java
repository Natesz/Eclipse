package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Station{
	int temperature;
	int humility;
	
	List<Observer> observers = new ArrayList<Observer>();
	
	
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for(Observer o: observers) {
			o.update(this.temperature, this.humility);
		}
	}
	
	public void setTemperature(int temperature) {
		this.temperature=temperature;
		notifyObservers();
	}
	
	public void setHumility(int humility) {
		this.humility=humility;
		notifyObservers();
	}
}
