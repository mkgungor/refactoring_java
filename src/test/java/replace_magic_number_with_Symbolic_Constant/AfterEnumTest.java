package replace_magic_number_with_Symbolic_Constant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import replace_magic_number_with_Symbolic_Constant.afterEnum.Robot;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AfterEnumTest {
	
	private static final Logger logger = LogManager.getLogger(AfterEnumTest.class);

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
	public void testAfterAdd() {
		logger.debug("test03AfterAdd()");
		robot.order(Robot.Command.WALK);
		robot.order(Robot.Command.STOP);
		robot.order(Robot.Command.JUMP);
	}

}
