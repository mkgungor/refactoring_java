package duplicate_observed_data.after;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Graph extends JPanel implements ValueListener{
	public enum GraphType{
		RECTANGLE, CIRCLE
	}
	
	protected int graphValue;

	public void valueChanger(ValueChangeEvent e) {
		graphValue = e.getSource().getValue();
		repaint();
	}

	public static Graph createGraph(GraphType type, int width, int height) {
		switch(type) {
			case RECTANGLE:
				return RectangleGraph.getInstance(width, height);
			case CIRCLE:
				return CircleGraph.getInstance(width, height);
			default:
				throw new RuntimeException("Unknown Graph type");
		}
	}
}