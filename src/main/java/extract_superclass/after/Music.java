package extract_superclass.after;

public class Music {
	private String data;

	public Music(String data) {
		this.data = data;
	}

	public void play() {
		System.out.printf("%s %s%n", data, "play");
	}

	public void loop() {
		System.out.printf("%s %s%n", data, "loop");
	}

	public void stop() {
		System.out.printf("%s %s%n", data, "stop");
	}
	
}