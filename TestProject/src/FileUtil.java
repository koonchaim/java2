
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import java.util.Scanner;

public class FileUtil {

	public void inputdata() throws IOException {
		int c1 = 0, c2 = 1;
		boolean fn=false,write = false;

		Scanner input = new Scanner(System.in);
		FileReader file = new FileReader("test.txt");
		Scanner scanner = new Scanner(file);
		FileWriter writename = new FileWriter("test.txt", true);
		BufferedWriter out = new BufferedWriter(writename);
		System.out.print("1.กรุณากรอกส่วนผสมที่ต้องการเพิ่ม  : ");
		int numrecipe = input.nextInt();

		int num = 2;
		
		System.out.print("1.กรุณากรอกชื่อกาแฟ  : ");
		String name = input.next();
		
		if(scanner.hasNext()){
		while(scanner.hasNext()&&fn==false){
			String data = scanner.nextLine();
			Scanner input1 = new Scanner(data);
			String Name = input1.next();
			c2++;
			if(Name.equals(name)){
				System.out.println("ข้อมูลซ้ำไม่สามารถลงทะเบียนได้"); 
	        	fn=true;
	        	write=false;
			}else{ 
				write=true;
	         }
		}
		if(write==true){
			out.write(c2+" "+name);
		}
		}else{  
        	c1++;
        	out.write(c1+" "+name);
		}
		
		
		for (int i = 1; i <= numrecipe; i++) {
			System.out.print(num + ".กรุณากรอกส่วนผสมที่ " + i + "  : ");		
			if (write == true) {				
				String mash1 = input.next();
				out.write(mash1 + " ");				
			} 			
			else {
				String mash1 = input.next();
				out.write(mash1 + " ");
			}
			num++;
		}
		out.newLine();
		System.out.println("การเพิ่มชนิดกาแฟเสร็จสมบูรณ์");
		out.close();
		// pw.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner input = new Scanner(System.in);
		FileUtil fi = new FileUtil();
		do {
			try {

				System.out
						.println("\n*******************************************************************\n");
				num = input.nextInt();
				switch (num) {
				case (1):
					fi.inputdata();
					break;
				default:
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("กรุณากรอกเฉพาะตัวเลข !!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (num != 8);
		System.out
				.println("******************************Exit*********************************");
	}
}