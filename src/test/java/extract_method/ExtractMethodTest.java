package extract_method;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExtractMethodTest {
	
	@Test
	public void test01BeforeTrue() {
		Banner hello = new Banner("Hello, World!");
		hello.print(3);	
	}
	
}
