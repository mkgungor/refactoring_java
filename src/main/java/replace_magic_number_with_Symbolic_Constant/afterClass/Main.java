package replace_magic_number_with_Symbolic_Constant.afterClass;

public class Main {

	public static void main(String[] args) {
		System.out.println("afterAddMain()");
		Robot robot = new Robot("Andrew");

		robot.order(Robot.COMMAND_WALK); 
		robot.order(Robot.COMMAND_STOP); 
		robot.order(Robot.COMMAND_JUMP);
	}

}
