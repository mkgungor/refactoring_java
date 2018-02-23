package refactoring_java.replace_magic_number_with_Symbolic_Constant.after;

public class RobotAfter {
	public static final int COMMAND_WALK = 0;
	public static final int COMMAND_STOP = 1;
	public static final int COMMAND_JUMP = 2;

	private final String name;

	public RobotAfter(String name) {
		this.name = name;
	}
	
	
	public String order(int command) {
		if (command == COMMAND_WALK) {
			return String.format("%s %s", name, " walks.");
		} else if (command == COMMAND_STOP) {
			return String.format("%s %s", name, " stops.");
		} else if (command == COMMAND_JUMP) {
			return String.format("%s %s", name, " jumps.");
		} else {
			return String.format("command error. command = %s", command);
		}
	}
}
