package 课堂派第一次作业;
/*构造一个银行账户类，类的构成包括如下内容：

（1）数据成员用户的账户名称、用户的账户余额（private数据类型）

（2）方法包括开户（设置账户名称及余额），利用构造方法完成。

（3）查询余额

（4）编写测试类 测试各功能*/
public class BankAccounter {
  private String name;
  private double credit;
  public BankAccounter(String n,double c) {
	// TODO 自动生成的构造函数存根
	this.name=n;
	this.credit=c;
}
  public BankAccounter() {
	  this("张三",0.00);
  }
  public void checkCredit() {
	  System.out.println("姓名："+this.name+"\n余额："+this.credit);
  }
}
class Test{
	public static void main(String args[] ){
		BankAccounter b=new BankAccounter();
		b.checkCredit();
	}
}
