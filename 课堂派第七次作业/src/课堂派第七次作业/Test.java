package �����ɵ��ߴ���ҵ;
/*
fact()�����Ĺ�������n!���׳�ֵ��byte���͡� ��n!ֵ����byte�������͵ķ�Χ(Byte.MAX_VALUE)ʱ��
����ͻ������ϵͳ���������쳣������Ҫ����Ա�Լ������쳣�� ���������е��ø÷����� 
Ҫ�������ַ�ʽ�����쳣���� 
��1��fact()���������쳣 
��2��fact()���������쳣
     �����������쳣 
 (3)fact()�������������������쳣 
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
		// TODO �Զ����ɵĹ��캯�����
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
			System.out.println("������������");
		}finally {
			System.out.println(n);
		}
	}
}
