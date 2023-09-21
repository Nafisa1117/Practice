package practiseInterface2;

public class Rectangle implements Shape{

	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		// TODO Auto-generated constructor stub
		this.length = l;
		this.width = w;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	

}
