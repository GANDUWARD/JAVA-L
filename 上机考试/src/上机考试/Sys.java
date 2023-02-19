package 上机考试;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*计算2102 120211080505 林新烨 B卷*/
class Boy {
	private int number;
	private String name;
	private String sex;
	public Boy(int n,String na,String s) {
		// TODO 自动生成的构造函数存根
		this.number=n;
		this.name=na;
		this.sex=s;
	}
public int get_number() {
		
		return this.number;
	}
	public String get_name() {
		return this.name;
	}
}
class Girl {
	private int number;
	private String name;
	private String sex;
	public Girl(int n,String na,String s) {
		// TODO 自动生成的构造函数存根
		this.number=n;
		this.name=na;
		this.sex=s;
	}
	public int get_number() {
		
		return this.number;
	}
	public String get_name() {
		return this.name;
	}
}
public class Sys implements ActionListener{
     Boy[] alBoys;
     Girl[] alGirls;
     int[] bc;
     int[] gc;
    JFrame frame;
    JLabel l1,l2,l3;
    JTextArea t1,t2,t3;
    JButton b1,b2,b3;
    JPanel p1,p2,p3,pp1,pp2;
    JScrollPane sp1,sp2,sp3;
     public Sys() {
		// TODO 自动生成的构造函数存根
    	 this.bc=new int[8];
    	 this.gc=new int[8];
    	 for(int i=0;i<this.bc.length;i++) {
    		 this.bc[i]=0;
    	 }
    	 for(int i=0;i<this.gc.length;i++) {
    		 this.gc[i]=0;
    	 }
    	 this.alBoys=new Boy[8];
    	 this.alGirls=new Girl[8];
    	 this.alBoys[0]=new Boy(1, "张晓刚", "男");
    	 this.alBoys[1]=new Boy(2, "段立明", "男");
    	 this.alBoys[2]=new Boy(3, "王强", "男");
    	 this.alBoys[3]=new Boy(4, "赵思力", "男");
    	 this.alBoys[4]=new Boy(5, "孙晓龙", "男");
    	 this.alBoys[5]=new Boy(6, "李永刚", "男");
    	 this.alBoys[6]=new Boy(7, "戴海楠", "男");
    	 this.alBoys[7]=new Boy(8, "于永","男");
    	 this.alGirls[0]=new Girl(9,"李敏","女");
    	 this.alGirls[1]=new Girl(10,"钱海燕","女");
    	 this.alGirls[2]=new Girl(11,"范晓萌","女");
    	 this.alGirls[3]=new Girl(12,"李思涵","女");
    	 this.alGirls[4]=new Girl(13,"王若琪","女");
    	 this.alGirls[5]=new Girl(14,"耿萱然","女");
    	 this.alGirls[6]=new Girl(15,"侯佳辰","女");
    	 this.alGirls[7]=new Girl(16,"王路鑫","女");
    	 this.frame=new JFrame("羽毛球组队");
    	 this.frame.setLayout(new GridLayout(3,1));
    	 this.p1=new JPanel();
    	 this.p2=new JPanel();
    	 this.p3=new JPanel();
    	 this.pp1=new JPanel();
    	 this.pp2=new JPanel();
    	 this.l1=new JLabel("队员");
    	 this.l2=new JLabel("一队");
    	 this.l3=new JLabel("二队");
    	 this.b1=new JButton("显示队员");
    	 this.b2=new JButton("开始组队");
    	 this.b3=new JButton("保存组队");
    	 
    	 this.t1=new JTextArea(40, 20);
    	 this.t2=new JTextArea(40, 20);
    	 this.t3=new JTextArea(40, 20);
    	 t1.setLineWrap(true);
    	 t2.setLineWrap(true);
    	 t3.setLineWrap(true);
    	 this.p1.setLayout(new GridLayout(2,1));
    	 this.p1.add(this.l1);
    	 this.p1.add(this.t1);
    	 this.p2.setLayout(new GridLayout(1,2));
    	 this.pp1.setLayout(new GridLayout(2,1));
    	 this.pp2.setLayout(new GridLayout(2,1));
    	 this.pp1.add(this.l2);
    	
    	 this.pp1.add(this.t2);
    	 this.pp2.add(this.l3);
    	 this.pp2.add(this.t3);
    	 this.p2.add(this.pp1);
    	 this.p2.add(this.pp2);
    	 this.p3.add(this.b1);
    	 this.p3.add(this.b2);
    	 this.p3.add(this.b3);
    	 this.frame.add(this.p1);
    	 this.frame.add(this.p2);
    	 this.frame.add(this.p3);
    	 this.b1.addActionListener(this);
    	 this.b2.addActionListener(this);
    	 this.b3.addActionListener(this);
    	 this.frame.setSize(1280,720);
    	 this.frame.setVisible(true);
    	 this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		for(int i=0;i<this.bc.length;i++) {
   		 this.bc[i]=0;
   	 }
   	 for(int i=0;i<this.gc.length;i++) {
   		 this.gc[i]=0;
   	 }
		if(e.getActionCommand().equals("显示队员")) {
			for(Boy b:this.alBoys) {
			   String u=t1.getText();
			   t1.setText(u+"\n"+b.get_number()+"."+b.get_name()+","+"男");
			}
			for(Girl g:this.alGirls) {
				   String u=t1.getText();
				   t1.setText(u+"\n"+g.get_number()+"."+g.get_name()+","+"女");
				}
		}
		if(e.getActionCommand().equals("开始组队")) {
			this.t2.setText("");
			this.t3.setText("");
			Thread c=new Thread(new Chooser(this));
			c.start();
		    Thread c2=new Thread(new Chooser2(this));
		    c2.start();
		    
		}
		if(e.getActionCommand().equals("保存组队")) {
		      File f=new File("T1.TXT");
		      File f2=new File("T2.TXT");
		      try(FileWriter fos1=new FileWriter(f);
		      FileWriter fos2=new FileWriter(f2);){
		    	 String s1=this.t2.getText();
                fos1.write(s1);
                String s2=this.t3.getText();
                fos2.write(s2);
                fos1.close();
                fos2.close();
		      } catch (FileNotFoundException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		}
	}
}
class Chooser2  implements Runnable{
	Sys s;
	public Chooser2(Sys sy) {
		// TODO 自动生成的构造函数存根
		this.s=sy;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
    	 int cb=0,cg=0;
    	 synchronized (s) {
			
		
    	 while(cb!=4) {
    		 int ra=(int)(Math.random()*8);
    		 if(this.s.bc[ra]==0) {
    			 this.s.bc[ra]=1;
    			 cb+=1;
    			 String u=this.s.t3.getText();
    			 this.s.t3.setText(u+"\n"+this.s.alBoys[ra].get_number()+"."+this.s.alBoys[ra].get_name()+","+"男");
    		 }
    	 }
    	 while(cg!=4) {
    		 int ra=(int)(Math.random()*8);
    		 if(this.s.gc[ra]==0) {
    			 this.s.gc[ra]=1;
    			 cg+=1;
    			 String u=this.s.t3.getText();
    			 this.s.t3.setText(u+"\n"+this.s.alGirls[ra].get_number()+"."+this.s.alGirls[ra].get_name()+","+"女");
    		 }
    	 }
    	 }
	}
	
}
class Chooser  implements Runnable{
	Sys s;
	public Chooser(Sys sy) {
		// TODO 自动生成的构造函数存根
		this.s=sy;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		synchronized (s) {
			
		
    	 int cb=0,cg=0;
    	 while(cb!=4) {
    		 int ra=(int)(Math.random()*8);
    		 if(this.s.bc[ra]==0) {
    			 this.s.bc[ra]=1;
    			 cb+=1;
    			 String u=this.s.t2.getText();
    			 this.s.t2.setText(u+"\n"+this.s.alBoys[ra].get_number()+"."+this.s.alBoys[ra].get_name()+","+"男");
    		 }
    	 }
    	 while(cg!=4) {
    		 int ra=(int)(Math.random()*8);
    		 if(this.s.gc[ra]==0) {
    			 this.s.gc[ra]=1;
    			 cg+=1;
    			 String u=this.s.t2.getText();
    			 this.s.t2.setText(u+"\n"+this.s.alGirls[ra].get_number()+"."+this.s.alGirls[ra].get_name()+","+"女");
    		 }
    	 }
		}
	}
	
}
class Test{
	public static void main(String[] args) {
		new Sys();
	}
}
