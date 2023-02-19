package 课堂派第十一次作业;
/*
1、在窗口中添加两个按钮，分别为“确定”和“取消”。
单击“确定”按钮，窗口标题栏显示“你单击了确定按钮”。
单击“取消”按钮，窗口标题栏显示“你单击了取消按钮”。
要求采用五种方式实现事件监听器：本类、外部类、内部类、匿名类、lambda表达式。

2、在窗口中添加两个按钮，分别为“确定”和“取消”。

单击任何一个按钮时，两个按钮上的文字互换。
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//本类
/*
public class Win implements ActionListener{
   JFrame frame;
   JButton b1,b2;
   public Win() {
	// TODO 自动生成的构造函数存根
	   this.frame=new JFrame();
	   this.b1=new JButton("确定");
	   this.b2=new JButton("取消");
	   this.frame.setLayout(new FlowLayout());
	   this.frame.add(this.b1);
	   this.frame.add(this.b2);
	   this.b1.addActionListener(this);
	   this.b2.addActionListener(this);
	   this.frame.setSize(800,600);
	  
	   this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   this.frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO 自动生成的方法存根
	if(e.getActionCommand().equals("确定")) {
		System.out.println("你单击了确定按钮");
		String s=this.b1.getActionCommand();
		this.b1.setText(this.b2.getActionCommand());
		this.b2.setText(s);
	}else if(e.getActionCommand().equals("取消")) {
		System.out.println("你单击了取消按钮");
		String s=this.b1.getActionCommand();
		this.b1.setText(this.b2.getActionCommand());
		this.b2.setText(s);
	}
}
}
*/
/*外部类
public class Win {
	   JFrame frame;
	   JButton b1,b2;
	   public Win() {
		// TODO 自动生成的构造函数存根
		   this.frame=new JFrame();
		   this.b1=new JButton("确定");
		   this.b2=new JButton("取消");
		   this.frame.setLayout(new FlowLayout());
		   this.frame.add(this.b1);
		   this.frame.add(this.b2);
		   this.b1.addActionListener(new ButtonEvent(this));
		   this.b2.addActionListener(new ButtonEvent(this));
		   this.frame.setSize(800,600);  
		   this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		   this.frame.setVisible(true);
	}
}
class ButtonEvent implements ActionListener{
	Win w;
	public ButtonEvent(Win wi) {
		// TODO 自动生成的构造函数存根
		this.w=wi;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("确定")) {
			System.out.println("你单击了确定按钮");
			String s=this.w.b1.getActionCommand();
			this.w.b1.setText(this.w.b2.getActionCommand());
			this.w.b2.setText(s);
		}else if(e.getActionCommand().equals("取消")) {
			System.out.println("你单击了取消按钮");
			String s=this.w.b1.getActionCommand();
			this.w.b1.setText(this.w.b2.getActionCommand());
			this.w.b2.setText(s);
		}
		
	}
}
*/
/*内部类
public class Win{
	   JFrame frame;
	   JButton b1,b2;
	   class ButtonEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			if(e.getActionCommand().equals("确定")) {
				System.out.println("你单击了确定按钮");
				String s=b1.getActionCommand();
				b1.setText(b2.getActionCommand());
				b2.setText(s);
			}else if(e.getActionCommand().equals("取消")) {
				System.out.println("你单击了取消按钮");
				String s=b1.getActionCommand();
				b1.setText(b2.getActionCommand());
				b2.setText(s);
			}
		}
		   
	   }
	   public Win() {
		// TODO 自动生成的构造函数存根
		   this.frame=new JFrame();
		   this.b1=new JButton("确定");
		   this.b2=new JButton("取消");
		   this.frame.setLayout(new FlowLayout());
		   this.frame.add(this.b1);
		   this.frame.add(this.b2);
		   this.b1.addActionListener(new ButtonEvent());
		   this.b2.addActionListener(new ButtonEvent());
		   this.frame.setSize(800,600);
		  
		   this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		   this.frame.setVisible(true);
	}
	}
	*/
/*匿名监听器类
public class Win{
	   JFrame frame;
	   JButton b1,b2;
	   public Win() {
		// TODO 自动生成的构造函数存根
		   this.frame=new JFrame();
		   this.b1=new JButton("确定");
		   this.b2=new JButton("取消");
		   this.frame.setLayout(new FlowLayout());
		   this.frame.add(this.b1);
		   this.frame.add(this.b2);
		   this.b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				if(e.getActionCommand().equals("确定")) {
					System.out.println("你单击了确定按钮");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}else if(e.getActionCommand().equals("取消")) {
					System.out.println("你单击了取消按钮");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}
			}
		});
		   this.b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO 自动生成的方法存根
					if(e.getActionCommand().equals("确定")) {
						System.out.println("你单击了确定按钮");
						String s=b1.getActionCommand();
						b1.setText(b2.getActionCommand());
						b2.setText(s);
					}else if(e.getActionCommand().equals("取消")) {
						System.out.println("你单击了取消按钮");
						String s=b1.getActionCommand();
						b1.setText(b2.getActionCommand());
						b2.setText(s);
					}
				}
			});
		   this.frame.setSize(800,600);
		  
		   this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		   this.frame.setVisible(true);
	}
	}
	*/
//lamda表达式
public class Win{
	   JFrame frame;
	   JButton b1,b2;
	   public Win() {
		// TODO 自动生成的构造函数存根
		   this.frame=new JFrame();
		   this.b1=new JButton("确定");
		   this.b2=new JButton("取消");
		   this.frame.setLayout(new FlowLayout());
		   this.frame.add(this.b1);
		   this.frame.add(this.b2);

		   this.b1.addActionListener(e->{
			   if(e.getActionCommand().equals("确定")) {
					System.out.println("你单击了确定按钮");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}else if(e.getActionCommand().equals("取消")) {
					System.out.println("你单击了取消按钮");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}
		});
		   this.b2.addActionListener(e->{
			   if(e.getActionCommand().equals("确定")) {
					System.out.println("你单击了确定按钮");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}else if(e.getActionCommand().equals("取消")) {
					System.out.println("你单击了取消按钮");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}
		});
		   this.frame.setSize(800,600);
		  
		   this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		   this.frame.setVisible(true);
	}
	}
class Test{
	public static void main(String[] args) {
		new Win();
	}
}
