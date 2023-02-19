package 课堂派第五次作业;
/*实现一个宠物商店，在宠物商店中可以与多种（由用户决定数量）宠物，
试表示出此种关系，并要求可以根据宠物的关键字查找到相应的宠物信息。所需要的宠物信息自行设计。 */


public class Pet {
     private String name;
     public Pet(String n) {
		// TODO 自动生成的构造函数存根
    	this.name=n;
	}
     public Pet() {
		// TODO 自动生成的构造函数存根
    	 this("默认名称");
	}
    public String getName() {
    	return this.name;
    }
    public void check(String x) {
    	if(this.name==x) {
    		System.out.println("宠物姓名:"+this.name);
    	}
    }
}
class Dog extends Pet{
	private String hair;
	public Dog(String n,String h) {
		super(n);
		this.hair=h;
	}
	public Dog() {
		this("默认名称","默认毛发");
	}
	@Override
	public void check(String x) {
		if(this.hair==x||this.getName()==x) {
			System.out.println("宠物名称:"+this.getName()+" 宠物毛发:"+this.hair);
		}
	}
}
class Cat extends Pet{
	private String color;
	public Cat(String n,String c) {
		// TODO 自动生成的构造函数存根
		super(n);
		this.color=c;
	}
	public Cat() {
		// TODO 自动生成的构造函数存根
		this("默认名称","默认颜色"); 
	}
	@Override
	public void check(String x) {
		if(this.color==x||this.getName()==x) {
			System.out.printf("宠物名称:"+this.getName()+" 宠物颜色:"+this.color);
		}
	}
}
class Consumer{
	private String name;
	private Pet[] pets;
	public Consumer(String n,Pet[] p) {
		// TODO 自动生成的构造函数存根
		this.name=n;
		this.pets=p;
	}
	public Consumer() {
		// TODO 自动生成的构造函数存根
	}
	public void check_all(String x) {
		for(Pet p:this.pets) {
			p.check(x);
		}
	}
}
class Shop{
	private Consumer[] allConsumers;
	public Shop(Consumer[] c) {
		// TODO 自动生成的构造函数存根
		this.allConsumers=c;
	}
	public Shop() {
		// TODO 自动生成的构造函数存根
	}
}
class Test{
	public static void main(String[] args) {
		Pet[] allPets=new Pet[3];
		allPets[0]=new Cat("虾球","白色");
		allPets[1]=new Dog("米卡","卷毛");
		allPets[2]=new Cat("泡芙","灰色");
		Consumer c=new Consumer("小明", allPets);
		Consumer[] allConsumers=new Consumer[1];
		allConsumers[0]=c;
		Shop s=new Shop(allConsumers);
		c.check_all("米卡");
	}
}
