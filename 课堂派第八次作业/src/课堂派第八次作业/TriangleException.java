package �����ɵڰ˴���ҵ;
/*
�Զ����쳣��TriangleException ��ʾ�������޷����������ε��쳣��
���������У�������������������ܹ����������������ܳ��������
����޷��������������׳�TriangleException�쳣��Ҫ�󲶻�����쳣�������Ϣ������������߲��ܹ��������Ρ���
*/
public class TriangleException extends Exception{
       public TriangleException() {
		// TODO �Զ����ɵĹ��캯�����
    	   super("����������߲��ܹ���������");
	}
}
class Test{
	public static void main(String[] args) {
		int a=1,b=1,c=2;
		try {
			if(a+b<=c||b+c<=a||a+c<=b) {
				throw new TriangleException();
			}else {
				System.out.println("���Թ���������");
			}
		}catch (TriangleException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			
		}
	}
	
}
