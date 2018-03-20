package replace_error_code_with_exception.after.add;

import java.util.HashMap;
import java.util.Map;

public abstract class Command {
	public static final Command FORWARD = new Forward();
	public static final Command BACKWARD = new Backward();
	public static final Command TURN_RIGHT = new Right();
	public static final Command TURN_LEFT = new Left();

	private static final Map<String, Command> _commandNameMap = new HashMap<String, Command>();
	static {
		_commandNameMap.put(FORWARD._name, FORWARD);
		_commandNameMap.put(BACKWARD._name, BACKWARD);
		_commandNameMap.put(TURN_RIGHT._name, TURN_RIGHT);
		_commandNameMap.put(TURN_LEFT._name, TURN_LEFT);
	}
	private final String _name;

	protected Command(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public static Command parseCommand(String name) throws InvalidCommandException {
		if (!_commandNameMap.containsKey(name)) {
			throw new InvalidCommandException(name);
		}
		return _commandNameMap.get(name);
	}

	public abstract void execute(Robot robot);
	
	private static class Forward extends Command{
		protected Forward() {
			super("forward");
		}

		@Override
		public void execute(Robot robot) {
			robot.forward();
		}
	}
	
	private static class Backward extends Command{
		protected Backward() {
			super("backward");
		}

		@Override
		public void execute(Robot robot) {
			robot.backward();
		}
	}
	
	private static class Right extends Command{
		protected Right() {
			super("right");
		}

		@Override
		public void execute(Robot robot) {
			robot.right();
		}
	}
	
	private static class Left extends Command{
		protected Left() {
			super("left");
		}

		@Override
		public void execute(Robot robot) {
			robot.left();
		}
	}
}
