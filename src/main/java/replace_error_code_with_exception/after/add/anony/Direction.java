package replace_error_code_with_exception.after.add.anony;

public class Direction {
	public int _x;
	public int _y;

	public Direction(int x, int y) {
		_x = x;
		_y = y;
	}

	public void setDirection(int x, int y) {
		_x = x;
		_y = y;
	}

	@Override
	public String toString() {
		return String.format("Direction(%s, %s)", _x, _y);
	}
	
	
}
