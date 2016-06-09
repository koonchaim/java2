public class Product {
	private TypeCook typeCook;
	private double price;
	private String proId;
	private String proName;

	public Product(String pid, String name, double price,TypeCook typeCook) {
		proId = pid;
		proName = name;
		this.price = price;
		this.typeCook = typeCook;
	}
	
	public TypeCook getTypeCook() {
		return typeCook;
	}

	public String getproId() {
		return proId;
	}

	public String getproName() {
		return proName;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return " " + proId + " " + proName + " " + price;
	}
}
