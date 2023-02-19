import java.util.Scanner;

public class Multitude {
	private int n;
	Multitude(int x){
		this.n=x;
	}
	Multitude(){
		this(0);
	}
	public int calculate() throws MException {
		int m=1;
		try  {
		for(int i=1;i<=this.n;i++) {
			m *= i;
		}
		if(m>Byte.MAX_VALUE) {
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
	public static void main(String[] args) throws MException {
        Scanner sc =new Scanner(System.in);
        Multitude m=new Multitude(sc.nextInt());
		try{
			if(m.calculate()>Byte.MAX_VALUE) {
				throw new MException();
			}
		}catch(MException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(m.calculate());
		}
		
	}
}
