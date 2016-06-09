package l1;

public class Student extends UniversityMember{
	private String major;
	private String classLevel;
	
	public String getMajor() {
		return major;
	}
	public String getClassLevel() {
		return classLevel;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}
	public Student(int id, String name, String major, String classLevel) {
		super(id, name);
		this.major = major;
		this.classLevel = classLevel;
	}
	@Override
	public String toString() {
		return "" + major + "\t" + classLevel;
	}
	
	
}
