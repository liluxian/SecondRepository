import java.util.Scanner;
public class NumberTimes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100:");
		int[] kss=new int [110];
		while(input.hasNext()) {
			int number=input.nextInt();
			if(number==0)break;
			else kss[number]++;
		}
	    for(int i=1;i<=100;++i) {
	    	if(kss[i]==1)System.out.println(i+" occurs "+kss[i]+" time");
	    	else if(kss[i]>1)System.out.println(i+" occurs "+kss[i]+" times");
	    }
	}
}
