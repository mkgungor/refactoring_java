package extract_superclass.after;

public class Main {

	public static void main(String[] args) {
		Player musicPlayer = new Player();
		musicPlayer.setCurrentMedia(true);
		
		Player videoPlayer = new Player();
		videoPlayer.setCurrentMedia(false);
		
		play(musicPlayer);
		play(videoPlayer);
	}

	private static void play(Player player) {
		player.play();
		player.loop();
		player.stop();
	}

}
