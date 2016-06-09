package Assignment_01;

public class Orderline {
	private int quantity;
	private double sum = 0;
	private double total;
	double net = 0 ;
	private double vat;
	private Product product;
	
	public void addProduct(int quantity,Product product){
		this.quantity = quantity;
		this.product = product;
	}
	
	public double calSum(){
		sum = quantity * product.getPrice();
		return sum;
	}
	
	public double calVat(){
		vat = sum * 0.07;
		return vat;
	}
	
	public double calTotal(){
		total = sum + vat;
		return total;
	}
	
	public double calNetTotal(){
		
		net = sum - vat;
		return net;
	}

	@Override
	public String toString() {
		return this.product.getPid()+"\t\t"+this.product.getpName()+"\t\t"
				+this.product.getPrice()+"\t\t"+quantity + "\t" + sum;
	}
}
