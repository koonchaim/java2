package Scan;

import java.util.Vector;

public class Loan {
	private int loanid;
	private String borraw_date;
	private String return_date;
	private UniversityMember member;
	private Librarian lib;
	private Vector<Book> bookVector = new Vector<Book>();
	
	

	public int getLoanid() {
		return loanid;
	}

	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}

	public String getBorraw_date() {
		return borraw_date;
	}

	public void setBorraw_date(String borraw_date) {
		this.borraw_date = borraw_date;
	}

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public void setMember(UniversityMember member) {
		this.member = member;
	}

	public void setLib(Librarian lib) {
		this.lib = lib;
	}

	public UniversityMember getMember() {
		return member;
	}

	public Librarian getLib() {
		return lib;
	}

	public Vector<Book> getBookVector() {
		return bookVector;
	}



	public void addBook(Book b){
		bookVector.addElement(b);
	}
	



	@Override
	public String toString() {
		return "Loan=" + loanid + ", borraw_date=" + borraw_date
				+ ", return_date=" + return_date + ", member=" + member
				+ ", lib=" + lib + ", bookVector=" + bookVector + "]";
	}
	
	
}
