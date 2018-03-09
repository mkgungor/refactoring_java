package introduce_null_object.after.nested_factory;

public class Label {
	private final String label;
	public final static Label NULL = new NullLabel();
	
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
	
	public boolean isNull() {
		return false;
	}

	private static class NullLabel extends Label {

		public NullLabel() {
			super("(none)");
		}

		@Override
		public boolean isNull() {
			return true;
		}

		@Override
		public void display() {
		}

	}
}
