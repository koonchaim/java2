public class grade {
	private int stuId;
	private String stuName;
	private int midterm;
	private int finals;
	private int quiz;
	private double sumtotall;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getMidterm() {
		return midterm;
	}

	public void setMidterm(int midterm) {
		this.midterm = midterm;
	}

	public int getFinals() {
		return finals;
	}

	public void setFinals(int finals) {
		this.finals = finals;
	}

	public int getQuiz() {
		return quiz;
	}

	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}

	public double getSumtotall() {
		return sumtotall;
	}

	public void setSumtotall(double sumtotall) {
		this.sumtotall = sumtotall;
	}

	public double sumgrade() {

		return sumtotall = ((midterm * 0.4) + (finals * 0.5) + (quiz * 0.1));

	}

	public char calgrade() {
		if (sumtotall >= 90) {
			return 'A';
		} else if (sumtotall >= 80 && sumtotall <= 89) {
			return 'B';
		} else if (sumtotall >= 70 && sumtotall <= 79) {
			return 'C';
		} else if (sumtotall >= 60 && sumtotall <= 69) {
			return 'D';
		} else {
			return 'F';
		}

	}
	
	public String toString(){
		return  "id :"+stuId+" Name:"+stuName+" Midterm:"+midterm+" Finals:"+finals+" Quiz:"+quiz+" Sum:"+sumgrade()+"\n"+"Grade:"+calgrade();
		
	}

}
