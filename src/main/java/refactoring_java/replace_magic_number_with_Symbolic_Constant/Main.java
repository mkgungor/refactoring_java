package refactoring_java.replace_magic_number_with_Symbolic_Constant;

import refactoring_java.replace_magic_number_with_Symbolic_Constant.before.Robot;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot("Andrew");
		System.out.println(robot.order(0)); //walk
		System.out.println(robot.order(1)); //stop
		System.out.println(robot.order(2)); //jump
	}

}
