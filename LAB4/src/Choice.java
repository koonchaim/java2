
public class Choice {
	private char choiceNo;
	private String answer;
	public char getChoiceNo() {
		return choiceNo;
	}
	public void setChoiceNo(char choiceNo) {
		this.choiceNo = choiceNo;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Choice(char choiceNo, String answer) {
		super();
		this.choiceNo = choiceNo;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return choiceNo + "\t" + answer;
	}
	
	
}
