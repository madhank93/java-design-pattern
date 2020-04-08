package factory.pattern;

public class TestFactoryPattern {

	public static void main(String[] args) {
		PentagonFactory obj = new PentagonFactory();
		Polygon shape = obj.getShape("triangle");
		System.out.println(shape.getSide());
	}

}
