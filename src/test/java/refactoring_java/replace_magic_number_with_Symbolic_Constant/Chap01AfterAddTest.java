package refactoring_java.replace_magic_number_with_Symbolic_Constant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;
import org.junit.runners.MethodSorters;
import refactoring_java.replace_magic_number_with_Symbolic_Constant.after_add.Robot;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Chap01AfterAddTest {
	
	private static final Logger logger = LogManager.getLogger(Chap01AfterAddTest.class);

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
	public void testAfterAdd() {
		prnLogTitle("test03AfterAdd()");
		String result = robot.order(Robot.Command.WALK);
		prnLog("robot.order(Robot.COMMAND_WALK)", result);
		Assert.assertEquals("Andrew  walks.", result);
		
		result = robot.order(Robot.Command.STOP);
		prnLog("robot.order(Robot.COMMAND_STOP)", result);
		Assert.assertEquals("Andrew  stops.", result);
		
		result = robot.order(Robot.Command.JUMP);
		prnLog("robot.order(Robot.COMMAND_JUMP)", result);
		Assert.assertEquals("Andrew  jumps.", result);
	}

}
