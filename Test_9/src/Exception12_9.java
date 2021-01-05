import java.util.Scanner;

public class Exception12_9 {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter a bin2 number: ");
		String bin2 =input.nextLine();
		try {
			System.out.print("The decimal value for bin2 number "+bin2+" is "+bin2ToDecimal(bin2.toUpperCase()));
			}
		catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	public static int bin2ToDecimal(String bin2) throws bin2FormatException {
		int decimalValue=0;
		for (int i=0;i<bin2.length();i++) {
			char bin2Char =bin2.charAt(i);
 decimalValue=decimalValue*2+ bin2ToDecimal(bin2Char);
		}
		return decimalValue;
	}
	public static int bin2ToDecimal(char ch) throws bin2FormatException {
		if(ch>='0'&&ch<='1')
			return ch-'0';
		else 
			throw new bin2FormatException("It is wrong!");
	}
}
class bin2FormatException extends Exception{
	public bin2FormatException(String msg) {
		super(msg);
	}
}