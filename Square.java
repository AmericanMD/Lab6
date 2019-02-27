
public class Square extends Rectangle{
	
	//
	public Square(String id, double size) {
		super(id);
		Polygon t = Rectangle(id, size, size);
	}
	
	//Returns the type of shape
	public String getShapeType() {
		return "Square";
	}

}
