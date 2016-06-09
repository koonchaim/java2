
//--!  คลาส ข้อมูลพื้นฐานต่างๆของ รายวิชา   --!
public class Course {
	private String courseId=""; //รหัสวิชา
	private String courseName=""; //ชื่อวิชา
	private String date=""; //วันที่เรียน
	private String time=""; //เวลาเรียน
	
	public Course(String courseId, String courseName, String date, String time) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.date = date;
		this.time = time;
	}
	
	public Course(){}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public String toString(){
		return courseId+" "+courseName+" "+date+" "+time;
	}
}
