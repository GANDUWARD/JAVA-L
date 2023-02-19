
public class Bank {
   private double money;
   public Bank() {
    this.money=0.0;
    }
   public void add_money2(double m) {
	   synchronized (this) {
	   this.money+=m;
	   System.out.printf("账户2存入%.2f元钱，账户已经有%.2f元\n",m,this.money);
	   }
   }
   public void add_money1(double m) {
	   synchronized (this) {
	   this.money+=m;
	   System.out.printf("账户1存入%.2f元钱，账户已经有%.2f元\n",m,this.money);
	   }
   }
}
class Accounter1 implements Runnable{
	private  Bank target;
	public Accounter1(Bank b) {
		this.target=b;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		
			this.target.add_money1(1000);

		}
	}
}
class Accounter2 implements Runnable{
	private  Bank target;
	public Accounter2(Bank b) {
		this.target=b;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			this.target.add_money2(1000);
		}
	}
}
class Test{
	public static void main(String[] args) {
		Bank ba=new Bank();
		Thread a1=new Thread(new Accounter1(ba));
		Thread a2=new Thread(new Accounter2(ba));
		a1.start();
		a2.start();
	}
}