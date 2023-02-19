
public class account {
	private String name;
    private double count;
    public account(){
     this.name="张三";
     this.count=0;
    }
    public account(double money,String NAME){
    	this.count=money;
    	this.name=NAME;
    }
    public account(double money){
    	this(money,"张三");
    }
	public account(String NAME){
	   this(0,"张三");
	}
	public void read_the_count() {
		System.out.println(this.name+":"+this.count);
	}
}
