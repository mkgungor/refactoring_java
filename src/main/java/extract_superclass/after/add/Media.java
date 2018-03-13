package extract_superclass.after.add;

public abstract class Media {

	protected String data;

	public Media() {
		super();
	}

	public abstract void play();

	public abstract void loop();

	public abstract void stop();
}