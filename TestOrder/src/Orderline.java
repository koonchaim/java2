public class Orderline {	
	private Product product; 
	private int amount;
	private double sum = 0.0;
	
	public Orderline()  { }
	
	public void addProduct(int amt, Product pro)  {
         amount = amt; 	
		product = pro;
	}  

	public double calLineTotal() { 
		sum = amount * product.getPrice(); 
		return sum; 
	}
	
	public String toString() {
		return " " + product.getproId() + "\t " + product.getproName() + "\t " + product.getPrice() + "\t " + amount + "\t " + sum;
   }
}
