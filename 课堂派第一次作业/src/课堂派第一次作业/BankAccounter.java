package �����ɵ�һ����ҵ;
/*����һ�������˻��࣬��Ĺ��ɰ����������ݣ�

��1�����ݳ�Ա�û����˻����ơ��û����˻���private�������ͣ�

��2���������������������˻����Ƽ��������ù��췽����ɡ�

��3����ѯ���

��4����д������ ���Ը�����*/
public class BankAccounter {
  private String name;
  private double credit;
  public BankAccounter(String n,double c) {
	// TODO �Զ����ɵĹ��캯�����
	this.name=n;
	this.credit=c;
}
  public BankAccounter() {
	  this("����",0.00);
  }
  public void checkCredit() {
	  System.out.println("������"+this.name+"\n��"+this.credit);
  }
}
class Test{
	public static void main(String args[] ){
		BankAccounter b=new BankAccounter();
		b.checkCredit();
	}
}
