package refactoring_java.replace_magic_number_with_Symbolic_Constant.before;

public class Robot {
	
	private final String name;

	public Robot(String name) {
		this.name = name;
	}
	
	public String order(int command) {
		if (command == 0) {
			return String.format("%s %s", name, " walks.");
		} else if (command == 1) {
			return String.format("%s %s", name, " stops.");
		} else if (command == 2) {
			return String.format("%s %s", name, " jumps.");
		} else {
			return String.format("command error. command = %s", command);
		}
	}
}
