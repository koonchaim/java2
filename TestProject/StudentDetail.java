import java.util.*;
import java.io.*;

//--!  ���� �Ǻ��� ��÷ӧҹ �ͧ����  List All Student   --!
public class StudentDetail {

	private String studentId = ""; // ����� ���ʹѡ�֡��
	private String title = ""; // ����� �ӹ�˹�Ҫ���
	private String fristName = ""; // ����� ����
	private String lastName = ""; // ����� ���ʡ��
	private String department = "";// ����� �Ң�
	private Vector<Student> stuVec = new Vector<Student>(); // Vector �红�����
															// ���� Student

	public StudentDetail() {
		this.writeStart();
	}

	// ** �����ѡ�֡�� ���� **
	public void addStudent() {
		Student s = new Student();
		Scanner scan1 = new Scanner(System.in);
		while (true) {
			System.out.println("-- Add Student --");
			System.out
					.println("��سҡ�͡���ʹѡ�֡��(StudentId) ����ͧ������� : ");
			studentId = scan1.next();

			try {// ��Ǩ�ͺ �ӹ�˹�Ҫ��� ��Ҷ١��ͧ�������
				Checker.isString(studentId);
				Checker.isNotDuplicateID(studentId, stuVec);
				Checker.isLengthId(10, studentId);
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			s.setStudentId(studentId);

			System.out.println("��سҡ�͡�ӹ�˹�ҹѡ�֡��(StudentId) ����ͧ������� : ");
			title = scan1.next();

			try {// ��Ǩ�ͺ �ӹ�˹�Ҫ��� ��Ҷ١��ͧ�������
				Checker.isTitleName(title);
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			s.setTitle(title);

			System.out.println("��سҡ�͡���͹ѡ�֡��(StudentId) ����ͧ������� : ");
			fristName = scan1.next();

			try {// ��Ǩ�ͺ ���� ��Ҷ١��ͧ�������
				Checker.isCheckName(fristName, "First Name");
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			s.setFirstName(fristName);

			System.out.println("��سҡ�͡���ʡ�Źѡ�֡��(StudentId) ����ͧ������� : ");
			lastName = scan1.next();

			try { // ��Ǩ�ͺ ���ʡ�� ��Ҷ١��ͧ�������
				Checker.isCheckName(lastName, "Last Name");
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}

			s.setLastName(lastName);

			System.out.println("��سҡ�͡�Ң�(StudentId) ����ͧ������� : ");

			department = scan1.next();
			try { // ��Ǩ�ͺ �Ң� ��Ҷ١��ͧ�������
				Checker.isCheckName(department, "Department");
			} catch (WrongInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
			s.setDepartment(department);
			stuVec.addElement(s);
			System.out.println("���������ª��͹ѡ�֡����������ó�");
			writeStudent(); // ��¹ŧ���
			break;
			
		}
	}





	// ** ��ú�÷֡�����Ũҡ��� student.txt ŧ㹵���� stuVec **
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

	// ** ��÷֡������ �ѡ�֡�� ŧ���� student.txt **
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

	// ** ź������ �ѡ�֡������ student.txt **
	public boolean delStudent() {
		// �Ѻ��� ���ʹѡ�֡�� �ҡ�����
		Scanner id = new Scanner(System.in);
		System.out.println("��سҡ�͡����(StudntId)����ͧ���ź :");
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
				System.out.println("ź���ʹѡ�֡���������ٳ��");
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
	
	// ** ��䢢����� �Ԫ����� student.txt **
	public boolean editStudent() {
		int tmp = -1;
		String titleChk = "";
		String fristNameChk = "";
		String lastNameChk = "";
		String departmentChk = ""; // ����� ���ͧ㹡���Ѻ ��Ҿ�鹰ҹ
									// �ͧ�ѡ�֡��
		
		System.out.println("-- Edit Student Details --");
		System.out.println("  ");
		Scanner scBf = new Scanner(System.in);
		System.out.println("��سҡ�͡���ʹѡ�֡��(StudentId) ����ͧ������ : ");
		studentId = scBf.nextLine();
	
		try {
			Checker.isDuplicateID(studentId, stuVec);
		} catch (WrongInputException e) {
			System.out.println(e.getMessage());
			return true;
		}
		tmp = findStudentId(studentId);
		System.out.println("��سҡ�͡�ӹ�˹�ҹѡ�֡��(StudentId) ����ͧ������ : ");
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
		System.out.println("��سҡ�͡���͹ѡ�֡��(StudentId) ����ͧ������ : ");
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
		System.out.println("��سҡ�͡���ʡ�Źѡ�֡��(StudentId) ����ͧ������ : ");
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
		
		
		System.out.println("��سҡ�͡�Ң�(StudentId) ����ͧ������ : ");
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
		System.out.println("��������ª��͹ѡ�֡����������ó�");
		return false;
	}

	// ** �ʴ���ª��͹ѡ�֡�� **
	public boolean showListStudent() {
		// ���Ǩ�ͺ �����ʴ���ͤ�����͹ "��辺�����Źѡ�֡��"

		// ��Ǩ�ͺ������ �բ������������
		try {
			File file = new File("student.txt");
			Scanner scanner = new Scanner(file);
			System.out.println("��ª��͹ѡ�֡�ҷ����� (List All Student)");
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
			System.out.println("��辺�����Źѡ�֡��\n");
		}

		return true;
	}

	// ** ��ҹ������ �ҡ��� student.txt ����������������� ��͹�ӡ��
	// ���**
	public void readForEdit(String studentId) {
		try {
			File file = new File("student.txt");

			Scanner scanner = new Scanner(file);
			System.out.println("��ª��͹ѡ�֡�ҷ����� (List All Student)");
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
