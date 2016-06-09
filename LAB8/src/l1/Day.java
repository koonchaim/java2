package l1;
import java.util.*;
import java.text.*;
public class Day {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String start = "5/1/2011";
		String end = "18/1/2011";
		
		SimpleDateFormat str = new SimpleDateFormat("dd/MM/yyyy");
		try{
//			   Date d = str.parse(start);
//			   DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
//			   System.out.println(df1.format(d));
//
//
//			   Date e = str.parse(end);
//			   DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT);
//			   System.out.println(df2.format(e));


			   Calendar startdate = Calendar.getInstance();
			   startdate.setTime(str.parse(start));
			   Calendar enddate = Calendar.getInstance();
			   enddate.setTime(str.parse(end));
			   
			   System.out.println("Enter Start Date : "+startdate.get(Calendar.DATE)+ "/" +
					   (startdate.get(Calendar.MONTH)+1) + "/" +
					   startdate.get(Calendar.YEAR));
			   
			   System.out.println("Enter End Date : "+enddate.get(Calendar.DATE)+ "/" +
					   (enddate.get(Calendar.MONTH)+1) + "/" +
					   enddate.get(Calendar.YEAR));
			   int work = 0;
			   int wage =0;
			   while(!startdate.after(enddate)){
				   if(startdate.get(Calendar.DAY_OF_WEEK) != 1 && startdate.get(Calendar.DAY_OF_WEEK) != 7){
					   work++;
					   wage = 200*work;
				   }startdate.add(Calendar.DAY_OF_MONTH, 1);
			   }
			   System.out.println("Working Day = "+work);
			   System.out.println("Calculate Wages = "+wage);
		}catch(java.text.ParseException ex){
			System.out.println("Unable to parse " + str);
		}
	}

}
