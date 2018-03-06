package refactoring_java.replace_magic_number_with_Symbolic_Constant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import replace_magic_number_with_Symbolic_Constant.after.Robot;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AfterTest {

	private static final Logger logger = LogManager.getLogger(AfterTest.class);

	private static Robot robot;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		robot = new Robot("Andrew");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		robot = null;
	}

	@Test
	public void testAfter() {
		logger.debug("test02After()");
		robot.order(Robot.COMMAND_WALK);
		robot.order(Robot.COMMAND_STOP);
		robot.order(Robot.COMMAND_JUMP);
		robot.order(3);
	}

}
