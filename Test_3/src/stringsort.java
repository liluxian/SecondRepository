import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class stringsort {
    public static String sort(String s) {
    	char [] rookie=s.toCharArray();
    	for(int i=0;i<rookie.length;++i) {
    		for(int j=i;j<rookie.length;++j) {
        		if(rookie[i]>rookie[j]) {
        			char n=rookie[i];
        			rookie[i]=rookie[j];
        			rookie[j]=n;
        		}
        	}
    	}
    	String now="";
    	for(int i=0;i<rookie.length;++i) {
    		now+=rookie[i];
    	}

    	return now;
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        String s=input.next();
        String s1=sort(s);
        System.out.println(s1);
   }
}