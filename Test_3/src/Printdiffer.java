import java.util.Scanner; 
public class Printdiffer {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int [] number =new int [11];
        System.out.print("Enter 10 numbers:");
        for(int i=0;i<10;++i) {
        	int n=input.nextInt();
        	number[i]=n;
        }
        System.out.print("The number of distinct numbers is");
        int x=input.nextInt();
        number [10]=x;
        System.out.print("The distinct numbers are:");
        for(int i=0;i<11;++i) {
        	int step=0;
        	for(int j=0;j<i;++j) {
            	if(number[i]==number[j])step=1;
            }
        	if(step==0)System.out.print(number[i]+" ");
        }
	}
}
