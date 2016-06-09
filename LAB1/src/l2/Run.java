package l2;

public class Run {
	public static void main(String args[]){
		Goods[] good = new  Goods[3];
		good[0] = new Book(1,"Harry Potter",250.0,"123",2549);
		good[1] = new Food(2,"Banana",67.5,3);
		good[2] = new Toy(3,"Blythe",1250.0,"K-02");
		double totalRegularPrice=0.0;
		double totalSalePrice = 0.0;
		double totalNetPrice = 0.0;
		
		for(int i=0;i<good.length;i++){
			totalRegularPrice = good[i].getPrice();
			totalSalePrice = good[0].computeSalePrice()+good[2].computeSalePrice();
			System.out.println("Item number "+i+" : "+good[i].getGoodsName()+
					" , Regular price = "+good[i].getPrice()
					+" , Sale Price = "+good[i].computeSalePrice());
		}
		System.out.println("Total Regular "+totalRegularPrice);
		
		System.out.println("Total Regular "+totalSalePrice);
		
		System.out.println("Total Regular "+(totalRegularPrice-totalSalePrice));
	}

}
