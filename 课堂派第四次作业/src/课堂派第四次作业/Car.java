package �����ɵ��Ĵ���ҵ;
/*��д����ģ����������ҵ��Ҫ�����£�
ĳ�������޹�˾������ֽγ��Ϳͳ��������������Ϊ��λ���㡣���⳵�ͼ���Ϣ�����ʾ��  
�������޿���ҵ�񣬼����������޵������
�������޹�˾ҵ�����������˿���ҵ�����޷����Զ�λ���㣬
ÿ��ÿ��Ƽ�50Ԫ��Ҫ���ϵͳ������չ������������������� */
public class Car {
   private int price;
   private String name;
   private String band;
   public Car(String n,String b) {
	// TODO �Զ����ɵĹ��캯�����
	this.price=0;
	this.name=n;
	this.band=b;
}
   public Car() {
	   this("Ĭ�ϳ���","Ĭ��Ʒ��");
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
		// TODO �Զ����ɵĹ��캯�����
    	super(n,b);
    	this.type=t;
        if(this.type=="����CRV") {
        	this.setPrice(600);
        }else if(this.type=="����Escape") {
        	this.setPrice(500);
        }else if(this.type=="����HRV") {
        	this.setPrice(400);
        }
	}
    public Taxi() {
    	 this("Ĭ�ϳ���","Ĭ��Ʒ��","Ĭ���ͺ�");
    }
}
class Bus extends Car{
	private String type;
	 public Bus(String n,String b,String t) {
			// TODO �Զ����ɵĹ��캯�����
	    	super(n,b);
	    	this.type=t;
	        if(this.type==">16��") {
	        	this.setPrice(1000);
	        }else if(this.type=="<=16��") {
	        	this.setPrice(800);
	        }
		}
	    public Bus() {
	    	 this("Ĭ�ϳ���","Ĭ��Ʒ��","Ĭ���ͺ�");
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
		this("Ĭ�ϳ���","Ĭ��Ʒ��",0);
	}
}
class Consumer{
	private Car[] cars;
	private String name;
	private int days;
	private int cost;
	public Consumer(Car[] c,String n,int d) {
		// TODO �Զ����ɵĹ��캯�����
		this.name=n;
		this.days=d;
		this.cars=c;
		this.cost=0;
		for(Car x:this.cars) {
			this.cost+=this.days*x.getPrice();
		}
	}
	public void show() {
		System.out.printf("�����ƺ�\t����Ʒ��\n");
		for(Car x:this.cars) {
			System.out.printf(x.getName()+"\t"+x.getBand()+"\n");
		}
		System.out.printf("�ͻ���:"+this.name+"��������:"+this.days+"�ܷ���:"+this.cost);
	}
}
class Test{
	public static void main(String args[]) {
		Car[] allCars=new Car[5];
		allCars[0]=new Taxi("��NY28858","����","����CRV");
		allCars[1]=new Taxi("��NNN3284","����","����CRV");
		allCars[2]=new Taxi("��NT43765","���","����Escape");
		allCars[3]=new Bus("��5643765","����",">16��");
		allCars[4]=new Trunk("��GD56577","���",24);
		Consumer c=new Consumer(allCars, "��ΰ", 5);
		c.show();
	}
}
