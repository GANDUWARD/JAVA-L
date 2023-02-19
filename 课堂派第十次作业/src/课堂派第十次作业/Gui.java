package 课堂派第十次作业;
/*
 1、在JFrame中添加5个按钮，分别使用FlowLayout和BorderLayout布局管理器。

2、在JFrame中使用GridLayout添加4个面板，每个面板的背景设置为不同的颜色。
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
	JFrame frame;
     JButton b1,b2,b3,b4,b5;
     JPanel p1,p2,p3,p4;
    /*public Gui() {
		// TODO 自动生成的构造函数存根
    	this.frame=new JFrame();
    	//this.frame.setLayout(new FlowLayout());
    	this.frame.setLayout(new GridLayout(1,5));
    	this.b1=new JButton("1");
    	this.b2=new JButton("2");
    	this.b3=new JButton("3");
    	this.b4=new JButton("4");
    	this.b5=new JButton("5");
    	this.frame.add(this.b1);
    	this.frame.add(this.b2);
    	this.frame.add(this.b3);
    	this.frame.add(this.b4);
    	this.frame.add(this.b5);
    	this.frame.setSize(800, 600);
    	this.frame.setVisible(true);
    	this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}*/
     public Gui() {
		// TODO 自动生成的构造函数存根
    	 this.frame=new JFrame();
     	this.frame.setLayout(new GridLayout(2,2));
        this.p1=new JPanel();
        this.p2=new JPanel();
        this.p3=new JPanel();
        this.p4=new JPanel();
        this.p1.setBackground(Color.blue);
        this.p2.setBackground(Color.green);
        this.p3.setBackground(Color.yellow);
        this.p4.setBackground(Color.red);
        this.frame.add(this.p1);
        this.frame.add(this.p2);
        this.frame.add(this.p3);
        this.frame.add(this.p4);
     	this.frame.setSize(800, 600);
     	this.frame.setVisible(true);
     	this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
class Test{
	public static void main(String[] args) {
		new Gui();
	}
}
