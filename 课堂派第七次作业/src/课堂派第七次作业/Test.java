package 课堂派第七次作业;
/*
fact()方法的功能是求n!，阶乘值是byte类型。 当n!值超过byte数据类型的范围(Byte.MAX_VALUE)时，
结果就会出错，但系统并不产生异常，所以要程序员自己产生异常。 在主方法中调用该方法。 
要求用三种方式进行异常处理 
（1）fact()方法捕获异常 
（2）fact()方法声明异常
     主方法捕获异常 
 (3)fact()方法和主方法都声明异常 
*/
class F{
	public byte fact(int n)throws ArithmeticException {
		int mul=1;
		for(int i=n;i>0;i--) {
			mul*=n;
		}
		if(mul>Byte.MAX_VALUE) {
			ArithmeticException e = new ArithmeticException();
			throw e;
		}
		return (byte)mul;
	}
	public F() {
		// TODO 自动生成的构造函数存根
	}
}
public class Test {
	
	public static void main(String[] args) {
		F f=new F();
		byte n=0;
		try {
		  n=f.fact(3);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("出现算数错误！");
		}finally {
			System.out.println(n);
		}
	}
}
