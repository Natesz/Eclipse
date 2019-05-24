package remoteControlAssignmentHomework;

public class Person {
	public static void main(String args[]) {

		Projector device1 = new Projector();
		Projector device2 = new Projector();
		TV device3 = new TV();
		TV device4 = new TV();
		SorroundSoundSystem device5 = new SorroundSoundSystem();
		
		RemoteControl remoteControl = RemoteControl.InstanceOf();
		RemoteControl remoteControl2 = RemoteControl.InstanceOf();
		RemoteControl remoteControl3 = RemoteControl.InstanceOf();
		RemoteControl remoteControl4 = RemoteControl.InstanceOf();
		RemoteControl remoteControl5 = RemoteControl.InstanceOf();
		
		remoteControl.Connect(device1);
		remoteControl.clickOffButon();
		remoteControl2.Connect(device2);
		remoteControl.clickOffButon();
		remoteControl3.Connect(device3);
		remoteControl.clickOffButon();
		remoteControl4.Connect(device4);
		remoteControl.Connect(device5);
		
		remoteControl.clickOffButon();
	}
}
