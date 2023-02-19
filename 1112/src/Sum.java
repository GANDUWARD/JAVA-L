
import java.util.Arrays;

public class Sum implements Runnable{
  private int[] data;
  Sum(int[] d){
	  this.data=d;
  }
  public void run() {
	  Arrays.sort(this.data);
	  this.print();
  }
  public void print() {
	  System.out.println("排列后的数组为:");
	  for(int i:this.data) {
		  System.out.printf("%d\t",i);
	  }
	  System.out.printf("\n");
  }
}
class Via_Sum extends Thread{
	private int[] data;
	Via_Sum(int[] d) {
	this.data=d;
	}
	public void run() {
		for(int i=0;i<this.data.length-1;i++)
			for(int j=0;j<this.data.length-i-1;j++) {
				if(this.data[j]<this.data[j+1]) {
					int t=this.data[j];
					this.data[j]=this.data[j+1];
					this.data[j+1]=t;
				}
			}
		this.print();
	}
	public void print() {
		  System.out.println("排列后的数组为:");
		  for(int i:this.data) {
			  System.out.printf("%d\t",i);
		  }
		  System.out.printf("\n");
	  }
}
class Test{
	public static void main(String[] args) {
		int[]a= {3,1,2,4,5,9,7,6};
		Thread a1=new Thread(new Sum(a));
		int[]b= {3,5,7,2,4,1,8,6};
		Thread a2=new Via_Sum(b);
		a1.start();
		a2.start();
		
	}
}
