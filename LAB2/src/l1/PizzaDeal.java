package l1;

public class PizzaDeal{
	Pizza pizza;

	public double deal(Pizza pizza) {
		return pizza.getPrice()/pizza.getShape().getArea();
	}
	
	public boolean betterDeal(Pizza p1, Pizza p2){
		if(deal(p1)>deal(p2)){
			return true;
		}
		return false;
	}

	
}
