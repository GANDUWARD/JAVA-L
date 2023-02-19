package 磁滞回线动态磁滞回线HB计算;

import java.awt.SystemColor;
import java.io.*;
import java.util.Scanner;

public class Cal {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  double x,y1,y2,h,b1,b2;
	  x=sc.nextDouble();
	  y1=sc.nextDouble();
	  y2=sc.nextDouble();
	  h=100/(0.13*5.8)*x;
	  b1=(5/1.24)*y1*1000;
	  b2=(5/1.24)*y2*1000;
	  System.out.printf("h是%.2f,b1是%.2f,b2是%.2f\n",h,b1,b2);
  }
   
}
