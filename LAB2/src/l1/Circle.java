package l1;

public class Circle implements IShape{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getArea(){
		return 3.14*(radius*radius);
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
