package �����ɵ�������ҵ;
/*����һ���ࣨPerson����ѧ���ࣨStudent��������Ҫ�����£�

��1��Person���а���4��˽���͵����ݳ�Աname��addr��sex��age���ֱ�Ϊ�ַ������ַ����͡��ַ��ͼ����ͣ�
��ʾ��������ַ���Ա�����䡣һ��4�ι��췽����һ�����ι��췽����һ���޲ι��췽����һ�����������ʾ4�����ԡ�

��2��Student��̳�Person�࣬�����ӳ�Աmath��english�����ѧ��Ӣ��ɼ���
һ��6�ι��췽����һ�����ι��췽����һ���޲ι��췽������д�������������ʾ6�����ԡ�

��3����д��������Ը�����
*/

public class Person {
 private String name;
 private String addr;
 private char sex;
 private int age;
 public Person(String na,String ad,char se,int ag) {
	// TODO �Զ����ɵĹ��캯�����
	 this.name=na;
	 this.addr=ad;
	 this.sex=se;
	 this.age=ag;
}
public Person(String na,char se) {
	this(na,"����",se,18);
}
public Person() {
	this("����","�������",'m',18);
}
public void show() {
	System.out.println("������"+this.name);
	System.out.println("��ַ��"+this.addr);
	System.out.println("�Ա�"+this.sex);
	System.out.println("���䣺"+this.age);
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
		this("����","�������",'m',18,ma,en);
	}
	public Student() {
		this("����","�������",'m',18,0,0);
	}
	public void show() {
		super.show();
		System.out.println("Ӣ��ɼ���"+this.english);
		System.out.println("��ѧ�ɼ���"+this.math);
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