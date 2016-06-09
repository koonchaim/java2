package l1;

public class RunPizza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza round = new Pizza(3.99, new Circle(2.5));
		Pizza rect  = new Pizza(4.99, new Rectangle(6,4));
		PizzaDeal pd = new PizzaDeal();
		System.out.println(round + "is a better deal than "+rect+" : "+pd.betterDeal(round, rect));
		
	}

}
