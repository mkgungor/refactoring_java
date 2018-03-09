package introduce_null_object.after;

public class Label {
	private final String label;

	public Label(String label) {
		this.label = label;
	}

	public void display() {
		System.out.printf("display : %s%n", label);
	}

	@Override
	public String toString() {
		return String.format("\"%s\"", label);
	}

	public String getLabel() {
		return label;
	}
	
	public boolean isNull() {
		return false;
	}

}
