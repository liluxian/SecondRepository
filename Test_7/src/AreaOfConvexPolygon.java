import java.util.Scanner;
import java.lang.Math;

public class AreaOfConvexPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the points: ");
        int n = input.nextInt();
        float[] x = new float[114514];
        float[] y = new float[114514];
        System.out.println("Enter the coordinates of the points:");
        for(int i = 1;i <= n;++ i){
            x[i] = input.nextFloat();
            y[i] = input.nextFloat();
        }
        float s = 0;
        for(int i = 1;i <= n;++ i){
            if(i != n){
                s += x[i] * y[i+1] - x[i+1] * y[i];
            }else{
                s += x[n] * y[1] - x[1] * y[n];
            }
        }
        s = Math.abs(s / 2);
        System.out.print("The total area is ");
        System.out.println(String.format("%.3f",s));
    }
}