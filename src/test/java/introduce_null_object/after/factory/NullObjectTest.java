package introduce_null_object.after.factory;

import org.junit.Assert;
import org.junit.Test;


public class NullObjectTest {
	private static Person[] people = { 
			new Person(new Label("Alice"), new Label("alice@example.com")),
			new Person(new Label("Bobby"), new Label("bobby@example.com")), 
			new Person(new Label("Chris")) 
			};


	@Test
	public void test() {
		Assert.assertSame(people[0].getName().isNull(), false);
		Assert.assertSame(people[2].getMail().isNull(), true);
		
		for (Person p : people) {
			System.out.println(p);
			p.display();
			System.out.println();
		}
	}

}
