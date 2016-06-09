package Assignment_01;

public class HeadDepartment extends Person{
	private String department;

	public HeadDepartment(String name, String lname, String department) {
		super(name, lname);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "("+this.getName()+" "+this.getLname()+")";
	}
}
