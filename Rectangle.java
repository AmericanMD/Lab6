
public class Rectangle extends Polygon {
	//Parameters of the Rectangle
	private double height;
	private double width;
	
	//Gets the intended info of what the Rectangle includes
	public Rectangle(String id, double height, double width) {
		super(id);
		this.height = height;
		this.width = width;
	}
	
	//Returns the area of the Rectangle
	public double getArea() {
		double total = this.height * this.width;
		return total;
	}
	
	//Returns what type of shape it is
	public String getShapeType() {
		return "Rectangle";
	}
}
