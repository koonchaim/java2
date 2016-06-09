package l1;

import java.util.Vector;

public class Loan {
	private int loanid;
	private String borraw_date;
	private String fixreturn_date;
	private UniversityMember member;
	private Librarian lib;
	private Vector<LoanDetail> loanDetailVector = new Vector<LoanDetail>();

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

	public String getFixreturn_date() {
		return fixreturn_date;
	}

	public void setFixreturn_datee(String fixreturn_date) {
		this.fixreturn_date = fixreturn_date;
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

	public Vector<LoanDetail> getLoanDetailVector() {
		return loanDetailVector;
	}

	public Loan(int loanid, String borraw_date, String fixreturn_date) {
		super();
		this.loanid = loanid;
		this.borraw_date = borraw_date;
		this.fixreturn_date = fixreturn_date;
	}

	public void addLoanDetail(LoanDetail l) {
		loanDetailVector.addElement(l);
	}

	public void checkDatefix() {
		String[] date = fixreturn_date.split("/");
		int day1 = Integer.parseInt(date[0]);
		for (int i = 0; i < loanDetailVector.size(); i++) {
			String[] redate = loanDetailVector.elementAt(i).getReturn_date().split("/");
			int day = Integer.parseInt(redate[0]);
			int total = day - day1;
			int sum = total * 5;
			if (total > 0) {
				System.out.println("ยืมเกนเวลา : " + total +" วัน " + "\tเสียค่าปรับ : "
						+ sum +" บาท ");
			}
		}
	}

	@Override
	public String toString() {
		return loanid + "" + borraw_date + "" + fixreturn_date + "" + member
				+ "" + lib + "," + loanDetailVector;
	}

}
