package �����ɵ������ҵ;
/*ʵ��һ�������̵꣬�ڳ����̵��п�������֣����û��������������
�Ա�ʾ�����ֹ�ϵ����Ҫ����Ը��ݳ���Ĺؼ��ֲ��ҵ���Ӧ�ĳ�����Ϣ������Ҫ�ĳ�����Ϣ������ơ� */


public class Pet {
     private String name;
     public Pet(String n) {
		// TODO �Զ����ɵĹ��캯�����
    	this.name=n;
	}
     public Pet() {
		// TODO �Զ����ɵĹ��캯�����
    	 this("Ĭ������");
	}
    public String getName() {
    	return this.name;
    }
    public void check(String x) {
    	if(this.name==x) {
    		System.out.println("��������:"+this.name);
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
		this("Ĭ������","Ĭ��ë��");
	}
	@Override
	public void check(String x) {
		if(this.hair==x||this.getName()==x) {
			System.out.println("��������:"+this.getName()+" ����ë��:"+this.hair);
		}
	}
}
class Cat extends Pet{
	private String color;
	public Cat(String n,String c) {
		// TODO �Զ����ɵĹ��캯�����
		super(n);
		this.color=c;
	}
	public Cat() {
		// TODO �Զ����ɵĹ��캯�����
		this("Ĭ������","Ĭ����ɫ"); 
	}
	@Override
	public void check(String x) {
		if(this.color==x||this.getName()==x) {
			System.out.printf("��������:"+this.getName()+" ������ɫ:"+this.color);
		}
	}
}
class Consumer{
	private String name;
	private Pet[] pets;
	public Consumer(String n,Pet[] p) {
		// TODO �Զ����ɵĹ��캯�����
		this.name=n;
		this.pets=p;
	}
	public Consumer() {
		// TODO �Զ����ɵĹ��캯�����
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
		// TODO �Զ����ɵĹ��캯�����
		this.allConsumers=c;
	}
	public Shop() {
		// TODO �Զ����ɵĹ��캯�����
	}
}
class Test{
	public static void main(String[] args) {
		Pet[] allPets=new Pet[3];
		allPets[0]=new Cat("Ϻ��","��ɫ");
		allPets[1]=new Dog("�׿�","��ë");
		allPets[2]=new Cat("��ܽ","��ɫ");
		Consumer c=new Consumer("С��", allPets);
		Consumer[] allConsumers=new Consumer[1];
		allConsumers[0]=c;
		Shop s=new Shop(allConsumers);
		c.check_all("�׿�");
	}
}
