package factory.pattern;

public class PentagonFactory {
	
	public Polygon getShape(String shape) {
		
		if (shape == null) {
			return null;
		}
		
		if (shape.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		} else if (shape.equalsIgnoreCase("Square")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("pentagon")) {
			return new Pentagon();
		}
		
		return null;
	}
}
