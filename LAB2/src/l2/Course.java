package l2;

import java.util.Vector;

public class Course {
	private String courseName;
	private Vector<Student> studentVector = new Vector<Student>();
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(Student s){
		studentVector.addElement(s);
	}
	
	public void listStudent(){
		for(int i = 0;i < studentVector.size();i++){
			System.out.println(studentVector.elementAt(i));
		}
	}
	
	public double getCourseAverage(){
		double sum = 0.0;
		for(int i = 0 ;i < studentVector.size(); i++){
			sum += studentVector.elementAt(i).getAverageScore();
		}
		return sum/studentVector.size();
	}
	
	public double convertGradeToGPA(Student s){
		for(int i = 0 ; i < studentVector.size();i++){
			if(s.getGrade() == 'A'){
				return 4.0;
			}
			else if(s.getGrade() == 'B'){
				return 3.0;
			}
			else if(s.getGrade() == 'C'){
				return 2.0;
			}
			else if(s.getGrade() == 'D'){
				return 1.0;
			}
		}
		return 0.0;
	}
	
	public double getCourseGPA(){
		double sum=0;
			for(int i = 0 ; i < studentVector.size();i++){
				sum += this.convertGradeToGPA(studentVector.elementAt(i));
			}
		return sum/studentVector.size();
		}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", studentVector="
				+ studentVector + "]";
	}
	
}