package remove_control_flag.simpledatabase.renameafter;

import java.io.FileReader;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestSimpleDataBase {
	private static String fileUrl;
	private static SimpleDatabase db;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
		db = new SimpleDatabase(new FileReader(fileUrl));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test01() {
		Iterator<String> iterator = db.iterator();
		Assert.assertEquals("Song Hae Gyo", db.getValue("test2@korea.com"));
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
		}
	}

	@Test
	public void test02() {
		System.out.printf("KEY : %s%nVALUE : %s%n%n", "test2@korea.com", db.getValue("test2@korea.com"));
		Assert.assertNotEquals("Kim Min Su", db.getValue("test2@korea.com"));
		
	}
}
