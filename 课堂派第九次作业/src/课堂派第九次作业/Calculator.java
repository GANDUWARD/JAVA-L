package 课堂派第九次作业;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
/*
public class Calculator implements ActionListener{
  private JFrame frame;
  private JTextArea text1,text2,text3;
  private JLabel label1,label2,label3;
  private JButton b1,b2,b3,b4;
  public Calculator() {
	// TODO 自动生成的构造函数存根
	  this.frame=new JFrame();
	  this.text1=new JTextArea(2,20);
	  this.text2=new JTextArea(2,20);
	  this.text3=new JTextArea(2,20);
	  this.label1=new JLabel("x");
	  this.label2=new JLabel("y");
	  this.label3=new JLabel("z");
	  this.b1=new JButton("+");
	  this.b2=new JButton("-");
	  this.b3=new JButton("*");
	  this.b4=new JButton("/");
	  this.frame.setLayout(new FlowLayout());
	  this.frame.add(this.label1);
	  this.frame.add(this.text1);
	  this.frame.add(this.label2);
	  this.frame.add(this.text2);
	  this.frame.add(this.label3);
	  this.frame.add(this.text3);
	  this.frame.add(this.b1);
	  this.frame.add(this.b2);
	  this.frame.add(this.b3);
	  this.frame.add(this.b4);
	  this.frame.setSize(300, 200);
	  this.frame.setVisible(true);
	  this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	  this.b1.addActionListener(this);
	  this.b2.addActionListener(this);
	  this.b3.addActionListener(this);
	  this.b4.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO 自动生成的方法存根
	 double z=0.0;
	if(e.getActionCommand().equals("+")) {
        z=Double.parseDouble(this.text1.getText())+Double.parseDouble(this.text2.getText());
		this.text3.setText(String.valueOf(z));
	}else if(e.getActionCommand().equals("-")) {
		z=Double.parseDouble(this.text1.getText())-Double.parseDouble(this.text2.getText());
		this.text3.setText(String.valueOf(z));
	}else if(e.getActionCommand().equals("*")) {
		z=Double.parseDouble(this.text1.getText())*Double.parseDouble(this.text2.getText());
		this.text3.setText(String.valueOf(z));
	}else if(e.getActionCommand().equals("/")) {
		z=Double.parseDouble(this.text1.getText())/Double.parseDouble(this.text2.getText());
		this.text3.setText(String.valueOf(z));
	};
	
}
}
*/
public class Calculator {
	   JFrame frame;
	 JTextArea text1,text2,text3;
	 JLabel label1,label2,label3;
	 JButton b1,b2,b3,b4;
	  public Calculator() {
		// TODO 自动生成的构造函数存根
		  this.frame=new JFrame();
		  this.text1=new JTextArea(2,20);
		  this.text2=new JTextArea(2,20);
		  this.text3=new JTextArea(2,20);
		  this.label1=new JLabel("x");
		  this.label2=new JLabel("y");
		  this.label3=new JLabel("z");
		  this.b1=new JButton("+");
		  this.b2=new JButton("-");
		  this.b3=new JButton("*");
		  this.b4=new JButton("/");
		  this.frame.setLayout(new FlowLayout());
		  this.frame.add(this.label1);
		  this.frame.add(this.text1);
		  this.frame.add(this.label2);
		  this.frame.add(this.text2);
		  this.frame.add(this.label3);
		  this.frame.add(this.text3);
		  this.frame.add(this.b1);
		  this.frame.add(this.b2);
		  this.frame.add(this.b3);
		  this.frame.add(this.b4);
		  this.frame.setSize(300, 200);
		  this.frame.setVisible(true);
		  this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  this.b1.addActionListener(new ButtonEvent(this));
		  this.b2.addActionListener(new ButtonEvent(this));
		  this.b3.addActionListener(new ButtonEvent(this));
		  this.b4.addActionListener(new ButtonEvent(this));
	}
	}
class ButtonEvent implements ActionListener{
	Calculator c;
	public ButtonEvent(Calculator ca) {
		// TODO 自动生成的构造函数存根
		this.c=ca;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		 double z=0.0;
		if(e.getActionCommand().equals("+")) {
	        z=Double.parseDouble(c.text1.getText())+Double.parseDouble(c.text2.getText());
			c.text3.setText(String.valueOf(z));
		}else if(e.getActionCommand().equals("-")) {
			z=Double.parseDouble(c.text1.getText())-Double.parseDouble(c.text2.getText());
			c.text3.setText(String.valueOf(z));
		}else if(e.getActionCommand().equals("*")) {
			z=Double.parseDouble(c.text1.getText())*Double.parseDouble(c.text2.getText());
			c.text3.setText(String.valueOf(z));
		}else if(e.getActionCommand().equals("/")) {
			z=Double.parseDouble(c.text1.getText())/Double.parseDouble(c.text2.getText());
			c.text3.setText(String.valueOf(z));
		};
		
	}
}
class Test{
	public static void main(String[] args) {
		new Calculator();
	}
}
