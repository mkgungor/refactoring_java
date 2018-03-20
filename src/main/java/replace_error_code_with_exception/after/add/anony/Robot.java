package replace_error_code_with_exception.after.add.anony;

import java.util.StringTokenizer;

public class Robot {
	private final String _name;
	private final Position _position = new Position(0, 0);
	private final Direction _direction = new Direction(0, 1);
	
	public Robot(String name) {
		_name = name;
	}
	
	public void execute(String commandSequence) {
		StringTokenizer tokenizer = new StringTokenizer(commandSequence);
		try {
			while(tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				executeCommand(token);
			}
		}catch(InvalidCommandException e) {
			System.out.println("Invalid command : " + e.getMessage());
		}
	}

	public void executeCommand(String commandString) throws InvalidCommandException{
		Command command = Command.parseCommand(commandString);
		executeCommand(command);
	}

	private void executeCommand(Command command) throws InvalidCommandException{
		command.execute(this);
	}

	public void forward() {
		_position.relativeMove(_direction._x, _direction._y);
	}
	
	public void backward() {
		_position.relativeMove(-_direction._x, -_direction._y);
	}
	
	public void right() {
		_direction.setDirection(_direction._y, -_direction._x);
	}
	
	public void left() {
		_direction.setDirection(-_direction._y, _direction._x);
	}
	
	@Override
	public String toString() {
		return String.format("Robot [%s, %s, %s]", _name, _position, _direction);
	}

}
