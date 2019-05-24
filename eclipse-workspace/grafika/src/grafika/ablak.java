package grafika;

import javax.swing.*;

public class ablak extends JFrame{
	public ablak() {
		super("apad");
		setSize(350,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] arguments) {
		ablak abl = new ablak();
	}

}
