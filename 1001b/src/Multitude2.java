import java.util.Scanner;

public class Multitude2 {
	private int n;
	Multitude2(int x){
		this.n=x;
	}
	Multitude2(){
		this(0);
	}
	public byte calculate() throws MException {
		byte m=1;
		int p=1;
		for(int i=1;i<=this.n;i++) {
			m *= i;
			p*= i;
		}
		if(p>Byte.MAX_VALUE) {
			throw new MException();
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
	public static void main(String[] args)  {
        Scanner sc =new Scanner(System.in);
        Multitude2 m=new Multitude2(sc.nextInt());
        byte x=0;
        x=m.calculate();
		if(x>0) {
			System.out.println(x);
		}
	}
}

