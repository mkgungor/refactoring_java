package replace_type_code_with_subclasses.after.add;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Shape> shapes = Arrays.asList(
				Shape.createShape(LineFactory.getInstance(), 0, 0, 100, 200),
				Shape.createShape(RectangleFactory.getInstance(), 10,20, 30, 40),
				Shape.createShape(OvalFactory.getInstance(), 100, 200, 300, 400)
				);

		for(Shape s : shapes) {
			s.draw();
		}
	}

}
