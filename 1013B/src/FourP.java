import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FourP {
  private JFrame frame;
  private JPanel p1,p2,p3,p4;
  public FourP() {
    this.frame=new JFrame();
    this.frame.setSize(400, 300);
    this.p1=new JPanel();
    this.p2=new JPanel();
    this.p3=new JPanel();
    this.p4=new JPanel();
    this.frame.setLayout(new GridLayout(2,2));
    this.frame.add(p1);
    this.frame.add(p2);
    this.frame.add(p3);
    this.frame.add(p4);
    this.p1.setBackground(Color.RED);
    this.p2.setBackground(Color.orange);
    this.p3.setBackground(Color.yellow);
    this.p4.setBackground(Color.GREEN);
    this.frame.setVisible(true);
    this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
}
class Test{
	public static void main(String[] args) {
		FourP p=new FourP();
	}
}