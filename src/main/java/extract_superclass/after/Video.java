package extract_superclass.after;

public class Video {
	private String data;

	public Video(String data) {
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