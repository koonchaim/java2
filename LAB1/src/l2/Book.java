package l2;

public class Book extends Goods implements Taxable{
	public String publisher;
	public int yearPublished;
	public Book() {
		super();
		
	}
	public Book(int goodsId, String goodsName, double price,String publisher,int yearPublished) {
		super(goodsId,goodsName,price);
		this.publisher = publisher;
		this.yearPublished = yearPublished;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	@Override
	double computeSalePrice() {
		double t = super.getPrice()*0.5;
		return t+calculateTax(t);
	}
	@Override
	public double calculateTax(double t) {
		// TODO Auto-generated method stub
		return t*TAX_RATE;
	}
	

}
