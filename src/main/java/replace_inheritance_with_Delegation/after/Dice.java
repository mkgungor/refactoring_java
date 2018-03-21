package replace_inheritance_with_Delegation.after;

import java.util.Random;

public class Dice {
	
	private final Random random;
	
	public Dice() {
		random = new Random(314159L);
	}

	public Dice(long seed) {
		random = new Random(seed);
	}

	public void setSeed(long seed) {
		random.setSeed(seed);
	}
	
	public int nextInt() {
		return random.nextInt(6) + 1;
	}
	
}
