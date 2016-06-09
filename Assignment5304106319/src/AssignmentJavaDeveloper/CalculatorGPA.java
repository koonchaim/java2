package AssignmentJavaDeveloper;

import java.util.Vector;

public class CalculatorGPA {
	private Student student;
	private Grade g;
	private Course c;
	double scoreGPA = 0;
	private Vector<Course> courseVector = new Vector<Course>();
	private Vector<String> gradeVector = new Vector<String>();
	private Vector<Integer> sectionVector = new Vector<Integer>();
	
	public void addCourse(Course sub,Student s,String grade,int section){
		courseVector.addElement(sub);
		gradeVector.addElement(grade);
		sectionVector.addElement(section);
		student = s;
	}
	
	public double allCredit(){
		double totalCredit = 0;
			for(int i = 0;i < courseVector.size();i++){
				Course course = courseVector.elementAt(i);
				totalCredit +=course.getCredit();
			}
		return totalCredit;
	}
	
	public double sumCredit(){
		double sumTotal = 0;
		for (int i = 0; i < courseVector.size(); i++) {
			if(convertGrade(i)!=0)
				sumTotal += courseVector.elementAt(i).getCredit();
		}
		return sumTotal;
	}
	
	public double calGpa(){
		double gpa=0;
		for (int i = 0; i < courseVector.size(); i++) {
			gpa += convertGrade(i)*courseVector.elementAt(i).getCredit();
		}
		return (gpa) / allCredit();
	}
	
	public int getSection(int i){
		return sectionVector.elementAt(i);
	}
	
	public String getGrade(int i){
		return gradeVector.elementAt(i);
	}
	
	public double convertGrade(int i){

		if(((String) gradeVector.get(i)).equals("A")){
			return scoreGPA = 4;
		}
		else if(((String) gradeVector.get(i)).equals("B+")){
			return scoreGPA = 3.5;
		}
		else if(((String) gradeVector.get(i)).equals("B")){
			return scoreGPA = 3;
		}
		else if(((String) gradeVector.get(i)).equals("C+")){
			return scoreGPA = 2.5;
		}
		else if(((String) gradeVector.get(i)).equals("C")){
			return scoreGPA = 2;
		}
		else if(((String) gradeVector.get(i)).equals("D+")){
			return scoreGPA = 1.5;
		}
		else if(((String) gradeVector.get(i)).equals("D")){
			return scoreGPA = 1;
		}
		else{
			return scoreGPA = 0;
		}
	}
}
