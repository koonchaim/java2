package AssignmentJavaDeveloper;

import java.util.Vector;

public class Term {
	private String term;
	private Course course;
	Vector<Course> courseVector = new Vector<Course>();
	
	
	public Term(String term) {
		super();
//		this.course = course;
		this.term = term;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Course getCourse() {
		return course;
	}
	
	public void addCourse(Course sub){
		courseVector.addElement(sub);

	}

	
	

}
