package replace_error_code_with_exception;

import java.util.HashMap;
import java.util.Map;

public class Command {
	public static final Command FORWARD = new Command("forward");
	public static final Command BACKWARD = new Command("backward");
	public static final Command TURN_RIGHT = new Command("right");
	public static final Command TURN_LEFT = new Command("left");

	private final String _name;

	public Command(String _name) {
		this._name = _name;
	}

	public String get_name() {
		return _name;
	}

	private static final Map<String, Command> _commandNameMap = new HashMap<>();

	static {
		_commandNameMap.put(FORWARD._name, FORWARD);
		_commandNameMap.put(BACKWARD._name, BACKWARD);
		_commandNameMap.put(TURN_RIGHT._name, TURN_RIGHT);
		_commandNameMap.put(TURN_LEFT._name, TURN_LEFT);
	}
	
	public static Command parseCommand(String name) {
		if (!_commandNameMap.containsKey(name)) {
			return null;
		}
		return _commandNameMap.get(name);
	}
}
