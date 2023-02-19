package 课堂派第二次作业;
/*声明一个图书类，其数据成员为书名、编号（利用静态变量实现自动编号）、书价，
 * 并拥有静态数据成员册数、记录图书的总册数，在构造方法中利用此静态变量为对象的编号赋值，
 * 在主方法中定义对象数组，并求出总册数，编写测试类测试各功能
*/
public class Book {
  private String name;
  private double price;
  private int number;
  static int count=0;
  public Book(String n,double p) {
	// TODO 自动生成的构造函数存根
	  Book.count++;
	  this.name=n;
	  this.price=p;
	  this.number=Book.count;
}
  public Book() {
	  this("Effective in Java",69.80);
  }
  public void getCount() {
	  System.out.println("总册数"+Book.count);
  }
}
class Test{
	public static void main(String args[]) {
		Book[] books=new Book[3];
	    books[0]=new Book("普通物理学",38.00);
	    books[1]=new Book("面向对象程序设计",0.00);
	    books[2]=new Book();
	    books[0].getCount();
		
	}
}
