package 课堂派第八次作业;
/*
自定义异常类TriangleException 表示三条边无法构成三角形的异常。
在主方法中，输入三个整数，如果能构成三角形则求其周长和面积；
如果无法构成三角形则抛出TriangleException异常，要求捕获这个异常，输出信息“输入的三条边不能构成三角形”。
*/
public class TriangleException extends Exception{
       public TriangleException() {
		// TODO 自动生成的构造函数存根
    	   super("输入的三条边不能构成三角形");
	}
}
class Test{
	public static void main(String[] args) {
		int a=1,b=1,c=2;
		try {
			if(a+b<=c||b+c<=a||a+c<=b) {
				throw new TriangleException();
			}else {
				System.out.println("可以构成三角形");
			}
		}catch (TriangleException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			
		}
	}
	
}
