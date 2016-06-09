package Assignment_01;

public class Product {
	private double price;
	private String pid;
	private String pName;
	
	public double getPrice() {
		return price;
	}
	
	public String getPid() {
		return pid;
	}
	
	public String getpName() {
		return pName;
	}
	
	public Product(double price, String pid, String pName) {
		super();
		this.price = price;
		this.pid = pid;
		this.pName = pName;
	}

}
