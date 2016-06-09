import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


@SuppressWarnings("unused")
public class ShowCoffee{	
	public void listCoffee() throws IOException{
		ShowCoffee sc1 = new ShowCoffee();
		File file = new File("coffee.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
			String text = scanner.nextLine();
			Scanner data = new Scanner(text);
			String id = data.next();			
			String name = data.next();
			String price_small = data.next();
			String price_medium = data.next();
			String price_big = data.next();

			
			System.out.println(id+" "+name+"\t"+price_small+"\t"+price_medium+"\t"+price_big);
		}

		scanner.close();
	}
}
