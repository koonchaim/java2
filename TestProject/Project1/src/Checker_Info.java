
public class Checker_Info {
	public static void isString (String s) throws ShowMessageErrorInputException{
		try{
			Integer.parseInt(s);
		}
		catch(Exception e){
			throw new ShowMessageErrorInputException("ไม่ใช่ตัวเลข");
		}
	}
	public static void checkName (String s,String x)throws ShowMessageErrorInputException{
		for(int i=0;i<s.length();i++){
			try {
				Integer.parseInt(s.charAt(i) + "");
				throw new ShowMessageErrorInputException(x + " Invalid!! ");
			} catch (ShowMessageErrorInputException sme) {
				throw new ShowMessageErrorInputException(x + " Invalid!! ");
			} catch (Exception e) {
				continue;
			}
		}
	}
	public static void checkFirstNameCharacter(String s)throws ShowMessageErrorInputException{
		char text;
		for(int i=0;i<s.length();i++){
			text = s.charAt(0);
			if(text == 'A'||text == 'B'||text == 'C'||text == 'D'||text == 'E'||
					text == 'F'||text == 'G'||text == 'H'||text == 'I'||text == 'J'||
					text == 'K'||text == 'L'||text == 'M'||text == 'N'||text == 'O'||
					text == 'P'||text == 'Q'||text == 'R'||text == 'S'||text == 'T'||
					text == 'U'||text == 'V'||text == 'W'||text == 'X'||text == 'Y'||
					text == 'Z'){
				return;
			}
		}
		throw new ShowMessageErrorInputException("ตัวอักษรตัวแรกต้องเป้นตัวใหญ่เท่านั้น");
	}
	public static void checkNumber(int number,int min,int max)throws ShowMessageErrorInputException{
		if(number < min || number > max){
			throw new ShowMessageErrorInputException("กรุณากรอกค่าตั้งแต่ "+min+" ถึง "+max+" เท่านั้น");
		}
	}

}
