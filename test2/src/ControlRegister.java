import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

//  --!  คลาส ควบคุม การทำงาน เชื่อมโยง ไปยัง  menu ย่อย  ต่างๆ   --!
public class ControlRegister {
	private String input = ""; // ไว้รับค่า หมายเลขที่ผู้ใช้เลือก เพื่อทำงาน
								// แต่ล่ะ เมนู
	private Scanner sc = new Scanner(System.in);
	int n;

	// ** แสดงเมนู List All Student **
	public void listAllStudent() {
		while (true) {
			StudentDetail stDe = new StudentDetail();
			System.out.println("-- List All Students --");
			stDe.showListStudent();// แสดงข้อมูลรายชื่อ นักศึกษา ที่อยู่ในไฟล์
									// student.txt
			System.out.println("\n• เลือกหมายเลข 1 เมื่อต้องการเพิ่มรายชื่อนักศึกษา (Add Student)");
			System.out.println("• เลือกหมายเลข 2 เมื่อต้องการลบรายชื่อนักศึกษา (Delete Student)");
			System.out.println("• เลือกหมายเลข 3 เมื่อต้องการแก้ไขรายละเอียดของนึกศึกษา(Edit Student Details)");
			System.out.println("• เลือกหมายเลข 4 เมื่อต้องการกลับสู่เมนูหลัก(Back to Main Menu)");

			input = sc.next();
			try {
				Checker.isString(input);
			} catch (WrongInputException e) { // แปลกค่า ที่รับมาเป็น ตัวเลขและ
												// ใช้ตรวจสอบ หาก Error
												// จะแจ้งเตือน
				System.out.println(e.getMessage());
				continue;
			}
			n = Integer.parseInt(input);

			try {
				Checker.checkNumber(n, 1, 4);
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
			}

			if (n == 1) {
				stDe.addStudent();
			} else if (n == 2) {
				while (stDe.delStudent());
			} else if (n == 3) {
				while (stDe.editStudent());
			} else if (n == 4) {
				break;
			}

		}
	}

	// ** แสดงเมนู List All Course **
	public void listAllCourse() {
		CourseDetail coDe = new CourseDetail();
		do {
			System.out.println("-- List All Course --");
			coDe.showListCourse();
			System.out.println("• เลือกหมายเลข 1 เมื่อต้องการเพิ่มรายวิชาที่เปิดสอน (Add Course)");
			System.out.println("• เลือกหมายเลข 2 เมื่อต้องการลบรายวิชาที่เปิดสอน (Delete Course)");
			System.out.println("• เลือกหมายเลข 3 เมื่อต้องการแก้ไขรายละเอียดของวิชาที่เปิดสอน(Edit Course Details)");
			System.out.println("• เลือกหมายเลข 4 เมื่อต้องการกลับสู่เมนูหลัก(Back to Main Menu)");
			System.out.println("\nกรุณากรอกค่าตัวเลข 1 - 4 เท่านั้น\n");
						
			try{
				 n = sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("Wrong Input Is Not Number ");
				sc = new Scanner(System.in);
				continue;
			}
			
			try {
				Checker.checkNumber(n, 1, 4);
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
			}
			
			if (n == 1) {
				while (coDe.addCourse())
					;
			} else if (n == 2) {
				coDe.delCourse();
			} else if (n == 3) {
				coDe.editCourse();
			} else if (n == 4) {

			}
		} while (n != 4);

		// แปลกค่า ที่รับมาเป็น ตัวเลขและ ใช้ตรวจสอบ หาก Error จะแจ้งเตือน

		// ตรวจสอบค่าที่ผู้ใช้ป้อน ระหว่างเลข 1 - 4

	}

	// ** แสดงเมนู Register Process **
	public void registerProcess() {
		Register regT = new Register();
		do {
			System.out.println("-- Register Process --");
			System.out.println("• เลือกหมายเลข 1 เพื่อเลือกรายชื่อนักศึกษาที่ต้องการลงทะเบียน (Select Student)");
			System.out.println("• เลือกหมายเลข 2 เพื่อเลือกรายวิชาที่ต้องการลงทะเบียน (Selcet Courses)");
			System.out.println("• เลือกหมายเลข 3 เมื่อต้องการกลับสู่เมนูหลัก(Back to Main Menu)");

			// แปลกค่า ที่รับมาเป็น ตัวเลขและ ใช้ตรวจสอบ หาก Error จะแจ้งเตือน
			System.out.println("\nกรุณากรอกค่าตัวเลข 1 - 3 เท่านั้น\n");
			
			try{
				n = sc.nextInt();
			}
			catch(InputMismatchException ie){
				System.out.println("Wrong Input Is Not Number ");
				sc = new Scanner(System.in);
				continue;
			}
		
			try {
				Checker.checkNumber(n, 1, 3);
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			
			if (n == 1) {
				regT.selectStudent();
			} else if (n == 2) {
				while (regT.selectCourse())
					;
			} else if (n == 3) {
				regT.writeToRegister();
				break;
			}

			// ตรวจสอบค่าที่ผู้ใช้ป้อน ระหว่างเลข 1 - 3
		} while (true);
	}

	// ** แสดง รายชื่อนักศึกษาที่ ลงทะเบียนเสร็จสมบูรณ์ **
	public void listStudentEnroll() {
		
		try {
			Scanner scIn = new Scanner(new File("register.txt"));
			if(!scIn.hasNext()){
				System.out.println("DON'T HAVE STUDENT REGISTERED");
			}
			while (scIn.hasNext()) {
				System.out.println(scIn.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}

		// รับค่าข้อความในไฟล์ register.txt ทีละบรรทัด

		// ตัดข้อความส่งไปเก็บในตัวแปร regis

	}

}// จบ คลาส

