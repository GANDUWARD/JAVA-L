import java.awt.*;
import javax.swing.*;
public class LoginGUI {
  private JFrame frame;
  private JLabel labelUserName,labelPassword;
  private JTextField textFieldUserName;
  private JPasswordField passwordField;
  private JButton buttonLogin,buttonReset;
  LoginGUI(String tile){
	  this.frame=new JFrame(tile);    //构造方法，创建并设置组件
	  this.frame.setSize(260,180);
	  this.labelUserName=new JLabel("用户名");
	  this.labelPassword=new JLabel("密码");     //创建其他组件
	  this.textFieldUserName=new JTextField(10);
	  this.passwordField=new JPasswordField(10);
	  this.buttonLogin=new JButton("登录");
	  this.buttonReset=new JButton("重置");
	  this.frame.getContentPane().setLayout(new FlowLayout());  //设置框架布局管理器
	  this.frame.add(this.labelUserName);                       //将组件添加到框架中
	  this.frame.add(this.textFieldUserName);
	  this.frame.add(this.labelPassword);
	  this.frame.add(this.passwordField);
	  this.frame.add(this.buttonLogin);
	  this.frame.add(this.buttonReset);
	  this.frame.setVisible(true);               //设置框架可见性
	  this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
 class Test{
	public static void main(String[] args) {
		new LoginGUI("登录");
	}
}
