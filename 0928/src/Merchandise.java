import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

public class Merchandise implements Comparable{
   private String name;
   private int number;
   private double price;
   Merchandise(String na,int n,double p){
	   this.name=na;
	   this.number=n;
	   this.price=p;
   }
   Merchandise(String na,double p){
	   this(na,0,p);
   }
   Merchandise(String na){
	   this(na,0,0.00);
   }
   Merchandise(){
	   this("dusha",0,0.00);
   }
   public double get_price() {
	   return this.price;
   }
   public int get_number() {
	   return this.number;
   }
   public void print() {
	   System.out.println("姓名:"+this.name);
	   System.out.println("数目:"+this.number);
	   System.out.println("单价:"+this.price);
   }

   public int compareTo(Object other){
	Merchandise otherOne=(Merchandise)other;
	if(this.get_price()*this.get_number()==otherOne.get_price()*otherOne.get_number())return 0;
	else if(this.get_price()*this.get_number()<otherOne.get_price()*otherOne.get_number())return -1;
	else{
		return 1;
	}
   }
}
class Food extends Merchandise{
	 private String date;
	 private String expiration;
	 Food(String na,int n,double p,String d,String ex){
		 super(na,n,p);
		 this.date=d;
		 this.expiration=ex;
	 }
	 Food(String d,String ex){
		 this("dusha",0,0.00,d,ex);
	 }
	 Food(){
		 this("dusha",0,0.00,"2022.1.1","1年");
	 }
	 public void print() {
		 super.print();
		 System.out.println("日期:"+this.date);
		 System.out.println("保质期:"+this.expiration);
	 }
	 public int compareTo(Object other){
		Merchandise otherOne=(Merchandise)other;
		if(this.get_price()*this.get_number()==otherOne.get_price()*otherOne.get_number())return 0;
		else if(this.get_price()*this.get_number()<otherOne.get_price()*otherOne.get_number())return -1;
		else{
			return 1;
		}
	   }
}
class Clothes extends Merchandise{
	private String type;
	private String material;
	Clothes(String na,int n,double p,String t,String m){
		 super(na,n,p);
		 this.type=t;
		 this.material=m;
	 }
	Clothes(String t,String m){
	     this("dusha",0,0.00,t,m);
	}
	Clothes(){
		 this("dusha",0,0.00,"FX","呢绒");
	}
	public void print() {
		super.print();
		System.out.println("型号:"+this.type);
		System.out.println("材料:"+this.material);
	}
	public int compareTo(Object other){
		Merchandise otherOne=(Merchandise)other;
		if(this.get_price()*this.get_number()==otherOne.get_price()*otherOne.get_number())return 0;
		else if(this.get_price()*this.get_number()<otherOne.get_price()*otherOne.get_number())return -1;
		else{
			return 1;
		}
	   }
}
interface Sum{
	public double sum_up();
}
class Store_regulate implements Sum{
	private Merchandise[] all;
	Store_regulate(Merchandise[] a){
		this.all=a;
	}
	Store_regulate(){
		this(null);
	}
	public double sum_up() {
		double sum=0;
		for(Merchandise i:this.all) {
			sum+=i.get_price()*i.get_number();
		}
		return sum;
	}
	public void sort(){
	for(int i=0;i<2;i++)
		for(int j=0;j<2-i;j++)
		{   
			Merchandise t;
			if(this.all[j].get_price()<this.all[j+1].get_price()){
				  t=this.all[j];
				  this.all[j]=this.all[j+1];
				  this.all[j+1]=t;
			}
		}
	}
	public void show(){
		for(Merchandise i:this.all){
			i.print();
		}
	}
}
interface Comparable{
	int compareTo(Object other);
}
class Test{
	public static void main(String[] args) {
		Merchandise[] m=new Merchandise[3];
		m[0]=new Food("老八秘制小汉堡",3,5.00,"2022.9.6","三个月");
		m[1]=new Food("老八秘制大汉堡",3,5.00,"2022.9.6","三个月");
		m[2]=new Clothes("杰哥同款衬衫",5,12.00,"M","纯棉");
		Store_regulate s=new Store_regulate(m);
		Arrays.sort(m);
	    //s.sort();
		s.show();
		System.out.println("总金为"+s.sum_up());
	}
}