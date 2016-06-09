import java.util.*;
import java.io.*;

//--!  คลาส ควบคุม การทำงาน ของเมนู  List All Student   --!
public class StudentDetail {

	private String studentId = ""; // ตัวแปร รหัสนักศึกษา
	private String title = ""; // ตัวแปร คำนำหน้าชื่อ
	private String fristName = ""; // ตัวแปร ชื่อ
	private String lastName = ""; // ตัวแปร นามสกุล
	private String department = "";// ตัวแปร สาขา
	private Vector<Student> stuVec = new Vector<Student>(); // Vector เก็บข้อมูล
															// คลาส Student

	public StudentDetail() {
		this.writeStart();
	}

	// ** เพิ่มนักศึกษา ในไฟล์ **
	public void addStudent() {
		Student s = new Student();
		Scanner scan1 = new Scanner(System.in);
		while (true) {
			System.out.println("-- Add Student --");
			System.out
					.println("กรุณากรอกรหัสนักศึกษา(StudentId) ที่ต้องการเพิ่ม : ");
			studentId = scan1.next();

			try {// ตรวจสอบ คำนำหน้าชื่อ ว่าถูกต้องหรือไม่
				Checker.isString(studentId);
				Checker.isNotDuplicateID(studentId, stuVec);
				Checker.isLengthId(10, studentId);
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			s.setStudentId(studentId);

			System.out.println("กรุณากรอกคำนำหน้านักศึกษา(StudentId) ที่ต้องการเพิ่ม : ");
			title = scan1.next();

			try {// ตรวจสอบ คำนำหน้าชื่อ ว่าถูกต้องหรือไม่
				Checker.isTitleName(title);
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			s.setTitle(title);

			System.out.println("กรุณากรอกชื่อนักศึกษา(StudentId) ที่ต้องการเพิ่ม : ");
			fristName = scan1.next();

			try {// ตรวจสอบ ชื่อ ว่าถูกต้องหรือไม่
				Checker.isCheckName(fristName, "First Name");
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			s.setFirstName(fristName);

			System.out.println("กรุณากรอกนามสกุลนักศึกษา(StudentId) ที่ต้องการเพิ่ม : ");
			lastName = scan1.next();

			try { // ตรวจสอบ นามสกุล ว่าถูกต้องหรือไม่
				Checker.isCheckName(lastName, "Last Name");
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}

			s.setLastName(lastName);

			System.out.println("กรุณากรอกสาขา(StudentId) ที่ต้องการเพิ่ม : ");

			department = scan1.next();
			try { // ตรวจสอบ สาขา ว่าถูกต้องหรือไม่
				Checker.isCheckName(department, "Department");
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			s.setDepartment(department);
			stuVec.addElement(s);
			System.out.println("การเพิ่มรายชื่อนักศึกษาเสร็จสมบูรณ์");
			writeStudent(); // เขียนลงไฟล์
			break;
			
		}
	}





	// ** การบรรทึกข้อมูลจากไฟล์ student.txt ลงในตัวแปร stuVec **
	public void writeStart() {
		try {
			Scanner scIn = new Scanner(new File("student.txt"));
			while (scIn.hasNext()) {
				Student st = new Student(scIn.next(), scIn.next(), scIn.next(),
						scIn.next(), scIn.next());
				stuVec.addElement(st);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}

	}

	// ** บรรทึกข้อมูล นักศึกษา ลงในไฟล์ student.txt **
	public void writeStudent() {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(
					"student.txt"));
			for (Student c : stuVec) {
				out.write(c.toString());
				out.newLine();
			}
			out.close();
		} catch (IOException e) {
			System.out.println("Input / Output Stream Error!!");
		}
	}

	// ** ลบข้อมูล นักศึกษาในไฟล์ student.txt **
	public boolean delStudent() {
		// รับค่า รหัสนักศึกษา จากผู้ใช้
		Scanner id = new Scanner(System.in);
		System.out.println("กรุณากรอกรหัส(StudntId)ที่ต้องการลบ :");
		String id1 = id.next();
		if(id1.equalsIgnoreCase("0")){
			return false;
		}
		try{
			Checker.isDuplicateID(id1, stuVec);
		}
		catch(WrongInputException e){
			System.out.println(e.getMessage());
			return true;
		}
		for (int i = 0; i < stuVec.size(); i++) {
			if (id1.equalsIgnoreCase(stuVec.get(i).getStudentId())) {
				stuVec.remove(i);
				System.out.println("ลบรหัสนักศึกษาเสร็จสมบูณร์");
				writeStudent();
				return false;
			}
		}
		
		return true;
	}
	
	public int findStudentId(String stu){
		for (int i = 0; i < stuVec.size(); i++) {
			if(stu.equalsIgnoreCase(stuVec.get(i).getStudentId())){
				return i;
			}
		}
		return -1;
	}
	
	// ** แก้ไขข้อมูล วิชาในไฟล์ student.txt **
	public boolean editStudent() {
		int tmp = -1;
		String titleChk = "";
		String fristNameChk = "";
		String lastNameChk = "";
		String departmentChk = ""; // ตัวแปร สำรองในการรับ ค่าพื้นฐาน
									// ของนักศึกษา
		
		System.out.println("-- Edit Student Details --");
		System.out.println("  ");
		Scanner scBf = new Scanner(System.in);
		System.out.println("กรุณากรอกรหัสนักศึกษา(StudentId) ที่ต้องการแก้ไข : ");
		studentId = scBf.nextLine();
	
		try {
			Checker.isDuplicateID(studentId, stuVec);
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return true;
		}
		tmp = findStudentId(studentId);
		System.out.println("กรุณากรอกคำนำหน้านักศึกษา(StudentId) ที่ต้องการแก้ไข : ");
		titleChk = scBf.nextLine();
		
		try {
			Checker.isTitleName(titleChk);
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return true;
		}
		
		if (!titleChk.equalsIgnoreCase(" ")) {
			stuVec.get(tmp).setTitle(titleChk);
		}
		System.out.println("กรุณากรอกชื่อนักศึกษา(StudentId) ที่ต้องการแก้ไข : ");
		fristNameChk = scBf.nextLine();
		try {
			Checker.isCheckName(fristNameChk, "FirstName");
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return true;
		}
		
		if (!fristNameChk.equalsIgnoreCase(" ")) {
			stuVec.get(tmp).setFirstName(fristNameChk);
		}
		System.out.println("กรุณากรอกนามสกุลนักศึกษา(StudentId) ที่ต้องการแก้ไข : ");
		lastNameChk = scBf.nextLine();
		
		try {
			Checker.isCheckName(lastNameChk, "Lastname");
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return  true;
		}
		
		if (!lastNameChk.equalsIgnoreCase(" ")) {
			stuVec.get(tmp).setLastName(lastNameChk);
		}
		
		
		System.out.println("กรุณากรอกสาขา(StudentId) ที่ต้องการแก้ไข : ");
		departmentChk = scBf.nextLine();
		
		try {
			Checker.isCheckName(departmentChk, "Department");
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return true;
		}
		
		
		if (!departmentChk.equalsIgnoreCase(" ")) {
			stuVec.get(tmp).setDepartment(departmentChk);
		}
		writeStudent();
		System.out.println("การแก้ไขรายชื่อนักศึกษาเสร็จสมบูรณ์");
		return false;
	}

	// ** แสดงรายชื่อนักศึกษา **
	public boolean showListStudent() {
		// ใช้ตรวจสอบ เพื่อแสดงข้อความเตือน "ไม่พบข้อมูลนักศึกษา"

		// ตรวจสอบว่าไฟล์ มีข้อมูลหรือไม่
		try {
			File file = new File("student.txt");
			Scanner scanner = new Scanner(file);
			System.out.println("รายชื่อนักศึกษาทั้งหมด (List All Student)");
			while (scanner.hasNext()) {
				String text = scanner.nextLine();
				Scanner data = new Scanner(text);

				String id = data.next();
				String title = data.next();
				String fname = data.next();
				String lname = data.next();
				String dep = data.next();
				System.out.println(id + "  " + title + " " + fname + "   "
						+ lname + "   " + dep);

			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("ไม่พบข้อมูลนักศึกษา\n");
		}

		return true;
	}

	// ** อ่านข้อมูล จากไฟล์ student.txt เพื่อมาเก็บไว้ที่ตัวแปร ก่อนทำการ
	// แก้ไข**
	public void readForEdit(String studentId) {
		try {
			File file = new File("student.txt");

			Scanner scanner = new Scanner(file);
			System.out.println("รายชื่อนักศึกษาทั้งหมด (List All Student)");
			while (scanner.hasNext()) {
				Student stuEdit = new Student();

				String text = scanner.nextLine();
				Scanner data1 = new Scanner(text);

				String idEdit1 = data1.next();
				String titleEdit = data1.next();
				String fnameEdit = data1.next();
				String lnameEdit = data1.next();
				String depEdit = data1.next();

				stuEdit.setStudentId(idEdit1);
				stuEdit.setTitle(titleEdit);
				stuEdit.setFirstName(fnameEdit);
				stuEdit.setLastName(lnameEdit);
				stuEdit.setDepartment(depEdit);
				stuVec.add(stuEdit);

				System.out.println(idEdit1 + " " + titleEdit + " " + fnameEdit
						+ " " + lnameEdit + " " + depEdit);

			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}

	}

	public Vector<Student> getStuVec() {
		return stuVec;
	}

}
