package replace_error_code_with_exception;

public class Position {
	private int _x;
	private int _y;

	public Position(int _x, int _y) {
		this._x = _x;
		this._y = _y;
	}

	public void relativieMove(int dx, int dy) {
		_x += dx;
		_y += dy;
	}

	@Override
	public String toString() {
		return String.format("Position(%s, %s)", _x, _y);
	}
	
	
}
