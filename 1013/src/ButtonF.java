import java.awt.BorderLayout;
import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonF {
   private JFrame frame;
   private JButton b1,b2,b3,b4,b5,c1,c2,c3,c4,c5;
   private JPanel up,down;
   public ButtonF() {
	this.frame=new JFrame();
	this.frame.setSize(400, 300);
	this.frame.setLayout(new FlowLayout());
    this.up=new JPanel();
    this.down=new JPanel();
    this.frame.add(up);
    this.frame.add(down);
    this.b1=new JButton("东");
    this.b2=new JButton("南");
    this.b3=new JButton("西");
    this.b4=new JButton("北");
    this.b5=new JButton("中");
    this.c1=new JButton("一");
    this.c2=new JButton("二");
    this.c3=new JButton("三");
    this.c4=new JButton("四");
    this.c5=new JButton("五");
    this.up.setLayout(new BorderLayout());
    this.down.setLayout(new FlowLayout());
    this.up.add(BorderLayout.EAST,b1);
    this.up.add(BorderLayout.SOUTH,b2);
    this.up.add(BorderLayout.WEST,b3);
    this.up.add(BorderLayout.NORTH,b4);
    this.up.add(BorderLayout.CENTER,b5);
    this.down.add(c1);
    this.down.add(c2);
    this.down.add(c3);
    this.down.add(c4);
    this.down.add(c5);
    this.frame.setVisible(true);
    this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
}
class Test{
	public static void main(String[] args) {
		ButtonF c=new ButtonF();
	}
}
