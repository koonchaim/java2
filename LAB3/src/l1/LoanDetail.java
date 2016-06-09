package l1;

import java.util.Vector;


public class LoanDetail {
	private String return_date;
	private Vector<Book> bookVector = new Vector<Book>();

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public LoanDetail(String return_date) {
		super();
		this.return_date = return_date;
	}
	

	public Vector<Book> getBookVector() {
		return bookVector;
	}
	
	public void addBook(Book b){
		bookVector.addElement(b);
	}

	@Override
	public String toString() {
		return bookVector.toString();
	}
	
}
