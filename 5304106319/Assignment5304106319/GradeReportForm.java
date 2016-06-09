package AssignmentJavaDeveloper;
import java.util.Vector;

public class GradeReportForm {
	private Term t;
	private Student s;
	private CalculatorGPA cal;

	private Vector<Term> termVector =new Vector<Term>();
	
	public GradeReportForm(Term t,Student s,CalculatorGPA cal) {
		super();
		this.t = t;
		this.s = s;
		this.cal = cal;
	}
	
	public void addTerm(Term arg){
		termVector.add(arg);
	}
	
	public Term getTerm(int index){
		return termVector.elementAt(index);
	}

	
	public void printCourse(){
				for (int i = 0; i < t.courseVector.size(); i++) {
				Course getC = t.courseVector.elementAt(i);
					System.out.println(getC.getCourseId()+"        "+getC.getCourseName()+"          "+getC.getCredit() 
							+"            "+cal.getSection(i) +"                "+cal.getGrade(i));
				}
			}
		}
	
	


