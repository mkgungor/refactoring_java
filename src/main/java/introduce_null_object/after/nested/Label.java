package introduce_null_object.after.nested;

public class Label {
	private final String label;
	
	public static Label newNull() {
		return NullLabel.getInstancee();
	}
	
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
		private static final NullLabel instancee = new NullLabel();
		
		public static NullLabel getInstancee() {
			return instancee;
		}

		private NullLabel() {
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
