import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


@SuppressWarnings("unused")
public class ShowRecipe {
	/*
	 * Start ListRecipe
	 */
	public void listRecipe() throws IOException{
			ShowRecipe sr1 = new ShowRecipe();
			File file = new File("recipe.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String text = scanner.nextLine();
				Scanner data = new Scanner(text);
				String id = data.next();
				String name_coffee = data.next();
				String mash_1 = data.next();
				String mash_2 = data.next();
				String mash_3 = data.nextLine();
				
			
				System.out.println(id+" "+name_coffee+"\t"+mash_1+"\t"+mash_2+"\t"+mash_3);
			}
	
			scanner.close();
		}
	/*
	 * end
	 */
	
}
