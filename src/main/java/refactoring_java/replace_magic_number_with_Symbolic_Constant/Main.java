package refactoring_java.replace_magic_number_with_Symbolic_Constant;

import refactoring_java.replace_magic_number_with_Symbolic_Constant.after_add.Robot;

import static refactoring_java.replace_magic_number_with_Symbolic_Constant.after.Robot.COMMAND_JUMP;
import static refactoring_java.replace_magic_number_with_Symbolic_Constant.after.Robot.COMMAND_STOP;
import static refactoring_java.replace_magic_number_with_Symbolic_Constant.after.Robot.COMMAND_WALK;


public class Main {

	public static void main(String[] args) {
		beforeMain();
		
		afterMain();
		
		afterAddMain();
	}

	private static void afterAddMain() {
		System.out.println("afterAddMain()");
		Robot robot = new Robot("Andrew");
		
		System.out.println(robot.order(Robot.Command.WALK)); //walk
		System.out.println(robot.order(Robot.Command.STOP)); //stop
		System.out.println(robot.order(Robot.Command.JUMP)); //jump
	}

	private static void afterMain() {
		System.out.println("afterMain()");
		refactoring_java.replace_magic_number_with_Symbolic_Constant.after.Robot robot = new refactoring_java.replace_magic_number_with_Symbolic_Constant.after.Robot("Andrew");
		System.out.println(robot.order(COMMAND_WALK)); //walk
		System.out.println(robot.order(COMMAND_STOP)); //stop
		System.out.println(robot.order(COMMAND_JUMP)); //jump
	}

	private static void beforeMain() {
		System.out.println("beforeMain()");
		refactoring_java.replace_magic_number_with_Symbolic_Constant.before.Robot robot = new refactoring_java.replace_magic_number_with_Symbolic_Constant.before.Robot("Andrew");
		System.out.println(robot.order(0)); //walk
		System.out.println(robot.order(1)); //stop
		System.out.println(robot.order(2)); //jump
	}

}
