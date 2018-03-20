package replace_constructor_with_factory_method.after2;

public class ShapeRectangle extends Shape {

	protected ShapeRectangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	public String getName() {
		return "RECTANGLE";
	}
	
	public void draw() {
		System.out.printf("%15s : %s%n", "drawRectangle", this.toString());		
	}
}
