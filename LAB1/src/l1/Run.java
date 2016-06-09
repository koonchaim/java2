package l1;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student(1,"A");
		Student stu2 = new Student(2,"B");
		Student stu3 = new Student(3,"C");
		
		Course co1 = new Course("J001","Java");
		co1.addStudent(stu1);
		
		Course co2 = new Course("J002","Java2");
		co2.addStudent(stu1);
		co2.addStudent(stu2);
		co2.addStudent(stu3);
		
//		co1.listStudent();
		co2.listStudent();
		
		co2.dropStudent(stu3);
		
		co2.searchByName("C");
//		co1.searchByName(stu1);
		
	}

}
