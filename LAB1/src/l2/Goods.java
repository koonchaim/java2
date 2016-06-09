package l2;

public abstract class Goods {
	private int goodsId;
	private String goodsName;
	private double price;
	
	public Goods(){
		
	}
	
	public Goods(int goodsId, String goodsName, double price) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.price = price;
	}
	abstract double computeSalePrice();

	public int getGoodsId() {
		return goodsId;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public double getPrice() {
		return price;
	}

	
	
	
	

}