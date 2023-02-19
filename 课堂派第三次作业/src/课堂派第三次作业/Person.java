package 课堂派第三次作业;
/*建立一个类（Person）和学生类（Student），功能要求如下：

（1）Person类中包含4个私有型的数据成员name、addr、sex、age，分别为字符串、字符串型、字符型及整型，
表示姓名、地址、性别和年龄。一个4参构造方法、一个两参构造方法、一个无参构造方法、一个输出方法显示4种属性。

（2）Student类继承Person类，并增加成员math、english存放数学和英语成绩。
一个6参构造方法、一个两参构造方法、一个无参构造方法和重写输出方法用于显示6种属性。

（3）编写测试类测试各功能
*/

public class Person {
 private String name;
 private String addr;
 private char sex;
 private int age;
 public Person(String na,String ad,char se,int ag) {
	// TODO 自动生成的构造函数存根
	 this.name=na;
	 this.addr=ad;
	 this.sex=se;
	 this.age=ag;
}
public Person(String na,char se) {
	this(na,"东百",se,18);
}
public Person() {
	this("虎哥","沈阳大街",'m',18);
}
public void show() {
	System.out.println("姓名："+this.name);
	System.out.println("地址："+this.addr);
	System.out.println("性别："+this.sex);
	System.out.println("年龄："+this.age);
}
}
class Student extends Person{
	private int math;
	private int english;
	public Student(String na,String ad,char se,int ag,int ma,int en) {
		super(na,ad,se,ag);
		this.english=en;
		this.math=ma;
	}
	public Student(int ma,int en) {
		this("虎哥","沈阳大街",'m',18,ma,en);
	}
	public Student() {
		this("虎哥","沈阳大街",'m',18,0,0);
	}
	public void show() {
		super.show();
		System.out.println("英语成绩："+this.english);
		System.out.println("数学成绩："+this.math);
	}
}
class Test{
   public static void main(String args[]) {
	    Person p=new Person();
	    Student s=new Student();
	    p.show();
	    s.show();
   }
}