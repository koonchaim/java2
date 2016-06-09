package l2;

public class Food extends Goods{
	private double weight;
	
	public Food(int goodsId, String goodsName, double price,double weight) {
		super(goodsId,goodsName,price);
		this.weight = weight;
	}

	public void setFoodPrice(double price){
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	double computeSalePrice() {
		return super.getPrice();
	}
	
	
	
	

}
