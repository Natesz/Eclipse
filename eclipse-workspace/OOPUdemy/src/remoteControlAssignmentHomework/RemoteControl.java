package remoteControlAssignmentHomework;

public class RemoteControl {
	
	private static RemoteControl remoteControl = null;
	private Devices device=null;
	
	private RemoteControl() {}
	
	static public RemoteControl InstanceOf() {
		if(remoteControl == null) {
			System.out.println("uj remoteControl");
			remoteControl = new RemoteControl();
		}
		return remoteControl;
	}
	
	public void Connect(Devices device) {
		this.device=device;
		System.out.println("Connected to " + device);
	}
	
	public void clickOffButon(){
		  device.turnOff();

	}
	
	public void clickOnButon(){
		device.turnOn();
	}
}
