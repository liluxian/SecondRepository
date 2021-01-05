import java.util.Scanner;
public class PointinCircle {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, and radius:");
		double x1=input.nextDouble(),y1=input.nextDouble(),r1=input.nextDouble();
	    System.out.print("Enter r2's center x-, y-coordinates, and radius:");
	    double x2=input.nextDouble(),y2=input.nextDouble(),r2=input.nextDouble();
	    double x3=x1-x2,y3=y1-y2,cj=Math.sqrt(x3*x3+y3*y3);
	    if(cj<=Math.abs(r1-r2))
	    	System.out.println("circle2 is inside circle1");
	    else if(cj<=r1+r2)
	        System.out.println("circle2 is overlaps circle1");
	    else
	        System.out.println("circle2 does not overlap circle1");
	}
}

