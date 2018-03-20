package replace_constructor_with_factory_method.after2;

public class ShapeOval extends Shape {

	protected ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	public String getName() {
		return "OVAL";
	}
	
	public void draw() {
		System.out.printf("%15s : %s%n", "drawOval", this.toString());	
	}
}
