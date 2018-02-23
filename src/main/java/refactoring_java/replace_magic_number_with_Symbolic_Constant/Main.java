package refactoring_java.replace_magic_number_with_Symbolic_Constant;

import refactoring_java.replace_magic_number_with_Symbolic_Constant.after.RobotAfter;
import refactoring_java.replace_magic_number_with_Symbolic_Constant.before.RobotBefore;

public class Main {

	public static void main(String[] args) {
		beforeMain();
		
		afterMain();
		
		
	}

	private static void afterMain() {
		RobotAfter robot = new RobotAfter("Andrew");
		System.out.println(robot.order(0)); //walk
		System.out.println(robot.order(1)); //stop
		System.out.println(robot.order(2)); //jump
	}

	private static void beforeMain() {
		RobotBefore robot = new RobotBefore("Andrew");
		System.out.println(robot.order(0)); //walk
		System.out.println(robot.order(1)); //stop
		System.out.println(robot.order(2)); //jump
	}

}
