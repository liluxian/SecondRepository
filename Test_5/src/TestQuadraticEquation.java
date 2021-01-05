import java.util.Scanner;
public class TestQuadraticEquation {
    public static void main(String[] args) {
        System.out.print("对于二次方程 ax^2+bx+c=0 ，请输入a,b,c：");
        Scanner input = new Scanner(System.in);
        QuadraticEquation r = new QuadraticEquation();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(r.getDiscriminant(a,b,c) > 0){
            System.out.println("r1 = " + r.getRoot1(a,b,c) + ", r2 = " + r.getRoot2(a,b,c));
        }else if(r.getDiscriminant(a,b,c) == 0){
            System.out.println("r1 = r2 = " + r.getRoot1(a,b,c));
        }else{
            System.out.println("The equation has no roots.");
        }
    }
}
class QuadraticEquation{
    private int a,b,c;
    public int getA(int a){//返回a
        return a;
    }
    public int getB(int b){//返回b
        return b;
    }
    public int getC(int c){//返回c
        return c;
    }
    public int getDiscriminant(int a,int b,int c){//返回判别式
        return (b * b - 4 * a * c);
    }
    public double getRoot1(int a,int b,int c){
        if(getDiscriminant(a,b,c) < 0){
            return 0;
        }
        return ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
    }
    public double getRoot2(int a,int b,int c){
        if(getDiscriminant(a,b,c) < 0){
            return 0;
        }
        return ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
    }
}