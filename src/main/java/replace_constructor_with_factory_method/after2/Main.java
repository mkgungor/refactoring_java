package replace_constructor_with_factory_method.after2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Shape> shapes = Arrays.asList(
				Shape.createLine( 0, 0, 100, 200),
				Shape.createRectangle(10, 20, 30, 40),
				Shape.createOval(100, 200, 300, 400)
				);

		for(Shape s : shapes) {
			s.draw();
		}
		
	}

}
