import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class Txt {
 private JFrame frame;
 private JTextArea textArea;
 private JScrollPane scrollPane;
 private JMenuBar menuBar;
 private JMenu  menu;
 private JMenuItem openItem,saveItem,closeItem,exItem;
 private FileReader fr;
 private JFileChooser chooser;
 private File file;
 Txt(){
	this.frame=new JFrame("简易记事本");
	this.textArea=new JTextArea();
	this.scrollPane=new JScrollPane(this.textArea);
	this.menuBar=new JMenuBar();
	this.menu=new JMenu("文件");
	this.openItem=new JMenuItem("打开");
	this.saveItem=new JMenuItem("保存");
	this.closeItem=new JMenuItem("关闭");
	this.exItem=new JMenuItem("退出");
	this.menu.add(this.openItem);
	this.menu.add(this.saveItem);
	this.menu.add(this.closeItem);
	this.menu.add(this.exItem);
	this.menuBar.add(this.menu);
	this.frame.setJMenuBar(this.menuBar);
	this.frame.add(this.scrollPane);
	this.frame.setSize(800,600);
	this.frame.setVisible(true);
	this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.openItem.addActionListener(new TxtEvent());
	this.saveItem.addActionListener(new TxtEvent());
	this.exItem.addActionListener(new TxtEvent());
	this.closeItem.addActionListener(new TxtEvent());
 }
 class TxtEvent implements ActionListener{
	 @Override
	public void actionPerformed(ActionEvent e) {
	 try {
		 chooser=new JFileChooser(".\\");
	 if(e.getActionCommand().equals("打开")) {
		 if(chooser.showOpenDialog(frame)==JFileChooser.APPROVE_OPTION) {
			 file = chooser.getSelectedFile();
			 fr=new FileReader(file);
			 char[] str =new char[2048];
			 int count;
			 textArea.setText("");
			 while((count=fr.read(str))!=-1) {
				 textArea.append(new String(str,0,count));
			 }
		 }
	 }
	 if(e.getActionCommand().equals("保存")) {
		FileWriter fw =new FileWriter(file);
		fw.write(textArea.getText());
		fw.close();
	 }
	 if(e.getActionCommand().equals("退出")) {
		 System.exit(0);
	 }
	 if(e.getActionCommand().equals("关闭")) {
		 JOptionPane optionPane = new JOptionPane();
		int num= optionPane.showConfirmDialog(null,"是否保存","再次确认",JOptionPane.YES_NO_OPTION);
		if(num==0) {
			FileWriter fw =new FileWriter(file);
			fw.write(textArea.getText());
			fw.close();
		}else {
			
		}
		textArea.setText("");
	 }
	}catch (FileNotFoundException ex) {
		ex.printStackTrace();
	}catch (IOException ex2) {
		ex2.printStackTrace();
	}
	 }
 }
}
class Test{
	public static void main(String[] args) {
		Txt txt=new Txt();
	}
}