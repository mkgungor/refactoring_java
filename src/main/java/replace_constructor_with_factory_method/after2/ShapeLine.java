package replace_constructor_with_factory_method.after2;

public class ShapeLine extends Shape {

	protected ShapeLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	public String getName() {
		return "LINE";
	}
	
	public void draw() {
		System.out.printf("%15s : %s%n", "drawLine", this.toString());	
	}
}
