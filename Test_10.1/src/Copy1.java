import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
public class Copy1 {
	public static void main(String[] args) throws IOException{
		int byteread=0;
		InputStream in =null;
		OutputStream on =null;
		int sum=0;
		try {
 in=new FileInputStream("C:/Users/41938/Desktop/src.txt");
 on = new FileOutputStream("C:/Users/41938/Desktop/dest.txt");

	        byte[] buffer=new byte[1024];
	        System.out.println("正在加载中");
	        while((byteread=in.read(buffer))!=-1) {
 on.write(buffer, 0, byteread);
 sum+=byteread;
	        	}
	        }
	        catch (FileNotFoundException ex) {
	        	System.out.println(ex.getMessage());
	        } 
			catch (IOException ex) {
				System.out.println(ex.getMessage());
	        } 
			finally {
	            try {
	                if (on != null)
 on.close();
	                if (in != null)
 in.close();
	            } 
	            catch (IOException ex) {
	            	System.out.println(ex.getMessage());
	            }
	            finally {
	            	System.out.println("运行结束");
	            	System.out.println("共"+sum+"个byte");
	            }
			}
		}
}