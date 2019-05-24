package homeworkSOLID;

public class DatabaseConnectionManager {
	
	public static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
	
	public void connect() {
		System.out.println("connecting...");
	}
	
	public void disconnect() {
		System.out.println("disconnecting...");
	}
	
	public void getConnectionObject() {
		System.out.println("connecting...");
	}
}
