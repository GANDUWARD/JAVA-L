import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stm {
   
}

class Test{
    public static void main(String[] args) {
    	File f=new File("src\\Stm.java");
    	try {
    	FileReader fi=new FileReader(f);
    	int count;
    	StringBuffer buffer =new StringBuffer();
    	while((count=fi.read())!=-1) {
    	  buffer.append((char)count);
    	}
    	System.out.println(buffer);
    	fi.close();
    	}catch(FileNotFoundException e) {
    		System.out.println("找不到该文件！");
    	}catch(IOException e) {
    		System.out.println("输入输出有异常");
    	}finally {
    
    	}
    	File txt=new File("test.txt");
    	try {
    		FileWriter fw=new FileWriter(txt);
    		int ch;
    		String b2;
    		Scanner sc= new Scanner(System.in);
    		b2=sc.nextLine();
    		fw.write(b2);
    		fw.close();
    	}catch(FileNotFoundException e) {
    		System.out.println("找不到该文件！");
    	}catch(IOException e) {
    		System.out.println("输入输出有异常");
    	}finally {
    
    	}
    }
}
