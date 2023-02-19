import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Win {
	private JFrame frame;
	  private JButton b1,b2;
	  public Win() {
	   this.frame=new JFrame();
	   this.frame.setSize(400, 300);
	   this.frame.setLayout(new FlowLayout());
	   this.b1=new JButton("确定");
	   this.b2=new JButton("取消");
	   this.frame.add(this.b1);
	   this.frame.add(this.b2);
	   this.b1.addActionListener((ActionEvent e)->{
		   frame.setTitle("你单击了确定按钮");
	   });
	   this.b2.addActionListener((ActionEvent e)->{
		   frame.setTitle("你单击了取消按钮");
	   });
	   this.frame.setVisible(true);
	   this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
class Test{
	public static void main(String[] args) {
		Win w=new Win();
	}
}