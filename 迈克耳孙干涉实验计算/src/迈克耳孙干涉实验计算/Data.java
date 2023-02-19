package ���˶������ʵ�����;

import java.util.Scanner;
import java.math.*;
public class Data {
  private double[] di;
  private double arg_d;
  private double arg_la;
  private double Ub_d=0.00005;
  private double Ua_d;
  private double Ud;
  private double U_la;
  private double Er;
  public Data() {
	  Scanner sc=new Scanner(System.in);
	  this.di=new double[5];
	  Double[] d=new Double[10];
	  System.out.println("������10��ԭʼ���ݣ�");
	  for(int i=0;i<10;i++) {
		  d[i]=sc.nextDouble(); 
	  }
	  for(int j=0;j<5;j++) {
		  this.di[j]=d[j+5]-d[j];
	  }
	  double sum=0.0;
	  for(double dd:this.di) {
		  sum+=dd;
	  }
	  this.arg_d=sum/5.000000;
	  this.arg_la=2*this.arg_d/500.000000*1000000;
	  double s=0.0;
	  for(int k=0;k<5;k++) {
		  s+=(di[k]-this.arg_d)*(di[k]-this.arg_d); //������ƽ��d�Ĳ�ֵ��ƽ��
	  }
	  s=s/5.000000;//��ƽ��
	  s=Math.sqrt(s);//����
	  this.Ua_d=1.24000*s;  
	  this.Ud=Math.sqrt(this.Ua_d*this.Ua_d+this.Ub_d*this.Ub_d);
	  this.U_la=2.000000/500.000000*this.Ud*1000000;
	  this.Er=(this.arg_la-650.000000)/650.000000*100;
  }
   public void print() {
	   for(int i=0;i<5;i++) {
	   System.out.printf("��%d�����Ϊ%.6fmm\n",i,this.di[i]);
	   }
	   System.out.printf("�˵�ƽ��ֵΪ%.2fnm\n",this.arg_la);
	   System.out.printf("dƽ��ֵΪ%.5fmm\n",this.arg_d);
	   System.out.printf("d��a�಻ȷ����%.4fmm\n",this.Ua_d);
	   System.out.printf("d�Ĳ�ȷ����%.6fmm\n",this.Ud);
	   System.out.printf("�˵Ĳ�ȷ����%.4fnm\n",this.U_la);
	   System.out.printf("�˵�������%.1f\n",this.Er);
   }
}
class Test{
	public static void main(String[] args) {
		Data da=new Data();
		da.print();
	}
}
