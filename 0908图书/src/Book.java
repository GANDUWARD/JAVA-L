
public class Book {
  private String name;
  private int count;
  static int number;
  private double price;
  Book(String a,double b){
	  this.name=a;
	  this.price=b;
	  Book.number+=1;
	  this.count=Book.number;
  }
  Book(double b){
	  this("dusha",b);
  }
  Book(String a){
	  this(a,32.5);
  }
  public void print_number() {
	  System.out.println("号码:"+Book.number);
  }

}
class Test{
	public static void main(String args[]) {
		Book[] list;
		list = new Book[5];
		list[0]=new Book("ga",3);
		list[1]=new Book("du",4);
		list[2]=new Book("ti",5);
		list[3]=new Book("ca",6);
		list[4]=new Book("cu",7);
		list[0].print_number();
	}
}