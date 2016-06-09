
public class Gpa {
	private String name;
	private String fname;
	private int credit;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}

	
	public String getGrade() {
		return grade;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public int changgpa(){
		int gpa =0;
		if(grade.equals("A")){
			gpa = 4;
		}else if(grade.equals("B")){
			gpa = 3;
		}else if(grade.equals("C")){
			gpa =  2;
		}else if(grade.equals("D")){
			gpa = 1;
		}else{
			gpa = 0;
		}
		return gpa;
	}

	
}
