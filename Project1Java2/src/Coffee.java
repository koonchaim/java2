
public class Coffee {
	private String id_coffee;
	private String name;
	private String price_small;
	private String price_medium;
	private String price_big;

	public String getId_coffee() {
		return id_coffee;
	}
	public void setId_coffee(String id_coffee) {
		this.id_coffee = id_coffee;
	}
	public String getName() {
		return name;
	}
	public String getPrice_small() {
		return price_small;
	}
	public String getPrice_medium() {
		return price_medium;
	}
	public String getPrice_big() {
		return price_big;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice_small(String price_small) {
		this.price_small = price_small;
	}
	public void setPrice_medium(String price_medium) {
		this.price_medium = price_medium;
	}
	public void setPrice_big(String price_big) {
		this.price_big = price_big;
	}
	public Coffee(String id_coffee, String name, String price_small, String price_medium,
			String price_big) {
		super();
		this.id_coffee = id_coffee;
		this.name = name;
		this.price_small = price_small;
		this.price_medium = price_medium;
		this.price_big = price_big;
	}
	@Override
	public String toString() {
		return id_coffee+" "+name+"\t"+price_small+"\t"+price_medium+"\t"+price_big;
	}
}