import java.util.*;
import java.io.*;

//--!  คลาส ควบคุม การทำงาน ของเมนู  List All Course   --!
public class CourseDetail {

	private String courseId = ""; // ตัวแปร รหัสวิชา
	private String courseName = ""; // ตัวแปร ชื่อวิชา
	private String date = ""; // ตัวแปร วันที่เปิดสอน
	private String time = ""; // ตัวแปร เวลาที่เปิดสอน
	private String day[] = { "จันทร์", "อังคาร", "พุธ", "พฤหัสบดี", "ศุกร์",
			"เสาร์", "อาทิตย์" }; // ตัวแปร วัน
	private Scanner sc = new Scanner(System.in);

	private Vector<Course> coVec = new Vector<Course>(); // ตัวแปรเก็บค่า
															// วิชาทั้งหมดในไฟล์
															// course.txt

	public CourseDetail() {
		this.writeStart(); // เรียกใช้ เมธอด writeStart()
		// เพื่อทำการบรรทึกข้อมูลวิชา ลงในตัวแปร coVec
	}

	// ** แสดงรายชื่อวิชา **
	public boolean showListCourse() {

		// ใช้ตรวจสอบ เพื่อแสดงข้อความเตือน "ไม่พบข้อมูลรายวิชาที่เปิดสอน"
		if (coVec.size() == 0) {
			System.out.println("ไม่พบข้อมูลรายวิชาที่เปิดสอน\n");
			return false;
		} else {
			for (Course Co : coVec) {
				System.out.println(Co.toString());
			}
			// ตรวจสอบว่า ไฟล์ มีข้อมุลรายวิชาหรือไม่
		}
		return true;
	}

	// ** เพิ่มรายวิชาที่เปิดสอน **
	public boolean addCourse() {

		Course cO = new Course();
		// ใช้ควบคุม while loob
		// ใช้ตรวจสอบ เพื่อแสดงข้อความเตือน "กรอกวันไม่ถูกต้อง"

		System.out.println("\n-- Add Course --");

		System.out.println("กรุณากรอกรหัสวิชา(courseId) ที่ต้องการเพิ่ม : ");
		courseId = sc.next();
		// ตรวจสอบควมถูกต้องของ รหัสวิชา

		try {
			Checker.isString(courseId);
			Checker.isNotDuplicateCourse(courseId, coVec);
			Checker.isLengthCourseId(3, courseId);

		} catch (WrongInputException e) {

			System.out.println(e.getMessage());
			return true;
		}
		cO.setCourseId(courseId);

		// ตรวจสอบ วิชาที่ลงทะเบียนว่า ซ้ำกับวิชาที่ลงทะเบียนไว้แล้วหรือไม่

		System.out.println("กรุณากรอกชื่อวิชา(courseName) ที่ต้องการเพิ่ม : ");
		courseName = sc.next();
		// ตรวจสอบควมถูกต้องของ ชื่อวิชา

		cO.setCourseName(courseName);

		System.out.println("กรุณากรอกวัน(date) ที่ต้องการ : ");
		date = sc.next();
		// ตรวจสอบควมถูกต้องของ วัน ที่เปิดสอน
		try {
			Checker.isCheckDate(date, day);
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return false;
		}

		cO.setDate(date);

		System.out.println("กรุณากรอกเวลา(time) ที่ต้องการ : ");
		time = sc.next();

		try {// ตรวจสอบควมถูกต้องของ เวลา ที่เปิดสอน
			Checker.isCheckTime(time);
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return false;
		}
		cO.setTime(time);

		coVec.addElement(cO);
		writeCourse();
		System.out.println("การเพิ่มรายวิชาที่เปิดสอนเสร็จสมบูรณ์\n");
		return false;
	}

	// public boolean checkTime(String time) {
	//
	//
	// }
	// ** การบรรทึกข้อมูลวิชาจากไฟล์ course.txt ลงในตัวแปร coVec **
	public void writeStart() {
		try {
			Scanner scIn = new Scanner(new File("course.txt"));
			while (scIn.hasNext()) {
				Course co = new Course(scIn.next(), scIn.next(), scIn.next(),
						scIn.next());
				coVec.addElement(co);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}

	}

	// ** บรรทึกข้อมูล วิชา ลงในไฟล์ course.txt **
	public void writeCourse() {

		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter("course.txt"));
			for (Course c : coVec) {
				out.write(c.toString());
				out.newLine();
			}
			out.close();
		} catch (IOException e) {
			System.out.println("Input / Output Stream Error!!");
		}

	}

	// ** ลบข้อมูล วิชาในไฟล์ course.txt **
	public boolean delCourse() {
		// ใช้ตรวจสอบค่ารหัสวิชา ที่ผู้ใช้ป้อนว่าเป็นเลข 0 หรือไม่
		// รับค่า รหัสวิชา จากผู้ใช้

		System.out.println("-- Delete Course --");
		// เรียกใช้งาน เมธอด showListCourse() เพื่อแสดงรายชื่อวิชาที่เปิดสอน

		System.out.println("\nกรุณากรอกรหัสวิชา(courseId)ที่ต้องการลบ : ");
		courseId = sc.next();

		if (courseId.equalsIgnoreCase("0")) {
			return true;
		}

		try {
			Checker.isDuplicateCourse(courseId, coVec);
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return true;
		}

		for (int i = 0; i < coVec.size(); i++) {
			if (courseId.equalsIgnoreCase(coVec.get(i).getCourseId())) {
				coVec.remove(i);
				writeCourse();
				System.out.println("การลบรายชื่อวิชาที่เปิดสอนเสร็จสมบูรณ์");

				return true;
			}
		}
		return false;

	}

	// ** แก้ไขข้อมูล วิชาในไฟล์ course.txt **
	public void editCourse() {
		// ตัวแปร ไว้สำหรับตรวจสอบอักษร ตัวแรกที่ผู้ใช้ป้อน
		// ตัวแปร สำรองในการรับ ค่าพื้นฐาน ของรายวิชา
		// ตัวแปร ตรวจสอบ ความถูกต้องที่ผู้ใช้ได้ดำเนินการ
		int tmp = 0;
		System.out.println("-- Edit Course Details --");
		// Scanner scBf = new Scanner(System.in);
		System.out.println("กรุณากรอกรหัสวิชา(courseId) ที่ต้องการแก้ไข : ");
		courseId = sc.nextLine();

		try {
			Checker.isString(courseId);
			Checker.isLengthCourseId(3, courseId);
			Checker.isDuplicateCourse(courseId, coVec);
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return ;
		}

		System.out.println("กรุณากรอกชื่อวิชา(courseName) ที่ต้องการแก้ไข : ");
		courseName = sc.nextLine();

		if (!courseName.equalsIgnoreCase(" ")) {
			coVec.get(tmp).setCourseName(courseName);
		}

		// ตรวจสอบว่าผู้ใช้กรอกค่า ว่างมาหรือไม่

		System.out.println("กรุณากรอกวัน(date) ที่ต้องการ : ");
		date = sc.nextLine();

		try {
			Checker.isCheckDate(date, day);
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return ;
		}

		System.out.println("กรุณากรอกเวลา(time) ที่ต้องการแก้ไข : ");
		time = sc.nextLine();
		// ทำการตรวจสอบเวลาที่ เมธอด checkTime()

		try {
			Checker.isCheckTime(time);
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return ;
		}

		if (time.equalsIgnoreCase(" ")) {
			coVec.get(tmp).setTime(time);
		}
		writeCourse();
		// บันทึกค่า รายวิชา ที่แก้ไขลงไว้ในตัวแปร coVec
		// ทำการ บันทึกค่ารายวิชาที่แก้ไข โดยทำงานที่ เมธอด writeCourse()
		// ตรวจสอบ ว่าได้แก้ไข รายวิชา เสร็จสมบูรณ์ หรือไม่
		System.out.println("การแก้ไขรายละเอียดรายวิชาที่เปิดสอนเสร็จสมบูรณ์");
		
	}

	public Vector<Course> getCoVec() {
		return coVec;
	}

}
