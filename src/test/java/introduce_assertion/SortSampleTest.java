package introduce_assertion;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SortSampleTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}
	
	@Test
	public void test01BeforeTrue() {
		int[] data = {8,3,3,0,0,3,9,9,7,7};
		SortSample sorter = new SortSample(data);
		System.out.printf("%6s : %s%n", "BEFORE" ,sorter);
		
		sorter.sort();
		System.out.printf("%6s : %s%n", "AFTER" ,sorter);
		
		int[] sortData = {0,0,3,3,3,7,7,8,9,9};

		Assert.assertArrayEquals(sortData, sorter.getData());
	}
	
}
