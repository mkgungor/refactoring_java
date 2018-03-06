package replace_magic_number_with_Symbolic_Constant.afterClass;

public class RobotCommand {
	private final String name;

	public RobotCommand(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("[RobotCommand %s]", name);
	}
	
}
