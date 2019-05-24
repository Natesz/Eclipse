package dependencyInversion;

public interface Database {
	public void connect();
	public void disconnect();
}
