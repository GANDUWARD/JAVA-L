package 完全计算器;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.nio.channels.NonWritableChannelException;

public class Calculator {
  private JFrame frame;
  private JButton sum,deduc,mul,div,reset,cal,d0,d1,d2,d3,d4,d5,d6,d7,d8,d9,dp;
  private JTextField a,b,c;
  private JTextField in;
  private JPanel io,keys;
  private JLabel x,y,z;
  Calculator(String x){
	 this.frame=new JFrame(x);
	 this.frame.setSize(400, 300);
	 this.frame.setResizable(false);
	 this.io=new JPanel();
	 this.keys=new JPanel();
	 this.frame.setLayout(new BorderLayout());
	 this.frame.add(BorderLayout.NORTH,this.io);
	 this.frame.add(BorderLayout.CENTER,this.keys);
	 this.x=new JLabel("数1");
	 this.y=new JLabel("数2");
	 this.z=new JLabel("计算结果");
	 this.sum=new JButton("加");
	 this.deduc=new JButton("减");
	 this.mul= new JButton("乘");
	 this.div= new JButton("除");
	 this.cal=new JButton("等于");
	 this.reset=new JButton("重置");
	 this.d0=new JButton("0");
	 this.d1=new JButton("1");
	 this.d2=new JButton("2");
	 this.d3=new JButton("3");
	 this.d4=new JButton("4");
	 this.d5=new JButton("5");
	 this.d6=new JButton("6");
	 this.d7=new JButton("7");
	 this.d8=new JButton("8");
	 this.d9=new JButton("9");
	 this.dp=new JButton(".");
	 this.a=new JTextField();
	 this.b=new JTextField();
	 this.c=new JTextField();
	 this.io.setLayout(new GridLayout(2,3));
	 this.io.add(a);
	 this.io.add(b);
	 this.io.add(c);
	 this.io.add(this.x);
	 this.io.add(this.y);
	 this.io.add(this.z);
	 this.keys.setLayout(new GridLayout(4,4));
	 this.keys.add(this.d1);
	 this.keys.add(this.d2);
	 this.keys.add(this.d3);
	 this.keys.add(this.sum);
	 this.keys.add(this.d4);
	 this.keys.add(this.d5);
	 this.keys.add(this.d6);
	 this.keys.add(this.deduc);
	 this.keys.add(this.d7);
	 this.keys.add(this.d8);
	 this.keys.add(this.d9);
	 this.keys.add(this.mul);
	 this.keys.add(this.dp);
	 this.keys.add(this.d0);
	 this.keys.add(this.div);
	 this.keys.add(this.reset); 
	 this.frame.setVisible(true);
	 this.sum.addActionListener(new ButtonEvent(this));
	 this.deduc.addActionListener(new ButtonEvent(this));
	 this.mul.addActionListener(new ButtonEvent(this));
	 this.div.addActionListener(new ButtonEvent(this));
	 this.cal.addActionListener(new ButtonEvent(this));
	 this.reset.addActionListener(new ButtonEvent(this));
	 this.d0.addActionListener(new ButtonEvent(this));
	 this.d1.addActionListener(new ButtonEvent(this));
	 this.d2.addActionListener(new ButtonEvent(this));
	 this.d3.addActionListener(new ButtonEvent(this));
	 this.d4.addActionListener(new ButtonEvent(this));
	 this.d5.addActionListener(new ButtonEvent(this));
	 this.d6.addActionListener(new ButtonEvent(this));
	 this.d7.addActionListener(new ButtonEvent(this));
	 this.d8.addActionListener(new ButtonEvent(this));
	 this.d9.addActionListener(new ButtonEvent(this));
	 this.dp.addActionListener(new ButtonEvent(this));
	 this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }
   public JButton get_sum() {
	   return this.sum;
   }
   public JButton get_deduc() {
	   return this.deduc;
   }
   public JButton get_mul() {
	   return this.mul;
   }
   public JButton get_div() {
	   return this.div;
   }
   public JButton get_cal() {
	   return this.cal;
   }
   public JButton get_reset() {
	   return this.reset;
   }
   public JButton get_d0() {
	   return this.d0;
   }
   public JButton get_d1() {
	   return this.d1;
   }
   public JButton get_d2() {
	   return this.d2;
   }
   public JButton get_d3() {
	   return this.d3;
   }
   public JButton get_d4() {
	   return this.d4;
   }
   public JButton get_d5() {
	   return this.d5;
   }
   public JButton get_d6() {
	   return this.d6;
   }
   public JButton get_d7() {
	   return this.d7;
   }
   public JButton get_d8() {
	   return this.d8;
   }
   public JButton get_d9() {
	   return this.d9;
   }
   public JButton get_dp() {
	   return this.dp;
   }
   public JTextField get_in() {
	   return this.in;
   }
   public JTextField get_a() {
	   return this.a;
   }
   public JTextField get_b() {
	   return this.b;
   }
   public JTextField get_c() {
	   return this.c;
   }
}
class Test{
	public static void main(String[] args) {
		Calculator c= new Calculator("计算器");
	}
}
