package l2;

public class Toy extends Goods implements Taxable{
	private String type;
	public Toy(){
		
	}

	
	public Toy(int goodsId, String goodsName, double price,String type) {
		super(goodsId,goodsName,price);
		
		this.type = type;
	}


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	double computeSalePrice() {
		double t = super.getPrice()*0.3;
		return t+calculateTax(t);
	}
	public double calculateTax(double t){
		return t*TAX_RATE;
	}
	
	

}
