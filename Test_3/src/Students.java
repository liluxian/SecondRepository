import java.util.Scanner;
public class Students {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("������ѧ��������");
        num = scanner.nextInt();
        String[] name = new String[num];
        double[] result = new double[num];
        for (int i=0; i<num;i++) {
            System.out.print("�������"+(i+1)+"ѧ����������");
            name[i] = scanner.next();
            System.out.print("�������"+(i+1)+"ѧ���ĳɼ���");
            result[i] = scanner.nextDouble();
        }
        listSort (result,name,num);
    }
    private static void listSort(double[] result, String[] name, int num) {
        double tmpResult; 
        String tmpName;  
        for (int i = 0; i < num; i++) {  
            for (int j = i; j < num; j++) {          
                if (result[i] < result[j]) {   
                    tmpResult = result[j];       
                    result[j] = result[i];        
                    result[i] = tmpResult;        
                    tmpName = name[j];            
                    name[j] = name[i];         
                    name[i] = tmpName;       
                }       
            }   
        }     
        System.out.println("������");   
        for (int i = 0; i < num; i++) {      
            System.out.printf(name[i]+"  "); 
        }
    }
}

