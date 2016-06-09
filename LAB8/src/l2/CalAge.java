package l2;
import java.util.*;
import java.text.*;


public class CalAge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 1990;
		int month = 4;
		int day = 25;
		

	
		try{
			Calendar calendar = Calendar.getInstance();
			
			Calendar c = Calendar.getInstance();
		     
			
			calendar.set(Calendar.YEAR, year); 
			calendar.set(Calendar.MONTH, month); 
			calendar.set(Calendar.DAY_OF_MONTH, day); 
			
			int year1 = calendar.get(Calendar.YEAR);
			int month1 = (calendar.get(Calendar.MONTH)+1);
			int date = calendar.get(Calendar.DATE);
			
			int calmonth;
			int age = (c.get(Calendar.YEAR)-543)-year1;
			
			if((c.get(Calendar.MONTH)+1) < (calendar.get(Calendar.MONTH)+1)){
				calmonth = ((c.get(Calendar.MONTH)+1)+12)-month1;
				age = age-1;
			}else{
				calmonth = (c.get(Calendar.MONTH)+1)-month1;
			}
			
			int calday;
			if(c.get(Calendar.DATE) < calendar.get(Calendar.DATE)){
				calday = (c.get(Calendar.DATE)+30)-date;
				calmonth = calmonth-1;
			}else{
				calday = c.get(Calendar.DATE)-date;
			}
			
			System.out.println("Age : "+age);
			System.out.println("Month : "+calmonth);
			System.out.println("Day : "+calday);
		}catch(Exception ex){
			System.out.println("Unable to parse ");
		}
	}
}
