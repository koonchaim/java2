import java.util.*;
import java.io.*;

//--!  คลาส ควบคุม การทำงาน ของเมนู  Register Process   --!

public class Register {

	private StudentDetail stDe = new StudentDetail();
	private CourseDetail coDe = new CourseDetail();
	Vector<String> dRegis = new Vector<String>();
	Vector<String> chCo = new Vector<String>();

	private String studentId = "";

	public Register() {
		writeStart();
	}

	public String getStudentID() {
		return studentId;
	}

	public void setStudentID(String studentID) {
		this.studentId = studentID;
	}

	// ** การบรรทึกข้อมูลจากไฟล์ DRegis.txt ลงในตัวแปร dRegis **
	public void writeStart() {
		try {
			Scanner scIn = new Scanner(new File("DRegis.txt"));
			while (scIn.hasNext()) {
				dRegis.addElement(scIn.nextLine());
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found Exception");
		}

	}

	// ** บรรทึกข้อมูล วิชา ลงในไฟล์ DRegis.txt **
	public void writeRegister() {
		String tmp = studentId + " " + chCo.get(0) + " " + chCo.get(1) + " "
				+ chCo.get(2);
		dRegis.addElement(tmp);
		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter("DRegis.txt"));
			for (String s : dRegis) {
				out.write(s);
				out.newLine();
			}
			out.close();
		} catch (IOException e) {
			System.out.println("Input / Output Stream Error!!");
		}

	}

	// ** เลือกนักศึกษา ที่จะทำการลงทะัเบียน **
	public void selectStudent() {
		Scanner sc = new Scanner(System.in);
		stDe.showListStudent();
		while (true) {
			System.out.println("-- Select Student --");
			System.out.println("กรุณากรอกรหัสนักศึกษาที่ต้องการลงทะเบียน : ");
			studentId = sc.next();// ตรวจสอบความถูกต้อง
									// ของรหัสนักศึกษาที่ผู้ใช้กรอก
			if (studentId.equalsIgnoreCase("0")) {
				studentId = " ";
				break;
			}
			try {// ตรวจสอบ คำนำหน้าชื่อ ว่าถูกต้องหรือไม่
				Checker.isString(studentId);
				Checker.isLengthId(10,studentId);
				Checker.isDuplicateID(studentId, stDe.getStuVec());
				//Checker.chkIdStuRegis(studentId);
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				studentId = "";
				continue;
			}
			System.out.println("เลือกนักศึกษาเสร็จสมบูรณ์");
			break;
			// ตรวจสอบค่าที่รับเข้ามาว่าไม่เป็นค่าว่าง และไม่เปน 0
			
		}
	}

	public boolean selectCourse() {
		Scanner sc = new Scanner(System.in);
		// ตัวแปร ใช้ตรวจสอบเงื่อนไขวนLoop และ ข้อความ
		// กำหนดค่า ข้อมูลการลงทะเบียนเริ่มต้น
			
				
		if (studentId.equalsIgnoreCase("")) {
			System.out.println("กรุณาเลือกรหัสนักศึกษา");
			return false;
		}
		
		System.out.println("-- Select Courses --");
		while (true) {
			// เรียกshowListCourse()
			coDe.showListCourse();
			System.out.println("\nกรุณากรอกรหัสรายวิชา  : ");
			String data = sc.next();
			if (data.equalsIgnoreCase("0")) {// ตรวจสอบค่าที่ผู้ใช้กรอกเข้ามา
				if (chCo.size() >= 3) {
					writeRegister();
					break;
				} else {
					System.out.println("เลือกไม่ครบ 3 วิชา");
				}
			}

			try {
				Checker.isString(data);
				Checker.isDuplicateCourse(data, coDe.getCoVec());
				Checker.isLengthCourseId(3, data);

			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}

			chCo.addElement(data);
			
			
				if(!(chCo.size() <= 1)){
			try {
				Checker.checkCoRegis(data, chCo, coDe.getCoVec());
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				break;
			}
				}

		}
		System.out.println("เลือกรายวิชาที่ต้องการลงทะเบียนเรียบร้อยแล้ว");
		return false;
	}

	// ** การบรรทึกข้อมูลการลงทะเบียน ของนักศึกษาไปเก็บในไฟล์ **
	public void writeToRegister() {
		try {
			Scanner scIn = new Scanner(new File("DRegis.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter(
					"register.txt"));
			while (scIn.hasNext()) {
				String tmp = scIn.nextLine();
				for (Student s : stDe.getStuVec()) {
					if (tmp.split(" ")[0].equalsIgnoreCase(s.getStudentId())) {
						out.write(s.toString());
						out.newLine();
					}
				}
				for (int i = 1; i <= 3; i++) {
					for (Course c : coDe.getCoVec()) {
						if (tmp.split(" ")[i].equalsIgnoreCase(c.getCourseId())) {
							out.write("   " + c.toString());
							out.newLine();
						}
					}
				}
			}
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		} catch (IOException e) {
			System.out.println("Input / Output Stream Error!!");
		}
	}

}
