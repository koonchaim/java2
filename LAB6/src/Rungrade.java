import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rungrade {

	public static void main(String[] args) {
		try {
			grade g1 = new grade();
			File file = new File("grade.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String text = scanner.nextLine();
				Scanner data = new Scanner(text);
				
				int id = data.nextInt();
				g1.setStuId(id);
				
				String name = data.next();
				g1.setStuName(name);

				int midterm = data.nextInt();
				g1.setMidterm(midterm);

				int finals = data.nextInt();
				g1.setFinals(finals);

				int quiz = data.nextInt();
				g1.setQuiz(quiz);

				
				System.out.println(g1.toString());
			}

			scanner.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
