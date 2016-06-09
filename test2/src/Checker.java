import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Checker {
	public static void checkNumber(int number, int lower, int upper)
			throws WrongInputException {
		if (number < lower || number > upper) {
			throw new WrongInputException("Wrong input !! it should be "
					+ lower + " and " + upper + " ");
		}
	}

	public static void isString(String s) throws WrongInputException {
		try {
			Long.parseLong(s);
		} catch (Exception e) {
			throw new WrongInputException("Is Not Number");
		}
	}

	public static void isDuplicateID(String cId, Vector<Student> stuVec)
			throws WrongInputException {

		for (Student c : stuVec) {
			if (cId.equalsIgnoreCase(c.getStudentId())) {
				return;
			}
		}
		throw new WrongInputException("STUDENT ID Not Found " + cId);
	}

	public static void isNotDuplicateID(String cId, Vector<Student> stuVec)
			throws WrongInputException {

		for (Student c : stuVec) {
			if (cId.equalsIgnoreCase(c.getStudentId())) {
				throw new WrongInputException("Is Duplciate STUDENT ID With "
						+ cId);
			}
		}
	}

	public static void isLengthId(int length, String stu)
			throws WrongInputException {

		if (stu.length() != 10) {
			throw new WrongInputException("Length Not  " + length);
		}
	}

	public static void isLengthCourseId(int length, String cou)
			throws WrongInputException {

		if (cou.length() != 3) {
			throw new WrongInputException("Length Not  " + length);
		}
	}

	public static void isTitleName(String title) throws WrongInputException {
		if (!(title.equals("นาย") || title.equals("นางสาว"))) {
			throw new WrongInputException(" Tiltle Invalid!! ");
		}
	}

	public static void isCheckName(String s, String n)
			throws WrongInputException {
		for (int i = 0; i < s.length(); i++) {
			try {
				Integer.parseInt(s.charAt(i) + "");
				throw new WrongInputException(n + " Invalid!! ");
			} catch (WrongInputException e2) {
				throw new WrongInputException(n + " Invalid!! ");
			} catch (Exception e) {
				continue;
			}
		}
	}

	public static void isDuplicateCourse(String cId, Vector<Course> coVec)
			throws WrongInputException {

		for (Course Co : coVec) {
			if (cId.equalsIgnoreCase(Co.getCourseId())) {
				return;
			}
		}
		throw new WrongInputException("Course ID Not Found " + cId);
	}

	public static void isNotDuplicateCourse(String cId, Vector<Course> coVec)
			throws WrongInputException {

		for (Course Co : coVec) {
			if (cId.equalsIgnoreCase(Co.getCourseId())) {
				throw new WrongInputException("Is Duplciate Course ID With "
						+ cId);
			}
		}
	}

	public static void chkIdStuRegis(String sId) throws WrongInputException {

		try {
			Scanner scIn = new Scanner(new File("DRegis.txt"));
			while (scIn.hasNextLine()) {
				String tmp = scIn.nextLine().split(" ")[0];
				if (tmp.equalsIgnoreCase(sId)) {
					return;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}

		throw new WrongInputException("This STUDENTID NOT REGISTERED!  ");
	}

	public static void isCheckDate(String Days, String day[])
			throws WrongInputException {

		for (int i = 0; i < day.length; i++) {
			if (Days.equalsIgnoreCase(day[i])) {
				return;
			}
		}
		throw new WrongInputException("Days is invalid! ");
	}

	public static void checkCoRegis(String coId, Vector<String> chCo,
			Vector<Course> coVec) throws WrongInputException {
		double tSnew = 0, tEnew = 0;
		for (String course : chCo) {
			System.out.println(course);
		}
		String tCo;
		tCo = coId;
		String dayNew = "";
		String day = "";
		double timeStart = 0;
		double timeEnd = 0; // ตัวแปรเวลาสิ้นสุดตัวเดิมที่มีอยู่ในไฟล์
		for (Course c : coVec) {
			if (tCo.equalsIgnoreCase(c.getCourseId())) {
				day = c.getDate();
				tSnew = Double.parseDouble(c.getTime().split("-")[0]);
				tEnew = Double.parseDouble(c.getTime().split("-")[1]);
			}
		}

		for (String s : chCo) {
			for (Course c : coVec) {
				if (s.equalsIgnoreCase(c.getCourseId())) {
					if (!c.getCourseId().equals(tCo)) {
						dayNew = c.getDate();
						timeStart = Double
								.parseDouble(c.getTime().split("-")[0]);
						timeEnd = Double.parseDouble(c.getTime().split("-")[1]);
						if (day.equalsIgnoreCase(dayNew)) {
							if ((tSnew >= timeStart && tSnew <= timeEnd)
									|| (tEnew >= timeStart && tEnew <= timeEnd)) {
								throw new WrongInputException("Is A Same Time ");
							}
						}
					}
				}
			}
		}
		return;
	}

	public static void isCheckTime(String time) throws WrongInputException {

		String[] tmp = new String[2];
		tmp = time.split("-");
		String[] tmsT = new String[2];
		tmsT = tmp[0].split("\\.");
		String[] tmEd = new String[2];
		tmEd = tmp[1].split("\\.");

		int hsT = Integer.parseInt(tmsT[0]);
		int heD = Integer.parseInt(tmEd[0]);
		int msT = Integer.parseInt(tmsT[1]);
		int meD = Integer.parseInt(tmEd[1]);
		int diF = heD - hsT;

		if (hsT >= 8 && hsT <= 18 && hsT < heD && heD >= 8 && heD <= 18) {
			if (msT == 0 && meD == 0) {
				return;
			} else {
				throw new WrongInputException("Time Errors");
			}
		}
		if ((hsT < 8 || hsT > 18) && (heD < 8 || heD > 18)) {
			if ((msT != 0 && meD != 0) || (msT != 0 && meD == 0)
					|| (msT == 0 && meD == 0) || (msT == 0 && meD != 0)) {
				throw new WrongInputException(
						"You input the time incorrect");
			}

		}
		if ((diF >= 0 && diF <= 5)&&(hsT<heD)) {
			return;
		} else {
			throw new WrongInputException("Time Error");
		}
	}

}
