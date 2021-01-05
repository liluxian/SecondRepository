import java.util.Scanner;
public class Bubble {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double [] number=new  double[10];
		System.out.print("please enter 10 numbers:" );
		for(int i=0;i<10;++i) {
			number[i]=input.nextDouble();
		}
		for(int i=0;i<10;++i) {
			for(int j=0;j<9;++j) {
				if(number[j]<number[j+1]) {
				double sc;
				sc=number[j];
				number[j]=number[j+1];
				number[j+1]=sc;
				}
			}
		}
		for(int i=0;i<10;++i) System.out.print(number[i]+" ");
	}
}
