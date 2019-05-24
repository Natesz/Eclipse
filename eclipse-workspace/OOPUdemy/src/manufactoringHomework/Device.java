package manufactoringHomework;

public abstract class Device {
	protected abstract void Assembly();
	protected abstract void Testing();
	protected abstract void Packaging();
	protected abstract void Storage();
	
	public void launch() {
		Assembly();
		Testing();
		Packaging();
		Storage();
	}
}
