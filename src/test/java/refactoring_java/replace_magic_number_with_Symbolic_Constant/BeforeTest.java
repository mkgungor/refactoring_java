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
public class BeforeTest {
	
	private static final Logger logger = LogManager.getLogger(BeforeTest.class);
	
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
	public void test01Before() {
		logger.debug("test01Before()");
		robot.order(0);
		robot.order(1);
		robot.order(2);
		robot.order(3);
	}
	
}
