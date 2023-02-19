package 课堂派第六次作业;
/*
定义一个接口Area，其中包含一个计算面积的方法CalsulateArea()，
设计MyCircle和MyRectangle类，实现Area接口中的方法CalsulateArea()，
分别计算圆和矩形的面积，编写测试类，测试以上类和方法。
*/

public interface Area {
  public double CalsulateArea();
  void ShowArea();
}
class MyCircle implements Area{
	public static double Pie=3.1415926;
	private double r;
	public MyCircle(double ri) {
		// TODO 自动生成的构造函数存根
		this.r=ri;
	}
	public MyCircle() {
		// TODO 自动生成的构造函数存根
		this(0);
	}
	@Override
	public double CalsulateArea() {
		// TODO 自动生成的方法存根
		return MyCircle.Pie*this.r*this.r;
	}
	@Override
	public void ShowArea() {
		// TODO 自动生成的方法存根
		System.out.printf("圆形的面积是%.2f\n",this.CalsulateArea());
		
	}
}
class MyRectangle implements Area{
	private double length;
	private double width;
	public MyRectangle(double l,double w) {
		// TODO 自动生成的构造函数存根
		this.length=l;
		this.width=w;
	}
	public MyRectangle() {
		// TODO 自动生成的构造函数存根
		this(0,0);
	}
	@Override
	public double CalsulateArea() {
		// TODO 自动生成的方法存根
		return this.width*this.length;
	}
	@Override
	public void ShowArea() {
		// TODO 自动生成的方法存根
		System.out.printf("矩形的面积是%.2f\n",this.CalsulateArea());
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

