package replace_magic_number_with_Symbolic_Constant.afterEnum;

public class Main {

	public static void main(String[] args) {
		System.out.println("afterAddMain()");
		Robot robot = new Robot("Andrew");

		robot.order(Robot.Command.WALK);
		robot.order(Robot.Command.STOP);
		robot.order(Robot.Command.JUMP);
	}

}
