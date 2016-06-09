import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Coursename {
	public void subject()throws IOException{
		try{
			String text = "";
	BufferedReader fileInput = new BufferedReader(new FileReader(new File("Course.txt")));
	text = fileInput.readLine();
         	while (text != null) {
         			System.out.println(text);
         			text = fileInput.readLine();
         	}
         	fileInput.close();
			}catch(FileNotFoundException exc){
				exc.printStackTrace();
       }catch(Exception e){
    	   System.err.println("Error: " + e.getMessage());	
       }
}
	
	@SuppressWarnings("unused")
	public void checkCourse(int cours,String fname,String lname)throws Exception{
		boolean end=false; boolean check=false;
		 Examination make =new Examination();
		try{
		FileReader file = new FileReader("Course.txt");
        Scanner scanner = new Scanner(file);
        
        	  while(scanner.hasNext()&&end==false){
        	 String text = scanner.nextLine();
  			Scanner data = new Scanner(text);
  			String course = data.next();
        	  int id=data.nextInt();
        	  if(id==cours){
        		  if(cours==101){
        			  make.Math(fname, lname);
        		  }
        		  if(cours==202){
        			  make.English(fname,lname);
        		  }
        		  if(cours==303){
        			  make.Social(fname, lname);
        		  }
        		  if(cours==404){
        			  make.Computer(fname, lname);
        		  }
        		  end=true;
        		  check=true;
        	  }
        	  }
        	  if(check==false){
        		  System.out.println("รหัสวิชาไม่ถูกต้อง");  
        	  }
        scanner.close();
        file.close();
		}catch(FileNotFoundException exc){
			exc.printStackTrace();
	    }catch(Exception e){
	 	   System.err.println("Error: " + e.getMessage());	
	    }
	}
	
	
	
	public void checkPassword(String fNames,String lnames,String password)throws IOException{
		boolean chk=false,chk2=false;
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
      		this.subject();
      		System.out.println("กรุณากรอกรหัสวิชาที่ต้องการเข้าสอบ....... "); 
      		int coursed=input.nextInt();
      		this.checkCourse(coursed,fNames,lnames);
      	  }
      	  }
      	  if(chk2==false){
      		System.out.println("ข้อมูลล็อกอินไม่ถูกต้อง ไม่สามารถเข้าสู่ระบบได้"); 
      	  }
        scanner.close();
        file.close();
	}catch(FileNotFoundException exc){
		exc.printStackTrace();
    }catch(Exception e){
 	   System.err.println("Error: " + e.getMessage());	
    }
		
	
	
}
	

}
