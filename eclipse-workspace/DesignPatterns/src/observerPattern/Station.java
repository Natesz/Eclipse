package observerPattern;

public interface Station {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
