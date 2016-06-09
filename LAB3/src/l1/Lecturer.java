package l1;

public class Lecturer extends UniversityMember{
	private String workPhone;
	private String department;
	
	public String getWorkPhone() {
		return workPhone;
	}
	public String getDepartment() {
		return department;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Lecturer(int id, String name, String workPhone, String department) {
		super(id, name);
		this.workPhone = workPhone;
		this.department = department;
	}
	
}
