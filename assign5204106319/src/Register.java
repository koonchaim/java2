import java.io.*;
import java.util.*;

public class Register {


	public void inputdata(String fname,String lname) throws IOException{
		int c1=0,c2=1;
		boolean fn=false, write=false;
		try{ 
			FileReader file = new FileReader("Student.txt");
	         Scanner scanner = new Scanner(file);
			FileWriter writename = new FileWriter("Student.txt",true);
            BufferedWriter out = new BufferedWriter(writename);
	         
              if(scanner.hasNext()){
            	  while(scanner.hasNext()&&fn==false){
            	String data = scanner.nextLine();
				Scanner input = new Scanner(data);
				String Fname = input.next();
				String Lname = input.next();
		            c2++;
				if(Fname.equals(fname)&&Lname.equals(lname)){
		        	System.out.println("ข้อมูลซ้ำไม่สามารถลงทะเบียนได้"); 
		        	fn=true;
		        	write=false;
				}else{ 
					write=true;
		         }
		         }
            	  if(write==true){
		         out.write(fname);
		         out.write(" "+lname+" "+"000"+c2);
		         out.newLine();
		         System.out.println("การลงทะเบียนเสร็จสมบูรณ์");
		         } 
            }else{  
	         out.write(fname);
	         c1++; 
	         out.write(" "+lname+" "+"000"+c1);
	         out.newLine();
	         System.out.println("การลงทะเบียนเสร็จสมบูรณ์");
            }
              out.close();
              writename.close();
	         scanner.close();
	         file.close();
	        
		}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch (Exception e){		
		System.err.println("Error: " + e.getMessage());	
		}
	}
}