package 课堂派第四次作业;
/*编写程序，模拟汽车租赁业务。要求如下：
某汽车租赁公司出租多种轿车和客车，出租费用以日为单位计算。出租车型及信息如表所示。  
增加租赁卡车业务，计算汽车租赁的总租金；
汽车租赁公司业务扩大，增加了卡车业务，租赁费用以吨位计算，
每吨每天计价50元。要求对系统进行扩展，计算汽车租赁总租金。 */
public class Car {
   private int price;
   private String name;
   private String band;
   public Car(String n,String b) {
	// TODO 自动生成的构造函数存根
	this.price=0;
	this.name=n;
	this.band=b;
}
   public Car() {
	   this("默认车牌","默认品牌");
   }
   public void setPrice(int p) {
	   this.price=p;
   }
   public int getPrice() {
	   return this.price;
   }
   public String getName() {
	   return this.name;
   }
   public String getBand() {
	   return this.band;
   }
}
class Taxi extends Car{
	private String type;
    public Taxi(String n,String b,String t) {
		// TODO 自动生成的构造函数存根
    	super(n,b);
    	this.type=t;
        if(this.type=="本田CRV") {
        	this.setPrice(600);
        }else if(this.type=="福特Escape") {
        	this.setPrice(500);
        }else if(this.type=="本田HRV") {
        	this.setPrice(400);
        }
	}
    public Taxi() {
    	 this("默认车牌","默认品牌","默认型号");
    }
}
class Bus extends Car{
	private String type;
	 public Bus(String n,String b,String t) {
			// TODO 自动生成的构造函数存根
	    	super(n,b);
	    	this.type=t;
	        if(this.type==">16座") {
	        	this.setPrice(1000);
	        }else if(this.type=="<=16座") {
	        	this.setPrice(800);
	        }
		}
	    public Bus() {
	    	 this("默认车牌","默认品牌","默认型号");
	    }
}
class Trunk extends Car{
	private int tons;
	public Trunk(String n,String b,int t) {
		super(n,b);
		if(t>=0) {
			setPrice(t*50);
		}
	}
	public Trunk() {
		this("默认车牌","默认品牌",0);
	}
}
class Consumer{
	private Car[] cars;
	private String name;
	private int days;
	private int cost;
	public Consumer(Car[] c,String n,int d) {
		// TODO 自动生成的构造函数存根
		this.name=n;
		this.days=d;
		this.cars=c;
		this.cost=0;
		for(Car x:this.cars) {
			this.cost+=this.days*x.getPrice();
		}
	}
	public void show() {
		System.out.printf("汽车牌号\t汽车品牌\n");
		for(Car x:this.cars) {
			System.out.printf(x.getName()+"\t"+x.getBand()+"\n");
		}
		System.out.printf("客户名:"+this.name+"租赁天数:"+this.days+"总费用:"+this.cost);
	}
}
class Test{
	public static void main(String args[]) {
		Car[] allCars=new Car[5];
		allCars[0]=new Taxi("京NY28858","宝马","本田CRV");
		allCars[1]=new Taxi("京NNN3284","宝马","本田CRV");
		allCars[2]=new Taxi("京NT43765","别克","福特Escape");
		allCars[3]=new Bus("京5643765","金龙",">16座");
		allCars[4]=new Trunk("京GD56577","解放",24);
		Consumer c=new Consumer(allCars, "沈伟", 5);
		c.show();
	}
}
