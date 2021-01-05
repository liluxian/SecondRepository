import java.util.Scanner;
public class Ifsort {
	public static boolean isSorted(int[] list) {
    	for(int i=1;i<list.length;++i) {if(list[i]>list[i-1])return false;}
    	return true;
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int size=input.nextInt();
		System.out.print("Enter the contents of the list: ");
		int[] con=new int[size];
		for(int i=0;i<size;++i) {
			con[i]=input.nextInt();
		}
		System.out.print("The list has "+size +" integers ");
		for(int i=0;i<size;++i) {
			System.out.print(con[i]+" ");
		}
		System.out.println("");
		boolean flag=isSorted(con);
		if(flag)
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
	}
}
