package dependencyInversion;

public class App {
	public static void main(String args[]) {
		DatabaseHandler databaseHandler = new DatabaseHandler(new MySqlDatabase());
		
		databaseHandler.connect();
		databaseHandler.disconnect();
	}
}
