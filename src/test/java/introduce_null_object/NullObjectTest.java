package introduce_null_object;

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
		Assert.assertSame(people[0].getName().getLabel(), new Label("Alice").getLabel());
		Assert.assertNull(people[2].getMail());
		
		for (Person p : people) {
			System.out.println(p);
			p.display();
			System.out.println();
		}
	}

}
