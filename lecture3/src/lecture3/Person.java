package lecture3;

public class Person {
      private String name;
      private String addr;
      private char sex;
      private int age;
      Person(String n,String ad,char s,int ag){
    	  this.name=n;
    	  this.addr=ad;
    	  this.sex=s;
    	  this.age=ag;
      }
      Person(String n,char s){
    	  this(n,"Air",s,18);
      }
      Person(){
    	  this("dusha","Air",'m',18);
      }
      public void show() {
    	  System.out.println("name:"+this.name);
    	  System.out.println("address:"+this.addr);
    	  System.out.println("sex:"+this.sex);
    	  System.out.println("age:"+this.age);
      }
}
class Student extends Person{
	private double math;
	private double English;
	Student(String n,String ad,char s,int ag,double m,double e){
	      super(n,ad,s,ag);
	      this.math=m;
	      this.English=e;
	}
	Student(double m ,double e){
		 this("dusha","Air",'m',18,m,e);
	}
    Student(){
    	this("dusha","Air",'m',18,100.0,100.0);
    }
    public void show() {
    	super.show();
    	System.out.println("MATH:"+this.math);
    	System.out.println("ENGLISH:"+this.English);
    }
}
class Test{
	public static void main(String args[]) {
		Person p1=new Person();
		Person p2=new Person("xiao",'f');
		Person p3=new Person("du","Chao",'m',19);
		p1.show();
		p2.show();
		p3.show();
		Student s1=new Student();
		Student s2=new Student(99.0,98.0);
		Student s3=new Student("kna","Kuha",'f',22,97.5,93.7);
		s1.show();
		s2.show();
		s3.show();
	}
}
