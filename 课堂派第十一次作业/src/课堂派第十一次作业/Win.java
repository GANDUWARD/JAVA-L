package �����ɵ�ʮһ����ҵ;
/*
1���ڴ��������������ť���ֱ�Ϊ��ȷ�����͡�ȡ������
������ȷ������ť�����ڱ�������ʾ���㵥����ȷ����ť����
������ȡ������ť�����ڱ�������ʾ���㵥����ȡ����ť����
Ҫ��������ַ�ʽʵ���¼������������ࡢ�ⲿ�ࡢ�ڲ��ࡢ�����ࡢlambda���ʽ��

2���ڴ��������������ť���ֱ�Ϊ��ȷ�����͡�ȡ������

�����κ�һ����ťʱ��������ť�ϵ����ֻ�����
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//����
/*
public class Win implements ActionListener{
   JFrame frame;
   JButton b1,b2;
   public Win() {
	// TODO �Զ����ɵĹ��캯�����
	   this.frame=new JFrame();
	   this.b1=new JButton("ȷ��");
	   this.b2=new JButton("ȡ��");
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
	// TODO �Զ����ɵķ������
	if(e.getActionCommand().equals("ȷ��")) {
		System.out.println("�㵥����ȷ����ť");
		String s=this.b1.getActionCommand();
		this.b1.setText(this.b2.getActionCommand());
		this.b2.setText(s);
	}else if(e.getActionCommand().equals("ȡ��")) {
		System.out.println("�㵥����ȡ����ť");
		String s=this.b1.getActionCommand();
		this.b1.setText(this.b2.getActionCommand());
		this.b2.setText(s);
	}
}
}
*/
/*�ⲿ��
public class Win {
	   JFrame frame;
	   JButton b1,b2;
	   public Win() {
		// TODO �Զ����ɵĹ��캯�����
		   this.frame=new JFrame();
		   this.b1=new JButton("ȷ��");
		   this.b2=new JButton("ȡ��");
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
		// TODO �Զ����ɵĹ��캯�����
		this.w=wi;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("ȷ��")) {
			System.out.println("�㵥����ȷ����ť");
			String s=this.w.b1.getActionCommand();
			this.w.b1.setText(this.w.b2.getActionCommand());
			this.w.b2.setText(s);
		}else if(e.getActionCommand().equals("ȡ��")) {
			System.out.println("�㵥����ȡ����ť");
			String s=this.w.b1.getActionCommand();
			this.w.b1.setText(this.w.b2.getActionCommand());
			this.w.b2.setText(s);
		}
		
	}
}
*/
/*�ڲ���
public class Win{
	   JFrame frame;
	   JButton b1,b2;
	   class ButtonEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			if(e.getActionCommand().equals("ȷ��")) {
				System.out.println("�㵥����ȷ����ť");
				String s=b1.getActionCommand();
				b1.setText(b2.getActionCommand());
				b2.setText(s);
			}else if(e.getActionCommand().equals("ȡ��")) {
				System.out.println("�㵥����ȡ����ť");
				String s=b1.getActionCommand();
				b1.setText(b2.getActionCommand());
				b2.setText(s);
			}
		}
		   
	   }
	   public Win() {
		// TODO �Զ����ɵĹ��캯�����
		   this.frame=new JFrame();
		   this.b1=new JButton("ȷ��");
		   this.b2=new JButton("ȡ��");
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
/*������������
public class Win{
	   JFrame frame;
	   JButton b1,b2;
	   public Win() {
		// TODO �Զ����ɵĹ��캯�����
		   this.frame=new JFrame();
		   this.b1=new JButton("ȷ��");
		   this.b2=new JButton("ȡ��");
		   this.frame.setLayout(new FlowLayout());
		   this.frame.add(this.b1);
		   this.frame.add(this.b2);
		   this.b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				if(e.getActionCommand().equals("ȷ��")) {
					System.out.println("�㵥����ȷ����ť");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}else if(e.getActionCommand().equals("ȡ��")) {
					System.out.println("�㵥����ȡ����ť");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}
			}
		});
		   this.b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO �Զ����ɵķ������
					if(e.getActionCommand().equals("ȷ��")) {
						System.out.println("�㵥����ȷ����ť");
						String s=b1.getActionCommand();
						b1.setText(b2.getActionCommand());
						b2.setText(s);
					}else if(e.getActionCommand().equals("ȡ��")) {
						System.out.println("�㵥����ȡ����ť");
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
//lamda���ʽ
public class Win{
	   JFrame frame;
	   JButton b1,b2;
	   public Win() {
		// TODO �Զ����ɵĹ��캯�����
		   this.frame=new JFrame();
		   this.b1=new JButton("ȷ��");
		   this.b2=new JButton("ȡ��");
		   this.frame.setLayout(new FlowLayout());
		   this.frame.add(this.b1);
		   this.frame.add(this.b2);

		   this.b1.addActionListener(e->{
			   if(e.getActionCommand().equals("ȷ��")) {
					System.out.println("�㵥����ȷ����ť");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}else if(e.getActionCommand().equals("ȡ��")) {
					System.out.println("�㵥����ȡ����ť");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}
		});
		   this.b2.addActionListener(e->{
			   if(e.getActionCommand().equals("ȷ��")) {
					System.out.println("�㵥����ȷ����ť");
					String s=b1.getActionCommand();
					b1.setText(b2.getActionCommand());
					b2.setText(s);
				}else if(e.getActionCommand().equals("ȡ��")) {
					System.out.println("�㵥����ȡ����ť");
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
