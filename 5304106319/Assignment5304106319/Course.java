package AssignmentJavaDeveloper;

public class Course {
	private String courseId;
	private String courseName;
	private int credit;
	private Section sec;
	
	public Course(String courseId, String courseName, int credit) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.credit = credit;
	}
	
	public void setCourse(String courseId,String courseName,int credit){
		this.credit = credit;
		this.courseName = courseName;
		this.courseId = courseId;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getCredit() {
		return credit;
	}

	public Section getSec() {
		return sec;
	}
	
	

}
