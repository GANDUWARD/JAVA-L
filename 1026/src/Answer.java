import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;

import javax.swing.*;

public class Answer implements ActionListener {
  private JFrame frame;
  private JLabel name,sex,age,grade,buy_or_not,kinds,range,aim;
  private JPanel p1,p2,p3,p4,p5,p6,p7,p8;
  private JTextField t1,t2,t3,t4,t5,t6,t7,t8;
  private JButton submit;
  Answer(){
	  this.frame=new JFrame("双十一问卷调查");
	  this.frame.setLayout(new GridLayout(9,1));
      this.p1=new JPanel();
      this.p2=new JPanel();
      this.p3=new JPanel();
      this.p4=new JPanel();
      this.p5=new JPanel();
      this.p6=new JPanel();
      this.p7=new JPanel();
      this.p8=new JPanel();
      this.submit=new JButton("提交");
      this.frame.add(this.p1);
      this.frame.add(this.p2);
      this.frame.add(this.p3);
      this.frame.add(this.p4);
      this.frame.add(this.p5);
      this.frame.add(this.p6);
      this.frame.add(this.p7);
      this.frame.add(this.p8);
	  this.setBasicQuestion();
	  this.frame.add(this.submit);
	  this.frame.setSize(300,800);
	  this.frame.setVisible(true);
	  this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	  this.submit.addActionListener(this);
  }
  public void setBasicUnit(JPanel p,JLabel l,JTextField t) {
	 p.setLayout(new GridLayout(2,4));
	  p.add(l);
	  p.add(t);
  }
  public void setBasicQuestion() {
	  this.name=new JLabel("姓名");
	  this.t1=new JTextField();
	  this.setBasicUnit(this.p1,this.name,this.t1);
	  this.sex=new JLabel("性别");
	  this.t2=new JTextField();
	  this.setBasicUnit(p2, sex, t2);
	  this.age=new JLabel("年龄");
	  this.t3=new JTextField();
	  this.setBasicUnit(p3, age, t3);
	  this.grade=new JLabel("年级");
	  this.t4=new JTextField();
	  this.setBasicUnit(p4, grade, t4);
	  this.kinds=new JLabel("感兴趣的商品种类");
	  this.t6=new JTextField();
	  this.setBasicUnit(p6, kinds, t6);
	  this.buy_or_not=new JLabel("是否购物");
	  this.t5=new JTextField();
	  this.setBasicUnit(p5, buy_or_not, t5);
	  this.range=new JLabel("预算范围");
	  this.t7=new JTextField();
	  this.setBasicUnit(p7, range, t7);
	  this.aim=new JLabel("购物目的");
	  this.t8=new JTextField();
	  this.setBasicUnit(p8, aim, t8);
  }
  public void actionPerformed(ActionEvent e) {
	 JTextField[] texts=new JTextField[8];
	  texts[0]=t1;
	  texts[1]=t2;
	  texts[2]=t3;
	  texts[3]=t4;
	  texts[4]=t5;
	  texts[5]=t6;
	  texts[6]=t7;
	  texts[7]=t8;
	  int p=0;
	  for (JTextField t: texts) {
		  if(t.getText()=="") {
			   JOptionPane.showConfirmDialog(frame, "有信息尚未填写!","警告",JOptionPane.YES_OPTION);
			   p=1;
		  }
	  }
	  if(p==0) {
		  JOptionPane.showMessageDialog(frame,"姓名:"+this.t1.getText()+"\n性别:\t"+this.t2.getText()+"\n年龄:\t"+this.t3.getText()+"\n年级:\t"+this.t4.getText()+"\n是否购买:\t"+this.t5.getText()+"\n感兴趣商品种类:\t"+this.t6.getText()+"\n预算范围:\t"+this.t7.getText()+"\n购物目的:\t"+this.t8.getText(),"消息确认",JOptionPane.INFORMATION_MESSAGE);
	  }
	 
  }
}
class Test{
	  public static void main(String[] args) {
		  Answer as=new Answer();
	  }
}
