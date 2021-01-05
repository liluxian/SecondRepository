import java.util.Scanner;
public class Exception12_8 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter a hex number: ");
		String hex =input.nextLine();
		try {
			System.out.print("The decimal value for hex number "+hex+" is "+hexToDecimal(hex.toUpperCase()));
			}
		catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	public static int hexToDecimal(String hex) throws Exception12_8 {
		int decimalValue=0;
		for (int i=0;i<hex.length();i++) {
			char hexChar =hex.charAt(i);
 decimalValue=decimalValue*16+ hexToDecimal(hexChar);
		}
		return decimalValue;
	}
	public static int hexToDecimal(char ch) throws Exception12_8 {
		if(ch>='A'&&ch<='F')
			return 10+ch-'A';
		else if(ch<'0'||(ch>'9'&&ch<'A')||ch>'F')
			throw new Exception12_8("It is wrong!");
		else 
			return ch-'0';
	}
}
class Exception12_8 extends Exception{
	public Exception12_8(String msg) {
		super(msg);
	}
}