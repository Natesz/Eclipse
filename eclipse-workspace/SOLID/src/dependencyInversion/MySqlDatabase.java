package dependencyInversion;

public class MySqlDatabase implements Database{

	@Override
	public void connect() {
		System.out.println("Connecting to MySQL db...");		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting from MySQL db...");		
	}

}
