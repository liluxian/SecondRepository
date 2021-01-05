import java.util.Scanner;
public class storeark {
	public static void main(String[] args) {
		boolean[] tables= new boolean[101];
	    for(int i=1;i<=100;i++) {
	    	tables[i]=true;
	     }
	    for(int student=2;student<=100;student++) {
	    	for(int i=student;i<=100;i=i+student) {
	    		if(tables[i]==true) {tables[i]=false;}
	    	    else {tables[i]=true;}
	    	}
	    }  
	    for(int i=1;i<=100;i++) {
	    	if(tables[i]==true) {System.out.print(i+" ");}
	    }
	}
}
