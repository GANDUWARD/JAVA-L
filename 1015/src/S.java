import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S implements ActionListener{
  private JFrame frame;
  private JButton okButton,cancelButton;
  S(){
	  this.frame=new JFrame();
	  this.frame.setSize(400, 300);
	  this.okButton=new JButton("确定");
	  this.cancelButton=new JButton("取消");
	  this.frame.setLayout(new FlowLayout());
	  this.frame.add(this.okButton);
	  this.frame.add(this.cancelButton);
	  this.okButton.addActionListener(this);
	  this.cancelButton.addActionListener(this);
	  this.frame.setVisible(true);
	  this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e) {
	  String t=this.okButton.getText();
	  this.okButton.setText(this.cancelButton.getText());
	  this.cancelButton.setText(t);
  }
}
class Test{
	public static void main(String[] args) {
		S s = new S();
	}
}
