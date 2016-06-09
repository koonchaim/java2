import java.util.Vector;


public class CalOrder {
	private double total;
	private Vector<Orderline> lineItems = new Vector<Orderline>();
	public void addOrderLine(Orderline ol) {
		lineItems.add(ol);
	}

	public double calTotal() {
		total = 0.0;
		for (int i = 0; i < lineItems.size(); i++)
			total += ((Orderline) lineItems.elementAt(i)).calLineTotal();
		return total;
	}

	public String displayLine() {
		String temp = "\t";
		for (int i = 0; i < lineItems.size(); i++) {
			temp += (Orderline) lineItems.elementAt(i);
			temp += "\n\t";
		}
		return temp;
	}
}
