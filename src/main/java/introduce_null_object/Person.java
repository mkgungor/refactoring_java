package introduce_null_object;

public class Person {
	private final Label name;
	private final Label mail;
	
	public Person(Label name, Label mail) {
		this.name = name;
		this.mail = mail;
	}

	public Person(Label name) {
		this(name, null);
	}
	
	public void display() {
		if (name != null) {
			name.display();
		}
		if (mail != null) {
			mail.display();
		}
	}

	public Label getName() {
		return name;
	}

	public Label getMail() {
		return mail;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, mail=%s]", name==null?"\"(none)\"":name, mail==null?"\"(none)\"":mail);
	}
	
}
