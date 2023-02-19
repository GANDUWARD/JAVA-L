import java.util.Scanner;

public class Multitude {
	private int n;
	Multitude(int x){
		this.n=x;
	}
	Multitude(){
		this(0);
	}
	public byte calculate() {
		byte m=1;
		int p=1;
		try  {
		for(int i=1;i<=this.n;i++) {
			m *= i;
			p*= i;
		}
		if(p>Byte.MAX_VALUE) {
			throw new MException();
		}
		}catch(MException e) {
		  System.out.println(e.getMessage());
		}
		finally {
		
		}
		return m;
	}
}
class MException extends Exception{
	MException(){
		super("阶乘大于正常范围！");
	}
}
class Test{
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Multitude m=new Multitude(sc.nextInt());
        if(m.calculate()>0) {
    		System.out.println(m.calculate());
            }
            else {
            	System.out.println("数值异常!");
            }
	}
}
