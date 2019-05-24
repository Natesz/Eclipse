package interju;

public class Phone {

	private String Os;
	private int battery;
	private int price;
	public String getOs() {
		return Os;
	}
	public void setOs(String os) {
		Os = os;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Phone(String os, int battery, int price) {
		super();
		Os = os;
		this.battery = battery;
		this.price = price;
	}
	
	
}
