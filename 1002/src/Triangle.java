import java.util.Scanner;

public class Triangle {
 private int a;
 private int b;
 private int c;
 Triangle(int x,int y,int z){
	 try {
		if(x<=0||y<=0||z<=0||x+y<=z||y+z<=z||x+z<=y) {
			throw new TriangleException();
		}
		else{
			this.a=x;
			this.b=y;
			this.c=z;
		}
	 }catch(TriangleException e) {
		 System.out.println(e.getMessage());
	 }finally {
		 
	 }
 }
 Triangle(){
	this(1,1,1);
 }
 public int get_c() {
	 return a+b+c;
 }
 public double get_s() {
	 double p=0.5*this.get_c();
	 double x=Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
	 return x;
 }
}
class TriangleException extends Exception{
    TriangleException(){
    	super("输入的三条边不能构成三角形");
    }
}
class Test{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		Triangle t=new Triangle(x,y,z);
		System.out.println("周长是"+t.get_c()+"  面积是"+t.get_s());
	}
}
