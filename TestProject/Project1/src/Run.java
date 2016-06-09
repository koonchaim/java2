import java.util.*;
import java.io.*;

public class Run {

	public static void main(String[] args) throws Exception {
		// �Ѻ���
		BufferedReader object = new BufferedReader(new InputStreamReader(System.in));  
		
		int numMenu = 0;
		do {
			try {

				System.out
						.println("*******************************************************************\n"
								+ "\tWelcome to the IT Coffee House!\n\n"
								+ "\t\t1. �ʴ���ª��͡�ῷ����� (List All Coffees)\n"
								+ "\t\t2. ������Դ��� (Add Coffee)\n"
								+ "\t\t3. ź��Դ��� (Delete Coffee)\n"
								+ "\t\t4. ��䢪�Դ��� (Edit Coffee)\n"
								+ "\t\t5. �ʴ���¡����ǹ��� (List All Recipes)\n"
								+ "\t\t6. �����¡����ǹ��� (Edit Recipe)\n"
								+ "\t\t7. �ʴ���������´������ (List All Coffees and Recipes)\n"
								+ "\t\t8. ����÷ӧҹ (Exit)\n\n"
								+ "\t��س����͡�����Ţ�����Ѻ��ú�ԡ�õ����1 - 8\n"
								+ "*******************************************************************\n");
				
				numMenu = Integer.parseInt(object.readLine());
				if ((numMenu < 1) || (numMenu > 8)) {
					throw new Exception("��سҡ�͡��ҵ���Ţ 1 -8 ��ҹ��\n");
				}
				Menu menu = new Menu();
				switch (numMenu) {
				case (1):menu.listCoffee();
					break;
				case (2):menu.addCoffee();
					break;
				case (3):menu.deleteCoffee();
					break;
				case (4):menu.editCoffee();
					break;
				case (5):menu.listRecipe();
					break;
				case (6):menu.editRecipe();
					break;
				case (7):menu.listAllCoffee_Recipe();
					break;
				default:
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("��سҡ�͡੾�е���Ţ!!");

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (numMenu != 8);

	}

}
