package l1;

import java.util.Vector;

public class UniversityMember {
	private int id;
	private String name;
	private Vector<Loan> loanVector = new Vector<Loan>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Vector<Loan> getLoanVector() {
		return loanVector;
	}
	@Override
	public String toString() {
		return id + "\t" + name;
	}
	public UniversityMember(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void addLoan(Loan lo){
		loanVector.addElement(lo);
	}
	
	
}
