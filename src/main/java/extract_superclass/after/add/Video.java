package extract_superclass.after.add;

public class Video extends Media{

	public Video(String data) {
		super(data);
	}

	@Override
	public void play() {
		System.out.printf("%s %s%n", data, "play");
	}

	@Override
	public void loop() {
		System.out.printf("%s %s%n", data, "loop");
	}

	@Override
	public void stop() {
		System.out.printf("%s %s%n", data, "stop");
	}
	
}