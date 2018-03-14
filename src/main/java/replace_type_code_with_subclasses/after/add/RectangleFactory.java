package replace_type_code_with_subclasses.after.add;

public class RectangleFactory extends ShapeFactory{
	private static final ShapeFactory instance = new RectangleFactory();

	private RectangleFactory() {}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public Shape create(int startX, int startY, int endX, int endY) {
		return new ShapeRectangle(startX, startY, endX, endY);
	}

}
