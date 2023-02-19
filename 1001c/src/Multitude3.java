import java.util.Scanner;

public class Multitude3 {
	private int n;
	Multitude3(int x){
		this.n=x;
	}
	Multitude3(){
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
        Multitude3 m=new Multitude3(sc.nextInt());
        byte x=0;
        try {
        	x=m.calculate();
        }catch(MException e) {
        	 System.out.println(e.getMessage());
        }finally {
		if(x>0) {
			System.out.println(x);
		}
        }
	}
}

