import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Rungpa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			double sumcredit = 0;
			double sum = 0;
			double sumgpa = 0;
			double max = 0;
			double min = 20;
			int total = 0;
			DecimalFormat df = new DecimalFormat("0.00");
			Gpa gpa = new Gpa();
			File file = new File("gpa.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String text = scanner.nextLine();
				Scanner data = new Scanner(text);
				String name = data.next();
				gpa.setName(name);
				String fname = data.next();
				gpa.setFname(fname);

				String text2 = scanner.nextLine();
				Scanner data2 = new Scanner(text2);
				sumcredit = 0;
				sum = 0;
				sumgpa = 0;
				max = 0;
				min = 20;
				
				while (data2.hasNext()) {
					int credit = data2.nextInt();
					gpa.setCredit(credit);
					String grade = data2.next();
					gpa.setGrade(grade);

					sumcredit = sumcredit + credit;
					sum += (credit * gpa.changgpa());
					sumgpa = sum / sumcredit;
					
					if (sumgpa > max) {
						max = sumgpa;
					}
					if (sumgpa < min) {
						min = sumgpa;
					}

				}

				System.out.println("GPA for" + gpa.getName() + " "
						+ gpa.getFname() + " = " + df.format(sumgpa));
				
				

			}
			System.out.println(" ");
			System.out.println("max is:" + df.format(max) + "");
			System.out.println("min is:" + df.format(min) + "");
			scanner.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
