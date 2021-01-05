import java.util.Scanner;
public class Exception12_7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a bin2 number: ");
		String bin =input.nextLine();
		try{
			System.out.print("The decimal value for bin2 number "+bin+" is "+bin2Dec(bin.toUpperCase()));
			}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static int bin2Dec(String bin) {
		int decimalValue=0;
		for (int i=0;i<bin.length();i++) {
			char hexChar =bin.charAt(i);
            decimalValue=decimalValue*2+ bin2Dec(hexChar);
		}
		return decimalValue;
	}
	private static int bin2Dec(char ch) {
		if(ch>='0'&&ch<='1')
			return ch-'0';
		else 
			throw new NumberFormatException("It is wrong");
	}
}