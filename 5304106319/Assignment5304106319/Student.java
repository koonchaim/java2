package AssignmentJavaDeveloper;

public class Student {
	private int studentID;
	private String studentName;
	private String Address;
	private GradeReportForm reportForm;
	
	public Student(int studentID, String studentName, String address) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		Address = address;
	}
	
	
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public int getStudentID() {
		return studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String getAddress() {
		return Address;
	}



	public GradeReportForm getReportForm() {
		return reportForm;
	}
	
}
