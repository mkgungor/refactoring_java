package replace_magic_number_with_Symbolic_Constant.afterEnum;

public class Robot {

	public  enum Command{
		WALK, STOP, JUMP
	}
	
	private final String name;

	public Robot(String name) {
		this.name = name;
	}
	
	public void order(Robot.Command command) {
		if (command == Command.WALK) {
			System.out.printf("%s %s%n", name, " walks.");
		} else if (command == Command.STOP) {
			System.out.printf("%s %s%n", name, " stops.");
		} else if (command == Command.JUMP) {
			System.out.printf("%s %s%n", name, " jumps.");
		} else {
			System.out.printf("command error. command = %s%n", command);
		}
	}
	
}
