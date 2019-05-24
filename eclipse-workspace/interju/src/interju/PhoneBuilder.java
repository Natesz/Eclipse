package interju;

public class PhoneBuilder {

	private String Os;
	private int battery;
	private int price;
	
	public PhoneBuilder setOs(String os) {
		Os = os;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public Phone getPhone() {
		
		return new Phone(Os, battery, price); 
}
	
	
}
