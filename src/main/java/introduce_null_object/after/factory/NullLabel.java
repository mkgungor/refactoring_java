package introduce_null_object.after.factory;

public class NullLabel extends Label {

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
