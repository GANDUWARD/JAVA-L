import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
   private String name;
   private String dept;
   private int age;
   private double grade;
   Student(){
	   Scanner sc =new Scanner(System.in);
	   System.out.println("请输入姓名");
	   this.name=sc.nextLine();
	   System.out.println("请输入院系");
	   this.dept=sc.nextLine();
	   System.out.println("请输入年龄");
	   this.age=sc.nextInt();
	   System.out.println("请输入成绩");
	   this.grade=sc.nextDouble();
   }
   public void print() {
	   System.out.println("\t姓名："+this.name+"\t院系:"+this.dept+"\t年龄:"+this.age+"\t成绩:"+this.grade);
   }
}
class Test{
	public static void main(String[] args) {
		Student[] stu=new Student[3];
		ObjectOutputStream oos;
		try {
	    oos=new ObjectOutputStream(new FileOutputStream("student.TXT"));		
		stu[0]=new Student();
		stu[1]=new Student();
		stu[2]=new Student();
		oos.writeObject(stu[0]);
		oos.writeObject(stu[1]);
		oos.writeObject(stu[2]);
		oos.close();
		}catch (FileNotFoundException e) {
			System.out.println("文件查找不到！");
		}catch(IOException e2) {
			System.out.println("文件写入失败");
		}
	ObjectInputStream ois;
		try {
			ois =new ObjectInputStream(new FileInputStream("student.TXT"));
			Student[] s=new Student[3];
			s[0]=(Student)ois.readObject();
			s[1]=(Student)ois.readObject();
			s[2]=(Student)ois.readObject();
			ois.close();
			s[0].print();
			s[1].print();
			s[2].print();
		}catch (FileNotFoundException e) {
			System.out.println("文件查找不到！");
		}catch(IOException e2) {
			System.out.println("文件写入失败");
		}catch(ClassNotFoundException e3) {
			System.out.println("类未找到！");
		}
	}
}
