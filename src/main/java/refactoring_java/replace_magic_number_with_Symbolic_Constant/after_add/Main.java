package refactoring_java.replace_magic_number_with_Symbolic_Constant.after_add;

public class Main {

	public static void main(String[] args) {
		System.out.println("afterAddMain()");
		Robot robot = new Robot("Andrew");

		robot.order(Robot.Command.WALK); // walk
		robot.order(Robot.Command.STOP); // stop
		robot.order(Robot.Command.JUMP); // jump
	}

}
