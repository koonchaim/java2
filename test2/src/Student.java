
//--!  คลาส ข้อมูลพื้นฐานต่างๆของ นักศึกษา   --!
public class Student {
	
	private String studentId=""; //รหัสนักศึกษา 10 หลัก
	private String title=""; //คำนำหน้า
	private String firstName=""; //ชื่อ
	private String lastName=""; //นามสกุล
	private String department=""; //สาขาวิชา

	public Student(){}
	
	public Student(String studentId, String title, String firstName,
			String lastName, String department) {
		
		this.studentId = studentId;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFristName() {
		return firstName;
	}
	public void setFirstName(String fristName) {
		this.firstName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String toString(){
		return studentId+" "+title+" "+firstName+" "+lastName+" "+department;
	}
	
}
