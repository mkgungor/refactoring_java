package replace_inheritance_with_Delegation;

import java.util.Random;

@SuppressWarnings("serial")
public class Dice extends Random {

	public Dice() {
		super(314159L);
	}

	public Dice(long seed) {
		super(seed);
	}

	@Override
	public int nextInt() {
		return nextInt(6) + 1;
	}
	
	@Override
	public void nextBytes(byte[] bytes) {
		throw new UnsupportedOperationException();//이동작은 지원하지 않음
	}
	
	@Override
	public long nextLong() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean nextBoolean() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public float nextFloat() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public double nextDouble() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public synchronized double nextGaussian() {
		throw new UnsupportedOperationException();
	}
}
