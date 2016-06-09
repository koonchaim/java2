package Assignment_01;
//ผู้เสนอราคา
public class Neqotiator extends Person{
	private String nqt_phone;

	public Neqotiator(String name, String lname, String nqt_phone) {
		super(name, lname);
		this.nqt_phone = nqt_phone;
	}

	public String getNqt_phone() {
		return nqt_phone;
	}

	public void setNqt_phone(String nqt_phone) {
		this.nqt_phone = nqt_phone;
	}

	@Override
	public String toString() {
		return "("+this.getName()+" "+this.getLname()+")";
	}
	
}
