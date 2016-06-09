package Assignment_01;

public class Authorized extends Person{
	private String position;

	public Authorized(String name, String lname, String position) {
		super(name, lname);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "("+this.getName()+" "+this.getLname()+")";
	}
}
