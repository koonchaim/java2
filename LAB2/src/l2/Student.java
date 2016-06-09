package l2;

public class Student {
	private String name;
	private int midtermScore;
	private int finalScore;
	
	public Student(String name) {
		this.name = name;
	}
	
	public boolean setMidtermScore(int midtermScore){
		this.midtermScore = midtermScore;
		if(midtermScore >= 0 && midtermScore <=100){
			return true;
		}
		return false;
	}
	
	public boolean setFinalScore(int finalScore){
		this.finalScore = finalScore;
		if(finalScore >= 0 && finalScore <=100){
			return true;
		}
		return false;
	}
	
	public double getAverageScore(){
		return (midtermScore*0.4)+(finalScore*0.6);
	}
	
	public char getGrade(){
		
		if(this.getAverageScore() >= 90){
			return 'A';
		}
		else if(this.getAverageScore() >= 80 && this.getAverageScore() < 90){
			return 'B';
		}
		else if(this.getAverageScore() >= 70 && this.getAverageScore() < 80){
			return 'C';
		}
		else if(this.getAverageScore() >= 60 && this.getAverageScore() < 70){
			return 'D';
		}
		else{
			return 'F';
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", midtermScore=" + midtermScore
				+ ", finalScore=" + finalScore + "]";
	}
	
}
