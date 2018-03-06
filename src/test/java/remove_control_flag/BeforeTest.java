package remove_control_flag;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BeforeTest {
	
	private static final Logger logger = LogManager.getLogger(BeforeTest.class);
	private static final int[] data = {1,9,0,2,8,5,6,3,4,7};
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test
	public void test01BeforeTrue() {
		logger.debug("test01BeforeTrue()");
		if (FindInt.find(data, 5)) {
			System.out.println("Found!");
		}else {
			System.out.println("Not Found...");
		}
		Assert.assertTrue(FindInt.find(data, 5));
	}
	
	@Test
	public void test01BeforeFalse() {
		logger.debug("test01BeforeFalse()");
		if (FindInt.find(data, 10)) {
			System.out.println("Found!");
		}else {
			System.out.println("Not Found...");
		}
		Assert.assertFalse(FindInt.find(data, 10));
	}
}
