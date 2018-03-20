package replace_error_code_with_exception.after;

public class Position {
	public int _x;
	public int _y;

	public Position(int x, int y) {
		_x = x;
		_y = y;
	}

	public void relativeMove(int dx, int dy) {
		_x += dx;
		_y += dy;
	}

	@Override
	public String toString() {
		return String.format("Position(%s, %s)", _x, _y);
	}
	
}
