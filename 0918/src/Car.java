import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public abstract class Car {
   int cost;
   String number;
   String band;
  Car(int c,String n,String b){
    this.cost=c;
    this.number=n;
    this.band=b;
  }
  Car(){
    this(0,"NONE","NONE");
  }
  Car(String n,String b){
    this(0,n,b);
  }
  public void show(){
    System.out.printf("%s\t%s\n",this.number,this.band);
  }
  public void calculate_cost(){

  }
}
class Taxi extends Car{
    Taxi(){
        super();
        this.calculate_cost();
    }
    Taxi(String n,String b){
        super(n, b);
        this.calculate_cost();
    }
    Taxi(int c,String n,String b){
        super(c,n,b);
        this.calculate_cost();
    }
    public void calculate_cost(){
        if(this.band == "本田CRV")
             this.cost=600;
        else if(this.band=="福特Escape")
             this.cost=500;
        else if(this.band=="本田HRV")
             this.cost=400;
        else if(this.band=="宝马")
             this.cost=700;
        else if(this.band=="别克")
             this.cost=900;
        else
            {   
                Scanner sc=new Scanner(System.in);
                System.out.println("请手动输入日租费");
                this.cost=sc.nextInt();
            }
             
    }
}
class Bus extends Car{
    private String type;
    Bus(int c,String n,String b,String t){
        super(c,n,b);
        this.type=t;
        if(this.type==">16座")
            this.cost=1000;
        else if(this.type=="<=16座")
            this.cost=800;
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("请手动输入日租费");
            this.cost=sc.nextInt();
        }
    }
    Bus(String n,String b,String t){
        this(0,n,b,t);
    }
    Bus(String t){
       this(0,"NONE","NONE",t);
    }
    Bus(){
       this(0,"NONE","NONE","NONE");
    }
}
class Trunk extends Car{
    private int load;
    Trunk(int c,String n,String b,int l){
        super(c,n,b);
        this.load=l;
        this.cost=l*50;
    }
    Trunk(int l){
        this(0,"NONE","NONE",l);
    }
    Trunk(String n,String b,int l){
        super(n,b);
        this.load=l;
        this.cost=l*50;
    }
}
class Customer {
    private String name;
    private int days;
    private int cost;
    private int sum;
    private Car[] vehicles;
    Customer(String n,int d,int c,Car[] v,int s){
        this.name=n;
        this.days=d;
        this.cost=c;
        this.vehicles=v;
        this.sum=s;
    }
    Customer(){
        this("张三",0,0,null,0);
    }
    public void sum(){
     for(Car i:this.vehicles)
     {
        this.cost+=i.cost;
     }
     this.sum=this.cost*this.days;
    }
    public void show(){
        System.out.printf("汽车牌号\t汽车品牌\n");
        for(Car i:this.vehicles)
        {
            i.show();
        }
        System.out.printf("\n客户名:"+this.name+",租赁天数:"+this.days+",租赁总费用:"+this.sum+"\n");
    }
}
class Test{
    public static void main(String[] args) {
        Car[] cars=new Car[5];
        cars[0]=new Taxi("京NY28588","宝马");
        cars[1]=new Taxi("京NNN3284","宝马");
        cars[2]=new Taxi("京NT43765","别克");
        cars[3]=new Bus("京5643765","金龙",">16座");
        cars[4]=new Trunk("京GD56577","解放",12);
        Customer p1=new Customer("沈伟",5,0,cars,0);
        p1.sum();
        p1.show();
    }
}
