package refactoring_java.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import refactoring_java.replace_magic_number_with_Symbolic_Constant.before.Robot;

public class Chap01Test {
	
	private static final Logger logger = LogManager.getLogger(Chap01Test.class);
	
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
	
	@Test
	public void test01() {
		String result = robot.order(0);
		prnLog("robot.order(0)", result);
		Assert.assertEquals("Andrew  walks.", result);
		
		result = robot.order(1);
		prnLog("robot.order(1)", result);
		Assert.assertEquals("Andrew  stops.", result);
		
		result = robot.order(2);
		prnLog("robot.order(2)", result);
		Assert.assertEquals("Andrew  jumps.", result);
		
		result = robot.order(3);
		prnLog("robot.order(3)", result);
		Assert.assertEquals("command error. command = 3", result);
	}

}
