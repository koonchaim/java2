import java.util.Vector;

public class Question {
	private int questionNo;
	private String question;
	private char correctAnswer;
	private Vector<Choice> choiceVector = new Vector<Choice>();
	private char userSelect;

	public Question(int questionNo, String question, char correctAnswer) {
		super();
		this.questionNo = questionNo;
		this.question = question;
		this.correctAnswer = correctAnswer;
	}

	public Vector<Choice> getChoiceVector() {
		return choiceVector;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public char getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(char correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	

	public char getUserSelect() {
		return userSelect;
	}

	public void setUserSelect(char userSelect) {
		this.userSelect = userSelect;
	}

	public void setChoiceVector(Vector<Choice> choiceVector) {
		this.choiceVector = choiceVector;
	}

	public void addChoice(Choice choice) {
		choiceVector.addElement(choice);
	}
	
	public void listChoice(){
		for(int i =0 ; i < choiceVector.size() ;i++){
			System.out.println(choiceVector.elementAt(i));
		}
	}

	@Override
	public String toString() {
		return "ข้อ   "+questionNo + "\t" + question;
	}

}
