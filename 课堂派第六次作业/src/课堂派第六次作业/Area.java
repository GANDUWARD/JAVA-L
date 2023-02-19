package �����ɵ�������ҵ;
/*
����һ���ӿ�Area�����а���һ����������ķ���CalsulateArea()��
���MyCircle��MyRectangle�࣬ʵ��Area�ӿ��еķ���CalsulateArea()��
�ֱ����Բ�;��ε��������д�����࣬����������ͷ�����
*/

public interface Area {
  public double CalsulateArea();
  void ShowArea();
}
class MyCircle implements Area{
	public static double Pie=3.1415926;
	private double r;
	public MyCircle(double ri) {
		// TODO �Զ����ɵĹ��캯�����
		this.r=ri;
	}
	public MyCircle() {
		// TODO �Զ����ɵĹ��캯�����
		this(0);
	}
	@Override
	public double CalsulateArea() {
		// TODO �Զ����ɵķ������
		return MyCircle.Pie*this.r*this.r;
	}
	@Override
	public void ShowArea() {
		// TODO �Զ����ɵķ������
		System.out.printf("Բ�ε������%.2f\n",this.CalsulateArea());
		
	}
}
class MyRectangle implements Area{
	private double length;
	private double width;
	public MyRectangle(double l,double w) {
		// TODO �Զ����ɵĹ��캯�����
		this.length=l;
		this.width=w;
	}
	public MyRectangle() {
		// TODO �Զ����ɵĹ��캯�����
		this(0,0);
	}
	@Override
	public double CalsulateArea() {
		// TODO �Զ����ɵķ������
		return this.width*this.length;
	}
	@Override
	public void ShowArea() {
		// TODO �Զ����ɵķ������
		System.out.printf("���ε������%.2f\n",this.CalsulateArea());
	}
}
class Test{
	public static void main(String[] args) {
		Area[] allAreas=new Area[2];
		allAreas[0]=new MyCircle(3.00);
		allAreas[1]=new MyRectangle(3.00,4.00);
		for(Area a:allAreas) {
			a.ShowArea();
		}
	}
}

