import java.util.Vector;


public class Subject {
	private String subjectId;
	private String subjectName;
	private Vector<Question> questionVector = new Vector<Question>();
	
	
	public Subject(String subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}


	public String getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}


	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	public Vector<Question> getQuestionVector() {
		return questionVector;
	}


	public void setQuestionVector(Vector<Question> questionVector) {
		this.questionVector = questionVector;
	}


	public void addQuestion(Question qut){
		questionVector.addElement(qut);
	}

	@Override
	public String toString() {
		return subjectId + "\t"+ subjectName;
	}
	
	
	
}
