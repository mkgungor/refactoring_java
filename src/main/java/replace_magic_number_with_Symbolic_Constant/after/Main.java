package replace_magic_number_with_Symbolic_Constant.after;


public class Main {

	public static void main(String[] args) {
		System.out.println("afterMain()");
		Robot robot = new Robot("Andrew");
		robot.order(Robot.COMMAND_WALK); 
		robot.order(Robot.COMMAND_STOP); 
		robot.order(Robot.COMMAND_JUMP); 
	}

}
