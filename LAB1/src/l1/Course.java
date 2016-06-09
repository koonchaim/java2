package l1;

import java.util.Vector;


public class Course {
	private String cid;
	private String cName;
	private Vector<Student> studentVector = new Vector<Student>();
	
	public Course(String cid, String cName) {
		this.cid = cid;
		this.cName = cName;
	}

	public void addStudent(Student stu){
		studentVector.addElement(stu);
	}
	
	public void listStudent(){
		for(int i=0;i<studentVector.size();i++){
			System.out.println(cName);
			System.out.println("ID : "+studentVector.elementAt(i).getId()+
					"            Name : "+studentVector.elementAt(i).getName());
		}
	}
	
	public boolean dropStudent(Student st){
		if(studentVector.contains(st)){
			studentVector.remove(st);
			System.out.println("Drop Compleat");
		}
		return true;
	}
	
	public void searchByName(String name){
		for(int i=0 ;i<studentVector.size();i++){
			if(name.equals(studentVector.elementAt(i).getName())){
				System.out.println(": "+studentVector.elementAt(i).getName()+"   Found");
				return;
			}
			else{
				System.out.println("Not Found");
				return;
			}
		}
	}
}
