import java.util.*;

public class Order {
	private CalOrder calOrder;
	private String orderId;
	private String address;
	private String telephone;
	private Vector<CalOrder> lineItems = new Vector<CalOrder>();

	public Order() {
	}

	public Order(String pid,String add,String tel) {
		orderId = pid;
		address = add;
		telephone = tel;
	}

	public void addCalOrder(CalOrder cal) {
		lineItems.add(cal);
	}

	public String toString() {
		return 	"" + address + "\n"
				+"TelePhone : " + telephone + "\n\n"
				+"Table ID : " + orderId + "\n\n"
				+"\t ID \t List \t Price \tNumber   Total \n"
				+lineItems.elementAt(0).displayLine() + "\n\t\t\t\ttotal =  "
				+lineItems.elementAt(0).calTotal();
	}
}
