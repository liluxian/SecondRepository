import java.util.*;
public class MaximumRowsRndColumns11_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        System.out.println("The random array is");
        int[][] a = new int[n][n];
        int[] maxR = new int[n];
        int[] maxC = new int[n];
        int maxr = 0;
        int maxc = 0;
        for(int i = 0; i < n;++ i){
            for(int j = 0;j < n;++ j){
                a[i][j] = (int)(Math.random() * 2);
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        int k = 0;
        for(int i = 0; i < n;++ i){
            int x = 0;
            for(int j = 0;j < n;++ j){
                if(a[i][j] == 1){
                    x ++;
                }
            }
            if(x > maxr){
                maxr = x;
                maxR[0] = i;
                k = 1;
            }else if(x == maxr){
                maxR[k] = i;
                k++;
            }
        }
        System.out.print("The largest row index: ");
        for(int i = 0;i < k;++i){
            System.out.print(maxR[i]);
            if(i != k-1){
                System.out.print(" ");
            }else{
                System.out.println("");
            }
        }
        k = 0;
        for(int j = 0; j < n;++ j){
            int x = 0;
            for(int i = 0;i < n;++ i){
                if(a[i][j] == 1){
                    x ++;
                }
            }
            if(x > maxc){
                maxc = x;
                maxC[0] = j;
                k = 1;
            }else if(x == maxc){
                maxC[k] = j;
                k++;
            }
        }
        System.out.print("The largest column index: ");
        for(int i = 0;i < k;++i){
            System.out.print(maxC[i]);
            if(i != k-1){
                System.out.print(" ");
            }else{
                System.out.println("");
            }
        }
    }
}