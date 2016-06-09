package l1;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniversityMember member = new UniversityMember(1024,"นายสมชาย ใจดี");
		
		Student stu = new Student(6319,"Nopparat","IT","3");
		
		Book book = new Book(9101073,"ไสยศาสตร์ความงาม","bbb","03/01/2555","1");
		Book book1 = new Book(9107048,"หวยให้โชค","bbb","03/01/2555","2");
		Book book2 = new Book(9105463,"หมอดูตาทิพย์","bbb","03/01/2555","3");
		
		Librarian lib = new Librarian(397,"นางสาวศรีนวล ณ พร้าว","11111111");
		
		LoanDetail ldetail = new LoanDetail("04/01/2525");
		LoanDetail ldetail1 = new LoanDetail("06/01/2525");
		LoanDetail ldetail2 = new LoanDetail("07/01/2525");
		
		ldetail.addBook(book);
		ldetail1.addBook(book1);
		ldetail2.addBook(book2);
		
		Loan loan = new Loan(1,"01/01/2525","05/01/2525");
		loan.addLoanDetail(ldetail);
		loan.addLoanDetail(ldetail1);
		loan.addLoanDetail(ldetail2);
		
		
		
		loan.setLib(lib);
		loan.setMember(member);
		loan.getLib();
		loan.getMember();
		
		stu.addLoan(loan);
		System.out.println("\t\t\t\tบันทึกการยืม");
		System.out.println("รหัสการยืม "+loan.getLoanid());
		System.out.println("วันที่การยืม "+loan.getBorraw_date());
		System.out.println("รหัสเจ้าหน้าที่ "+loan.getLib().getLid()+"\t"+loan.getLib().getlName());
		System.out.println("รหัสสมาชิก "+stu.getId()+"\t"+stu.getName()+"\t"+stu);
		System.out.println("------------------------------------------------");
		System.out.println("\tลำดับที่\tรหัสหนังสือ\tชื่อหนังสือ\t\tกำหนดส่งส่งคืน\t\tวันส่งคืน\t\tยืมเกนเวลา\t\tสียค่าปรับ");
		System.out.println("------------------------------------------------");
		int count=0;
			for(int i = 0;i < loan.getLoanDetailVector().size();i++){
				count++;
				System.out.println(loan.getLoanDetailVector().elementAt(i)+"\t"+loan.getFixreturn_date()+"\t"+loan.getLoanDetailVector().elementAt(i).getReturn_date());
			}
			System.out.println("รวม\t"+count+"   รายการ");
			
			System.out.println("------------------------------------------------");
			System.out.println("");
			loan.checkDatefix();
	}
}
