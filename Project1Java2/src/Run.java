import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


@SuppressWarnings("unused")
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		int num=0;
		Scanner input =new Scanner(System.in);
		AddCoffee add = new AddCoffee();
		ShowCoffee showCoff = new ShowCoffee();
		ShowRecipe showRecipe = new ShowRecipe();
		ListCoffeeAndRecipe list = new ListCoffeeAndRecipe();
		DeleteCoffee del = new DeleteCoffee();
		
		Menu menu = new Menu();
		
		do{
			try{
				
				System.out.println("\n*******************************************************************\n"+
						"\tWelcome to the IT Coffee House!\n\n" +
						"\t\t1. แสดงรายชื่อกาแฟทั้งหมด (List All Coffees)\n"+
						"\t\t2. เพิ่มชนิดกาแฟ (Add Coffee)\n"+
						"\t\t3. ลบชนิดกาแฟ (Delete Coffee)\n"+
						"\t\t4. แก้ไขชนิดกาแฟ (Edit Coffee)\n"+
						"\t\t5. แสดงรายการส่วนผสม (List All Recipes)\n"+
						"\t\t6. แก้ไขรายการส่วนผสม (Edit Recipe)\n"+
						"\t\t7. แสดงรายละเอียดทั้งหมด (List All Coffees and Recipes)\n"+
						"\t\t8. จบการทำงาน (Exit)\n\n"+
						"\tกรุณาเลือกหมายเลขเพื่อรับการบริการตั้งแต่1 - 8\n"+
						"*******************************************************************\n");
				num=input.nextInt();
				
				if(num < 1 || num > 8){
					throw new Exception("กรุณากรอกค่าตัวเลข 1-8 เท่านั้น \n");
				}
				
				switch(num){
				case(1):menu.listCoffee();break;
				case(2):menu.addCoffee();break;
				case(3):menu.deleteCoffee();break;
				case(4):menu.editCoffee();break;
				case(5):menu.listRecipe();break;
				case(6):menu.editRecipe();break;
				case(7):menu.listAllCoffee_Recipe();break;
				
				default:break;
				}
			
			}catch(NumberFormatException e){
				System.out.println("กรุณากรอกเฉพาะตัวเลข !!");
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		
		}while(num!=8);
		System.out.println("******************************Exit*********************************");
	}	
}
