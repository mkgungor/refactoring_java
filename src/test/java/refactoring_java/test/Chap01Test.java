package refactoring_java.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;
import org.junit.runners.MethodSorters;
import refactoring_java.replace_magic_number_with_Symbolic_Constant.after.RobotAfter;
import refactoring_java.replace_magic_number_with_Symbolic_Constant.after_add.RobotAfterAdd;
import refactoring_java.replace_magic_number_with_Symbolic_Constant.before.RobotBefore;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Chap01Test {
	
	private static final Logger logger = LogManager.getLogger(Chap01Test.class);
	
	private static RobotBefore robotBefore;
	private static RobotAfter robotAfter;
	private static RobotAfterAdd robotAfterAdd;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		robotBefore = new RobotBefore("Andrew");
		robotAfter = new RobotAfter("Andrew");
		robotAfterAdd = new RobotAfterAdd("Andrew");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		robotBefore = null;
		robotAfter = null;
	}

	private void prnLog(String titile, String msg) {
		logger.debug(String.format("%s - %s", titile, msg));
	}
	
	private void prnLogTitle(String msg) {
		logger.info(String.format("==============\t %s \t==============", msg));
	}
	
	@Test
	public void test01Before() {
		prnLogTitle("test01Before()");
		String result = robotBefore.order(0);
		prnLog("robot.order(0)", result);
		Assert.assertEquals("Andrew  walks.", result);
		
		result = robotBefore.order(1);
		prnLog("robot.order(1)", result);
		Assert.assertEquals("Andrew  stops.", result);
		
		result = robotBefore.order(2);
		prnLog("robot.order(2)", result);
		Assert.assertEquals("Andrew  jumps.", result);
		
		result = robotBefore.order(3);
		prnLog("robot.order(3)", result);
		Assert.assertEquals("command error. command = 3", result);
	}
	
	@Test
	public void test02After() {
		prnLogTitle("test02After()");
		String result = robotAfter.order(RobotAfter.COMMAND_WALK);
		prnLog("robot.order(Robot.COMMAND_WALK)", result);
		Assert.assertEquals("Andrew  walks.", result);
		
		result = robotAfter.order(RobotAfter.COMMAND_STOP);
		prnLog("robot.order(Robot.COMMAND_STOP)", result);
		Assert.assertEquals("Andrew  stops.", result);
		
		result = robotAfter.order(RobotAfter.COMMAND_JUMP);
		prnLog("robot.order(Robot.COMMAND_JUMP)", result);
		Assert.assertEquals("Andrew  jumps.", result);
		
		result = robotAfter.order(3);
		prnLog("robot.order(3)", result);
		Assert.assertEquals("command error. command = 3", result);
	}
	
	@Test
	public void test03AfterAdd() {
		prnLogTitle("test03AfterAdd()");
		String result = robotAfterAdd.order(RobotAfterAdd.Command.WALK);
		prnLog("robot.order(Robot.COMMAND_WALK)", result);
		Assert.assertEquals("Andrew  walks.", result);
		
		result = robotAfterAdd.order(RobotAfterAdd.Command.STOP);
		prnLog("robot.order(Robot.COMMAND_STOP)", result);
		Assert.assertEquals("Andrew  stops.", result);
		
		result = robotAfterAdd.order(RobotAfterAdd.Command.JUMP);
		prnLog("robot.order(Robot.COMMAND_JUMP)", result);
		Assert.assertEquals("Andrew  jumps.", result);

	}

}
