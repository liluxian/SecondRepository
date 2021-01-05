import java.util.Scanner;
public class Luckyticket {
	public static void main(String[] args) {
		int bigs=(int)(Math.random()*900)+100;
		System.out.print("Please enter a 3 digit number:");
        Scanner input=new Scanner(System.in);
        int sc=input.nextInt();
        if(sc==bigs)
        	System.out.print("you get 10000 dollars");
        else {
        	int []a=new int [3];
        	int []b=new int [3];
        	   a[0]=bigs/100;
        	   a[1]=bigs/10%10;
        	   a[2]=bigs%10;
        	   b[0]=sc/100;
        	   b[1]=sc/10%10;
        	   b[2]=sc%10;
        	int step=0;
        	for(int i=0;i<3;++i) {
        		for(int j=0;j<3;++j) {
        			if(a[i]==b[j])
        				++step;
        		}
        	}
        	if(step==3)System.out.print("you get 3000 dollars");
        	else if(step==1)System.out.print("you get 1000 dollars");
        	else System.out.print("you get 0 dollars");
        }



	}
}
