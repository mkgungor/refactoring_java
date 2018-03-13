package extract_superclass.after.add;

public class Player {
	private Media media;
	
	public void setMedia(Media media) {
		this.media = media;
	}

	public void play() {
		media.play();
	}

	public void loop() {
		media.loop();
	}

	public void stop() {
		media.stop();
	}

}
