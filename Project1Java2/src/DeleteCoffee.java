import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class DeleteCoffee {
	private Vector<Coffee> coffeeVector = new Vector<Coffee>();

	public DeleteCoffee() {
		this.AddCoffee();
	}
	
	public void AddCoffee(){
		try {
			Scanner cofIn = new Scanner(new File("coffee.txt"));
			while (cofIn.hasNext()) {
				Coffee coff = new Coffee(cofIn.next(), cofIn.next(), cofIn.next(),
						cofIn.next(), cofIn.next());
				coffeeVector.add(coff);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}
	}
	
	// ** บรรทึกข้อมูล ลงในไฟล์ coffee.txt **
		public void writeCoffee() {
			try {
				BufferedWriter out = new BufferedWriter(new FileWriter(
						"coffee.txt"));
				for (Coffee coff : coffeeVector) {
					out.write(coff.toString());
					out.newLine();
				}
				out.close();
			} catch (IOException e) {
				System.out.println("Input / Output Stream Error!!");
			}
		}
		
		// ** ลบข้อมูล นักศึกษาในไฟล์ student.txt **
		public boolean delCoffee() {
			// รับค่า รหัสนักศึกษา จากผู้ใช้
			Scanner id = new Scanner(System.in);
			
			ShowCoffee show = new ShowCoffee();
			try {
				show.listCoffee();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("กรุณาเลือกหมายเลขที่ต้องการลบ :");
			String id1 = id.next();
			if(id1.equalsIgnoreCase("0")){
				return false;
			}
			for (int i = 0; i < coffeeVector.size(); i++) {
				if (id1.equalsIgnoreCase(coffeeVector.get(i).getId_coffee())) {
					coffeeVector.remove(i);
					System.out.println("ลบชนิดกาแฟเสร็จสมบูณร์");
					writeCoffee();
					return false;
				}
			}
			
			return true;
		}
}
