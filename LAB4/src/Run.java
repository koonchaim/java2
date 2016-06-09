import java.util.Date;
import java.util.Scanner;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examination exam1 = new Examination(12, new Date());
		Student stu1 = new Student("319", "Nopparat");
		Subject sub1 = new Subject("214", "Java");

		// ข้อ1
		Choice c1_1 = new Choice('A', "1");
		Choice c1_2 = new Choice('B', "2");
		Choice c1_3 = new Choice('C', "3");
		Choice c1_4 = new Choice('D', "4");

		Question qut1 = new Question(1, "ม้ามีกี่ขา", 'D');
		qut1.addChoice(c1_1);
		qut1.addChoice(c1_2);
		qut1.addChoice(c1_3);
		qut1.addChoice(c1_4);
		// ข้อ2
		Choice c2_1 = new Choice('A', "ม้า");
		Choice c2_2 = new Choice('B', "ลิง");
		Choice c2_3 = new Choice('C', "ปลา");
		Choice c2_4 = new Choice('D', "นก");

		Question qut2 = new Question(2, "สัตว์ที่บินได้", 'D');
		qut2.addChoice(c2_1);
		qut2.addChoice(c2_2);
		qut2.addChoice(c2_3);
		qut2.addChoice(c2_4);

		sub1.addQuestion(qut1);
		sub1.addQuestion(qut2);

		exam1.addStudent(stu1);
		exam1.addSubject(sub1);

		// หน้าจอ
		System.out.println("\t\t\tข้อสอบวิชา\t" + sub1.getSubjectName());
		System.out.println(qut1.toString());
		qut1.listChoice();

		// ข้อ1
		Scanner scan = new Scanner(System.in);
		System.out.print("คำตอบที่ถูกต้องที่สุดคือ__");
		String user = scan.next();
		char user1 = user.charAt(0);
		qut1.setUserSelect(user1);

		System.out.println("-------------------------");
		
		// ข้อ2
		System.out.println(qut2.toString());
		qut2.listChoice();
		System.out.print("คำตอบที่ถูกต้องที่สุดคือ__");
		String user2 = scan.next();
		char user1_2 = user2.charAt(0);
		qut2.setUserSelect(user1_2);
		
		System.out.println("-------------------------");
		System.out.println("วันที่สอบ   "+exam1.getDate());
		System.out.println("รหัส   "+stu1.getStudentId()+"\t\tชื่อ-สกุล  "+stu1.getStudentName());
		System.out.print("วิชา   "+sub1.getSubjectName()+"\t\tคะแนนสอบที่ได้   ");exam1.check();
	}
}
