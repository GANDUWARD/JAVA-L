package �����ɵڶ�����ҵ;
/*����һ��ͼ���࣬�����ݳ�ԱΪ��������ţ����þ�̬����ʵ���Զ���ţ�����ۣ�
 * ��ӵ�о�̬���ݳ�Ա��������¼ͼ����ܲ������ڹ��췽�������ô˾�̬����Ϊ����ı�Ÿ�ֵ��
 * ���������ж���������飬������ܲ�������д��������Ը�����
*/
public class Book {
  private String name;
  private double price;
  private int number;
  static int count=0;
  public Book(String n,double p) {
	// TODO �Զ����ɵĹ��캯�����
	  Book.count++;
	  this.name=n;
	  this.price=p;
	  this.number=Book.count;
}
  public Book() {
	  this("Effective in Java",69.80);
  }
  public void getCount() {
	  System.out.println("�ܲ���"+Book.count);
  }
}
class Test{
	public static void main(String args[]) {
		Book[] books=new Book[3];
	    books[0]=new Book("��ͨ����ѧ",38.00);
	    books[1]=new Book("�������������",0.00);
	    books[2]=new Book();
	    books[0].getCount();
		
	}
}
