package 完全计算器;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButtonEvent implements ActionListener {
    private Calculator c;
 
    ButtonEvent(Calculator cal){
    	this.c=cal;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		double x=Double.parseDouble(this.c.get_a().getText());
		double y=Double.parseDouble(this.c.get_b().getText());
		if(e.getActionCommand().equals("乘")) {
		   this.c.get_c().setText(String.valueOf(x*y));
		}else if(e.getActionCommand().equals("除")) {
			try {
			  double z=x/y;
			}catch(ArithmeticException e1) {
				throw new ArithmeticException();
			}finally {

			}
			this.c.get_c().setText(String.valueOf(x/y));
		}else if(e.getActionCommand().equals("加")) {
			this.c.get_c().setText(String.valueOf(x+y));
		}else if(e.getActionCommand().equals("减")) {
			this.c.get_c().setText(String.valueOf(x-y));
		}
		if(e.getActionCommand()==this.c.get_reset().getText()) {
		    this.c.get_a().setText(" ");
		    this.c.get_b().setText(" ");
		    this.c.get_c().setText(" ");
		}
	}

}
