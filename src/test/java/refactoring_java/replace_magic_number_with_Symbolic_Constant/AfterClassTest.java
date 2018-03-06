package refactoring_java.replace_magic_number_with_Symbolic_Constant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import replace_magic_number_with_Symbolic_Constant.afterClass.Robot;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AfterClassTest {
	
	private static final Logger logger = LogManager.getLogger(AfterClassTest.class);

	private static Robot robot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		logger.debug("setUpBeforeClass()");
		robot = new Robot("Andrew");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		logger.debug("tearDownAfterClass()");
		robot = null;
	}

	@Test
	public void testAfterAdd() {
		logger.debug("test03AfterAdd()");
		robot.order(Robot.COMMAND_WALK);
		robot.order(Robot.COMMAND_STOP);
		robot.order(Robot.COMMAND_JUMP);
	}

}
