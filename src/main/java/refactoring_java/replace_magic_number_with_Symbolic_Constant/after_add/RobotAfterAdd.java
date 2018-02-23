package refactoring_java.replace_magic_number_with_Symbolic_Constant.after_add;

public class RobotAfterAdd {

	public  enum Command{
		WALK, STOP, JUMP
	}
	
	private final String name;

	public RobotAfterAdd(String name) {
		this.name = name;
	}
	
	public String order(RobotAfterAdd.Command command) {
		if (command == Command.WALK) {
			return String.format("%s %s", name, " walks.");
		} else if (command == Command.STOP) {
			return String.format("%s %s", name, " stops.");
		} else if (command == Command.JUMP) {
			return String.format("%s %s", name, " jumps.");
		} else {
			return String.format("command error. command = %s", command);
		}
	}
	
}
