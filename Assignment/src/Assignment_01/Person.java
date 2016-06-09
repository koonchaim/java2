package Assignment_01;

public class Person {
	private String name;
	private String lname;
	
	public Person(String name, String lname) {
		super();
		this.name = name;
		this.lname = lname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
