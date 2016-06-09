
public class Coffee {
	private String coffee_id = "";
	private String coffee_name = "";
	private String coffee_hot_price = "";
	private String coffee_cold_small_price = "";
	private String coffee_cold_large_price = "";
	public Coffee(){
		
	}
	public Coffee(String coffee_id, String coffee_name,
			String coffee_hot_price, String coffee_cold_small_price,
			String coffee_cold_large_price) {
		super();
		this.coffee_id = coffee_id;
		this.coffee_name = coffee_name;
		this.coffee_hot_price = coffee_hot_price;
		this.coffee_cold_small_price = coffee_cold_small_price;
		this.coffee_cold_large_price = coffee_cold_large_price;
	}
	public String getCoffee_id() {
		return coffee_id;
	}
	public void setCoffee_id(String coffee_id) {
		this.coffee_id = coffee_id;
	}
	public String getCoffee_name() {
		return coffee_name;
	}
	public void setCoffee_name(String coffee_name) {
		this.coffee_name = coffee_name;
	}
	public String getCoffee_hot_price() {
		return coffee_hot_price;
	}
	public void setCoffee_hot_price(String coffee_hot_price) {
		this.coffee_hot_price = coffee_hot_price;
	}
	public String getCoffee_cold_small_price() {
		return coffee_cold_small_price;
	}
	public void setCoffee_cold_small_price(String coffee_cold_small_price) {
		this.coffee_cold_small_price = coffee_cold_small_price;
	}
	public String getCoffee_cold_large_price() {
		return coffee_cold_large_price;
	}
	public void setCoffee_cold_large_price(String coffee_cold_large_price) {
		this.coffee_cold_large_price = coffee_cold_large_price;
	}
	public String toString(){
		return coffee_id+". "+coffee_name+" "+coffee_hot_price+" "+coffee_cold_small_price+" "+coffee_cold_large_price;
	}
	

}
