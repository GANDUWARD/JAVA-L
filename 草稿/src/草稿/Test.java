package 草稿;

import java.util.Scanner;

import 草稿.Outer.Inner;
/*

import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;
class Bill{
	String accounter;
	double cost;
	public Bill(String name,double price) {
		this.accounter=name;
		this.cost=price;
	}
	public Bill() {
		this("张三",100.00);
	}
}
class Car_time{
	String carName;
	String time;
	public Car_time(String name,String t) {
		this.carName=name;
		this.time=t;
	}
	public Car_time() {
		this("大金杯","2022.11.21");
	}
}
class Travel_club{
    private Bill[] bills;
    private Car_time[] car_times;
    private int b_index;
    private int c_index;
    public Travel_club() {
		this.bills=new Bill[20];
		this.car_times=new Car_time[20];
	}
    public void add_bill(Bill b) {
    	this.bills[this.b_index++]=b;
    }
    public void add_car(Car_time c) {
    	this.car_times[this.c_index++]=c;
    }
}
*/
class F{
	private int[] d;
	F(int []a){
		this.d=a;
	}
	public int find_max() {
     	int	max=this.d[0];
		for(int i:this.d) {
			if(i>max)max=i;
		}
		return max;
	}
    public int find_avg() {
    	int sum=0;
    	for(int i:this.d) {
    		sum+=i;
    	}
       return sum/this.d.length;
    }
}
class Outer  {
	  int num = 10;
	  class Inner {
	    int num = 20;
	    public void method(){
	    }
	  }
	}
public class Test{
	
	public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=33;
        a[1]=42;
        a[2]=23;
        a[3]=78;
        a[4]=90;
        F f=new F(a);
        System.out.println("最大值是"+f.find_max());
        System.out.println("随机数是"+(int)(Math.random()*10));
        System.out.println("平均值是"+f.find_avg());
        Inner i=new Outer().new Inner();
        System.out.print(Thread.MIN_PRIORITY + " ");
        System.out.print(Thread.MAX_PRIORITY + " ");
        System.out.print(Thread.NORM_PRIORITY + " ");

	}
}

