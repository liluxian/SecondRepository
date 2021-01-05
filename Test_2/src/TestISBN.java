import java.util.Scanner;
public class TestISBN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String s=input.nextLine();
		int i=0;
		int sum=0;
		for(i=0;i<s.length();++i) {
			sum=sum+(s.charAt(i)-'0')*(i+1);
		}
		sum=sum%11;
		System.out.print("The ISBN-10 number is ");
		if(sum==10)
			System.out.println(s+"X");
		else {
			System.out.print(s);
		    System.out.print(sum);}
		}
}
