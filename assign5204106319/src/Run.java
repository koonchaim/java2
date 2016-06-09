import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Run {

	@SuppressWarnings("finally")
	public static void main(String[] args) throws IOException {
		int num=0;
		Scanner input =new Scanner(System.in);
	    Register wri = new Register();
	    Coursename show=new  Coursename();
	    Result shows=new Result();
	   while(num!=5){
		try{
			
		System.out.println("Welcome to the Online Examination!");
		System.out.println("1.ลงทะเบียนผู้ใช้ใหม่ (New Register)");
		System.out.println("2.แสดงรายวิชาทั้งหมด (List All Courses)");
		System.out.println("3.ทำข้อสอบ (Do The Examination)");
		System.out.println("4.แสดงผลการสอบ (Show Result)");
		System.out.println("5.จบการทำงาน (Exit)");
		System.out.print("กรุณาเลือกหมายเลขเพื่อรับการบริการตั้งแต่ 1-5......... ");
		num=input.nextInt();

		
		if(num==1){
			System.out.print("1.กรุณากรอกชื่อ  : ");
			String fname=input.next();
			System.out.print("2.กรุณากรอกนามสกุล  : ");
			String lname=input.next();
			wri.inputdata(fname,lname);
		}else if(num==2){
			try{
				String read = "";
		BufferedReader fileInput = new BufferedReader(new FileReader(new File("Course.txt")));
	          read = fileInput.readLine();
	         	while (read != null) {
	         			System.out.println(read);
	         			read = fileInput.readLine();
	         	}
	         	fileInput.close();
				}catch(FileNotFoundException exc){
					exc.printStackTrace();
	       }catch(Exception e){
	    	   System.err.println("Error: " + e.getMessage());	
	       }
			
		}else if(num==3){
			System.out.print("กรุณากรอกชื่อผู้ใช้  : ");
			String fnames=input.next();
			System.out.print("กรุณากรอกนามสกุลผู้ใช้  : ");
			String lnames=input.next();
			System.out.print("กรุณากรอกรหัสผ่าน  : ");
			String password=input.next();
			show.checkPassword(fnames, lnames, password);
		}else if(num==4){
			System.out.print("กรุณากรอกชื่อผู้ใช้  : ");
			String fnames=input.next();
			System.out.print("กรุณากรอกนามสกุลผู้ใช้  : ");
			String lnames=input.next();
			System.out.print("กรุณากรอกรหัสผ่าน  : ");
			String password=input.next();
			shows.checkPassword2(fnames, lnames, password);
		}else if(num==5){
			System.out.println("\t*********Exit********");
		}else{
			throw new Exception();
		}
		
		}catch(InputMismatchException exc){
			System.out.println("กรุณากรอกหมายเลขใหม่อีกครั้ง(กรอกได้เฉพาะหมายเลข 1-5 เท่านั้น)");
			input.next();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			if(num!=5){
				
				System.out.print("กรุณากด ENTER เพื่อกลับสู่เมนูหลัก");
				System.in.read();
				}
				continue;
			}
	   }
	   



	}

}
