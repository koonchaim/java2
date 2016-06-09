
import java.util.Scanner;

public class Run {

	// --! คลาส แสดงคำสั่งการทำงาน ของโปรแกรม --!
	public static void main(String[] args) throws WrongInputException {
		Scanner s = new Scanner(System.in);
		ControlRegister cont = new ControlRegister();
		int n; // ตัวที่จะนำไปเปรียบเทียบค่าในเงื่อนไข
		while (true) {
			System.out.println("\nWelcome to the IT Regis tar System");
			System.out.println("\n1. แสดงรายชื่อนักศึกษาทั้งหมด(List All Students)");
			System.out.println("2. แสดงรายชื่อวิชาที่เปิดสอนทั้งหมด(List All Courses)");
			System.out.println("3. กระบวนการลงทะเบียน(Register Process)");
			System.out.println("4. แสดงรายละเอียดการลงทะเบียน(List Student's Enrollment)");
			System.out.println("5. จบการทำงาน(Exit)");
			System.out.println("\nกรุณาเลือกหมายเลขเพื่อรับการบริการตั้งแต่ 1 - 5\n");

			String tmp = s.next();

			try {
				Checker.isString(tmp);
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			n = Integer.parseInt(tmp);
			try {
			    Checker.checkNumber(n, 1, 5);
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
			}
			if (n == 1) {
				cont.listAllStudent();
			}
			if (n == 2) {
				cont.listAllCourse();
			}
			if (n == 3) {
				cont.registerProcess();
			}
			if (n == 4) {
				cont.listStudentEnroll();
			}
			if (n == 5) {
				break;
			}
		}
	}
}
