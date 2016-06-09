import java.util.Date;
import java.util.Vector;


public class Examination {
	private int noOfTimes;
	private int score;
	private Date date;
	private Vector<Student> studentVector = new Vector<Student>();
	private Vector<Subject> subjectVector = new Vector<Subject>();
	
	
	public Examination(int noOfTimes, Date date) {
		super();
		this.noOfTimes = noOfTimes;
		this.date = date;
	}
	public int getNoOfTimes() {
		return noOfTimes;
	}
	public void setNoOfTimes(int noOfTimes) {
		this.noOfTimes = noOfTimes;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Vector<Student> getStudentVector() {
		return studentVector;
	}
	public Vector<Subject> getSubjectVector() {
		return subjectVector;
	}
	public void addStudent(Student stu){
		studentVector.addElement(stu);
	}
	public void addSubject(Subject sub){
		subjectVector.addElement(sub);
	}
	
	public void check(){
		int count=0;
		for(int i=0; i<subjectVector.size(); i++){
			for(int j=0;j<subjectVector.elementAt(i).getQuestionVector().size();j++){
				count++;
				Question c = subjectVector.elementAt(i).getQuestionVector().elementAt(j);
				if(c.getUserSelect() == c.getCorrectAnswer()){
					score++;
				}
			}
		}
		System.out.print(score+"   ข้อ เต็ม   "+count+"   ข้อ");
	}
	
	@Override
	public String toString() {
		return noOfTimes + "\t" + date;
	}
	
	
}
