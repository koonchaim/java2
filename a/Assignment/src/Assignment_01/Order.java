package Assignment_01;

import java.util.Vector;

public class Order {
	private String dateOrder;
	private String id;
	private String department;
	private Vector<Orderline> orderlineVector = new Vector<Orderline>();
	private Vector<Person> personVector = new Vector<Person>();
	
	public void addperson(Person per){
		personVector.addElement(per);
	}
	public void addOrderline(Orderline ol){
		orderlineVector.addElement(ol);
	}

	public Order(String dateOrder, String id, String department) {
		super();
		this.dateOrder = dateOrder;
		this.id = id;
		this.department = department;
	}

	public String getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Vector<Orderline> getOrderlineVector() {
		return orderlineVector;
	}
	
	public void orderList(){
		for(int i=0;i<orderlineVector.size();i++){
			System.out.println(orderlineVector.elementAt(i));
		}
	}
	public Vector<Person> getPersonVector() {
		return personVector;
	}
	public void personList(){
		for(int i=0;i<personVector.size();i++){
			System.out.println(personVector.elementAt(i));
		}
	}
	public double calSum(){
		double totalnet = 0.0; 
		for(int i=0;i<orderlineVector.size();i++){
			totalnet += ((Orderline) orderlineVector.elementAt(i)).calSum();
		}
		return totalnet; 
	}

	public double calVat(){
		double totalvat = 0.0; 
		for(int i=0;i<orderlineVector.size();i++){
			totalvat += ((Orderline) orderlineVector.elementAt(i)).calVat();
		}
		return totalvat; 
	}
	
	public double calNetTotal(){
		double net = 0.0; 
		for(int i=0;i<orderlineVector.size();i++){
			net += ((Orderline) orderlineVector.elementAt(i)).calNetTotal();
		}
		return net; 
	}
	
	@Override
	public String toString() {
		return "\t\t\t\t\t\t\t|\t"+dateOrder + "\t|\n\t\t\t\t\t\t\t|\t" + id 
				+ "\t|\n\t\t\t\t\t\t\t|\t"+ department+"\t|";
	}
	
	
	
}
