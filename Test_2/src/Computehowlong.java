import java.util.Scanner;
public class Computehowlong {
	public static void main(String[] args) {
		final int radius=10;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a point two coordinates:");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double distance=Math.sqrt(x*x+y*y);
		if(distance<=radius) {
			System.out.println("Point ("+x+", "+y+") is in the circle");
	}
		else {
			System.out.println("Point ("+x+", "+y+") is not in the circle");
	}
    }
}
