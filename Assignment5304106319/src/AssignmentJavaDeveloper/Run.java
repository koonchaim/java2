package AssignmentJavaDeveloper;

public class Run {

	public static void main(String[] args) {
		Course c1 = new Course("ȷ242","�����ѧ���੾���Ң� 2  ",3);
		Course c2 = new Course("��311","�����¹���������� 2",3);
		Course c3 = new Course("��323","���ǡ����Ϳ������ 1",3);
		
		Student student1 = new Student(53041063,"�����ʡ� ķ�Ը���","123 �ѹ���� ��§����");
		CalculatorGPA g1 = new CalculatorGPA();
		g1.addCourse(c1, student1, "F", 2);
		g1.addCourse(c2, student1, "C+",3);
		g1.addCourse(c3, student1, "A",1);
		
		Term te = new Term("1/2554");
		te.addCourse(c1);
		te.addCourse(c2);
		te.addCourse(c3);
		GradeReportForm a = new GradeReportForm(te, student1, g1);
		
		System.out.println("��駼š���֡����ǹ�ؤ�� / GRADE REPORT FORM ");
		System.out.println("SEMESTER/ ACADEMIC YEAR     	STUDENT ID");
		System.out.println("    "+te.getTerm()+"                      "+student1.getStudentID());
		System.out.println("Name: " +student1.getStudentName());
		System.out.println("Address: "+student1.getAddress());
		System.out.println("CourseID       CourseTitle     		Credit  	Section 	Grade");
		a.printCourse();
		System.out.println("�š���֡��");
		System.out.println("˹��¡Ե���ŧ/CA      ˹��¡Ե�����/CE       �ô�����/GPA ");
		System.out.println("        "+g1.allCredit()+"            "+g1.sumCredit()+"         "+g1.calGpa());

		
	}
}
	
	

