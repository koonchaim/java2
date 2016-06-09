package Assignment_01;

public class Company {
 private String comName;
 private String comAdd;
public String getComName() {
	return comName;
}
public void setComName(String comName) {
	this.comName = comName;
}
public String getComAdd() {
	return comAdd;
}
public void setComAdd(String comAdd) {
	this.comAdd = comAdd;
}
public Company(String comName, String comAdd) {
	super();
	this.comName = comName;
	this.comAdd = comAdd;
}
 
}
