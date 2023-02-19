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
	   this.b1.addActionListener(new ButtonEvent(this));
	   this.b2.addActionListener(new ButtonEvent(this));
	   this.frame.setVisible(true);
	   this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	 public JFrame get_frame() {
		 return this.frame;
	 }
	}

class ButtonEvent implements ActionListener{
	private Win wi;
	public ButtonEvent(Win window) {
        this.wi=window;
	}
	public void actionPerformed(ActionEvent e) {
		 if(e.getActionCommand().equals("确定")) {
			  this.wi.get_frame().setTitle("你单击了确定按钮");
		  }else if(e.getActionCommand().equals("取消")) {
			  this.wi.get_frame().setTitle("你单击了取消按钮");
		  }
	}
}
class Test{
	public static void main(String[] args) {
		Win w=new Win();
	}
}