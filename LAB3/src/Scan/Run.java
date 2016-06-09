package Scan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniversityMember member = new UniversityMember();
		Book book = new Book();
		Book book1 = new Book();
		Book book2 = new Book();
		Librarian lib = new Librarian();
		Loan loan = new Loan();
		
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("UniversityMember");
			System.out.println("MemberId : ");
			int uid = scan.nextInt();
			System.out.println("MemberName : ");
			String uname = scan.next();
			
			System.out.println("LibrarianId : ");
			int lid = scan.nextInt();
			System.out.println("LibrarianName : ");
			String lname = scan.next();
			System.out.println("MobileNo : ");
			String mobile = scan.next();
			
			System.out.println("Bookid : ");
			int bid = scan.nextInt();
			System.out.println("Author : ");
			String author = scan.next();
			System.out.println("Title : ");
			String title = scan.next();
			System.out.println("Publisher : ");
			String publisher = scan.next();
			System.out.println("NoOfPages : ");
			String noOfPages = scan.next();
			
			System.out.println("Bookid : ");
			int loandid = scan.nextInt();
			System.out.println("Author : ");
			String bdate = scan.next();
			System.out.println("Title : ");
			String redate = scan.next();

			
			
			
			member.setId(uid);
			member.setName(uname);
			
			lib.setLid(lid);
			lib.setlName(lname);
			lib.setMobileNo(mobile);
			
			book.setBookid(bid);
			book.setAuthor(author);
			book.setTitle(title);
			book.setPublisher(publisher);
			book.setNoOfPages(noOfPages);
			
			System.out.println(uid);
		}catch(Exception exception){
			exception.setStackTrace(null);
		}
		
		
		
		
//		System.out.println("\t\t\t\tบันทึกการยืม");
//		System.out.println("รหัสการยืม "+loan.getLoanid());
//		System.out.println("วันที่การยืม "+loan.getBorraw_date());
//		System.out.println("รหัสเจ้าหน้าที่ "+loan.getMember().getId()+"\t"+loan.getMember().getName());
//		System.out.println("รหัสสมาชิก "+loan.getLib().getLid()+"\t"+loan.getLib().getlName());
//		System.out.println("------------------------------------------------");
//		System.out.println("\tลำดับที่\tรหัสหนังสือ\tชื่อหนังสือ\tวันส่งคืน");
//		System.out.println("------------------------------------------------");
//		int count=0;
//			for(int i = 0;i < loan.getBookVector().size();i++){
//				count++;
//				System.out.println(loan.getBookVector().elementAt(i)+"\t"+loan.getReturn_date());
//			}
//			System.out.println("\t\t\t\t\tรวม"+count+"   รายการ");
	}
	
//	public static int getInteger(Scanner scan){
//		try{
//			scan.nextInt();
//		}catch(InputMismatchException input){
//			System.out.println("Error");
//			main(null);
//		}
//		return scan.nextInt();
//	}
//	public static String getString(Scanner scan){
//		try{
//			scan.next();
//		}catch(InputMismatchException input){
//			System.out.println("Error");
//			main(null);
//		}
//		return scan.next();
//	}
}
