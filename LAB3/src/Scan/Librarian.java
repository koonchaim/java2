package Scan;

public class Librarian {
	private int lid;
	private String lName;
	private String mobileNo;
	
	public int getLid() {
		return lid;
	}
	public String getlName() {
		return lName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Librarian=" + lid + ", lName=" + lName + ", mobileNo="
				+ mobileNo;
	}
	
	
}
