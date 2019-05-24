package dependencyInversion;

public class DatabaseHandler implements Database{

	private Database database;
	
	public DatabaseHandler(Database database) {
		this.database=database;
	}
	
	public void connect() {
		this.database.connect();
	}
	
	public void disconnect() {
		this.database.disconnect();
	}
}
