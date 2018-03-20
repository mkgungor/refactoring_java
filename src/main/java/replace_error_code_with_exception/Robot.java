package replace_error_code_with_exception;

import java.util.StringTokenizer;

public class Robot {
	private final String _name;
	private final Position _position = new Position(0, 0);
	private final Direction _direction = new Direction(0, 1);

	public Robot(String _name) {
		this._name = _name;
	}

	public void execute(String commandSequence) {
		StringTokenizer tokenizer = new StringTokenizer(commandSequence);
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (!executeCommand(token)) {
				System.out.println("Invalid command : " + token);
				break;
			}
		}
	}

	public boolean executeCommand(String commandString) {
		Command command = Command.parseCommand(commandString);
		if (command == null) {
			return false;
		}
		return executeCommand(command);
	}

	private boolean executeCommand(Command command) {
		if (command == Command.FORWARD) {
			_position.relativieMove(_direction._x, _direction._y);
		}else if (command == Command.BACKWARD){
			_position.relativieMove(-_direction._x, -_direction._y);
		}else if (command == Command.TURN_RIGHT) {
			_position.relativieMove(_direction._x, -_direction._y);
		}else if (command == Command.TURN_LEFT) {
			_position.relativieMove(-_direction._x, _direction._y);
		}else {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("Robot [%s, %s, %s]", _name, _position, _direction);
	}
	
	
}
