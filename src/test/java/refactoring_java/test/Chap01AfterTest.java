package refactoring_java.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import refactoring_java.replace_magic_number_with_Symbolic_Constant.after.Robot;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Chap01AfterTest {

	private static final Logger logger = LogManager.getLogger(Chap01AfterTest.class);

	private static Robot robot;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		robot = new Robot("Andrew");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		robot = null;
	}

	private void prnLog(String titile, String msg) {
		logger.debug(String.format("%s - %s", titile, msg));
	}

	private void prnLogTitle(String msg) {
		logger.info(String.format("==============\t %s \t==============", msg));
	}

	@Test
	public void testAfter() {
		prnLogTitle("test02After()");
		String result = robot.order(Robot.COMMAND_WALK);
		prnLog("robot.order(Robot.COMMAND_WALK)", result);
		Assert.assertEquals("Andrew  walks.", result);

		result = robot.order(Robot.COMMAND_STOP);
		prnLog("robot.order(Robot.COMMAND_STOP)", result);
		Assert.assertEquals("Andrew  stops.", result);

		result = robot.order(Robot.COMMAND_JUMP);
		prnLog("robot.order(Robot.COMMAND_JUMP)", result);
		Assert.assertEquals("Andrew  jumps.", result);

		result = robot.order(3);
		prnLog("robot.order(3)", result);
		Assert.assertEquals("command error. command = 3", result);
	}

}
