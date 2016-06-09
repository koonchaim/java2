import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Result {
	public void checkPassword2(String fNames,String lnames,String password)throws IOException{
		boolean chk=false,chk2=false;
		@SuppressWarnings("unused")
		Scanner input =new Scanner(System.in);
		try{
		FileReader file = new FileReader("Student.txt");
        Scanner scanner = new Scanner(file);
       
      	  while(scanner.hasNext()&&chk==false){
      	 String text = scanner.nextLine();
			Scanner data = new Scanner(text);
			String Fname = data.next();
			String Lname = data.next();
      	    String pass=data.next();
      	  if(Fname.equals(fNames)&&Lname.equals(lnames)&&pass.equals(password)){
      		  chk=true;
      		 chk2=true;
      		this.showResult(fNames, lnames);
      	  }
      	  }
      	  if(chk2==false){
      		System.out.println("ข้อมูลลอกอินไม่ถูกต้อง  ไม่สามารถเข้าสู่ระบบได้"); 
      	  }
        scanner.close();
        file.close();
	}catch(FileNotFoundException exc){
		exc.printStackTrace();
    }catch(Exception e){
 	   System.err.println("Error: " + e.getMessage());	
    }
		
}
	
	
	@SuppressWarnings("unused")
	public void showResult(String fNames,String lnames)throws IOException{
		int count=0;
		try{
			System.out.println("ผลการสอบของ "+fNames+"  "+lnames);
			FileReader file2 = new FileReader("StudentExam.txt");
		        Scanner scan=new Scanner(file2);
		while(scan.hasNext()){
			String text =scan.nextLine();
			Scanner data =new Scanner(text);
			int number=data.nextInt();
			String fname1=data.next();
			String lname1=data.next();
			String couse=data.next();
			int time=data.nextInt();
			int points=data.nextInt();
			if(fname1.equals(fNames)&&lname1.equals(lnames)&&couse.equals("คณิตศาสตร์")){
				count++;
				System.out.println(count+" "+"วิชา"+couse+" "+"สอบครั้งที่ "+time+" ได้ "+points+" คะแนน");
			}
			if(fname1.equals(fNames)&&lname1.equals(lnames)&&couse.equals("ภาษาอังกฤษ")){
				count++;
				System.out.println(count+" "+"วิชา"+couse+" "+"สอบครั้งที่ "+time+" ได้ "+points+" คะแนน");
			}
			if(fname1.equals(fNames)&&lname1.equals(lnames)&&couse.equals("สังคมศึกษา")){
				count++;
				System.out.println(count+" "+"วิชา"+couse+" "+"สอบครั้งที่ "+time+" ได้ "+points+" คะแนน");
			}
			if(fname1.equals(fNames)&&lname1.equals(lnames)&&couse.equals("คอมพิวเตอร์")){
				count++;
				System.out.println(count+" "+"วิชา"+couse+" "+"สอบครั้งที่ "+time+" ได้ "+points+" คะแนน");
			}
			
		}
		
		scan.close();
		file2.close();
		
		
		}catch(FileNotFoundException exc){
			exc.printStackTrace();
		}catch(Exception e){
			System.out.println("Error :"+e.getMessage());
		}
		
	}

}
