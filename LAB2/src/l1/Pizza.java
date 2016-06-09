package l1;

public class Pizza{
	private double price;
	private IShape s;

	

	public Pizza(double price, IShape s) {
		this.price = price;
		this.s = s;
	}

	public double getPrice() {
		return price;
	}
	
	public IShape getShape() {
		return s;
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price +  s + "]";
	}

	
	
}
