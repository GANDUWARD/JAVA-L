import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.exceptions.PacketTooBigException;
public class Table implements ActionListener{
   JFrame frame;
   DefaultTableModel dtm;
   JTable table;
   JButton add,delete,change,query;
   Vector vdata=new Vector();
   Vector vcolumn=new Vector();
   Connection conn=null;
   Statement stmt=null;
   ResultSet rs=null;
   static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
   static final String URL="jdbc:mysql://localhost:3306/dusha?serverTimezone=UTC&useServerPrepStmts=true&cachePrepStmts=true";
   static final String USER="root";
   static final String PASSWORD="Xin365118";
   Table(){
	   try {
	   Class.forName(JDBC_DRIVER);
	   conn =DriverManager.getConnection(URL,USER,PASSWORD);
	   stmt=conn.createStatement();
	   rs =stmt.executeQuery("SELECT * FROM user");
	   while(rs.next()) {
		   Vector vrow=new Vector();
		   vrow.add(rs.getString(1));
		   vrow.add(rs.getString(2));
		   vrow.add(rs.getString(3));
		   vrow.add(rs.getString(4));
		   vrow.add(rs.getString(5));
		   vrow.add(rs.getString(6));
		   vrow.add(rs.getString(7));
		   vdata.add(vrow);
	   }
	   vcolumn.add("id");
	   vcolumn.add("phone");
	   vcolumn.add("password");
	   vcolumn.add("add time");
	   vcolumn.add("last ip");
	   vcolumn.add("email");
	   vcolumn.add("status");
	   dtm=new DefaultTableModel(vdata,vcolumn);
	   table=new JTable(dtm);
	   JScrollPane sp=new JScrollPane(table);
	   frame=new JFrame(); 
	   JPanel p=new JPanel();
	   p.setLayout(new GridLayout(1,4));
	   add=new JButton("����");
	   delete=new JButton("ɾ��");
	   change=new JButton("�޸�");
	   query=new JButton("��ѯ");
	   add.addActionListener(this);
	   delete.addActionListener(this);
	   change.addActionListener(this);
	   query.addActionListener(this);
	   p.add(add);
	   p.add(delete);
	   p.add(change);
	   p.add(query);
	   frame.setSize(800,600);
	   frame.add(sp,BorderLayout.NORTH);
	   frame.add(p,BorderLayout.SOUTH);
	   frame.setVisible(true);
	   }catch (ClassNotFoundException e) {
	    e.printStackTrace();
	 }catch(SQLException e2) {
		e2.printStackTrace();
	}finally {
		try {
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	   
   }
@Override
public void actionPerformed(ActionEvent e) {
    try {
	Class.forName(JDBC_DRIVER);
	conn =DriverManager.getConnection(URL,USER,PASSWORD);
	PreparedStatement pstm;
	if(e.getActionCommand().equals("����")) {
		String id=JOptionPane.showInputDialog(frame,"������Ҫ��ӵ�id","����Ի���",JOptionPane.DEFAULT_OPTION);
		String phone=JOptionPane.showInputDialog(frame,"������Ҫ��ӵ�phone","����Ի���",JOptionPane.DEFAULT_OPTION);
		String password=JOptionPane.showInputDialog(frame,"������Ҫ��ӵ�password","����Ի���",JOptionPane.DEFAULT_OPTION);
		String add_time=JOptionPane.showInputDialog(frame,"������Ҫ��ӵ�add time","����Ի���",JOptionPane.DEFAULT_OPTION);
		String last_ip=JOptionPane.showInputDialog(frame,"������Ҫ��ӵ�last ip","����Ի���",JOptionPane.DEFAULT_OPTION);
		String email=JOptionPane.showInputDialog(frame,"������Ҫ��ӵ�email","����Ի���",JOptionPane.DEFAULT_OPTION);
		String status=JOptionPane.showInputDialog(frame,"������Ҫ��ӵ�status","����Ի���",JOptionPane.DEFAULT_OPTION);
		try {
		pstm=conn.prepareStatement("INSERT INTO user(id,phone,password,addtime,lastip,email,status)values(?,?,?,?,?,?,?)");
		pstm.setString(1,id);
		pstm.setString(2, phone);
		pstm.setString(3,password);
		pstm.setString(4, add_time);
		pstm.setString(5, last_ip);
		pstm.setString(6,email);
		pstm.setString(7, status);
		pstm.execute();
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
	}else if(e.getActionCommand().equals("ɾ��")) {
      try {
    	  String famula=JOptionPane.showInputDialog(frame,"������Ҫ��ӵ��������ʽ(������ֵ)","����Ի���",JOptionPane.DEFAULT_OPTION);
    	  pstm=conn.prepareStatement("DELETE FROM user WHERE id=?");
    	  pstm.setString(1, famula);
    	  pstm.execute();
      }catch (SQLException e1) {
			e1.printStackTrace();
	  }
	}else if(e.getActionCommand().equals("�޸�")) {
		String id=JOptionPane.showInputDialog(frame,"������Ҫ�޸ĵ�id","����Ի���",JOptionPane.DEFAULT_OPTION);
		String phone=JOptionPane.showInputDialog(frame,"������Ҫ�޸ĵ�phone","����Ի���",JOptionPane.DEFAULT_OPTION);
		String password=JOptionPane.showInputDialog(frame,"������Ҫ�޸ĵ�password","����Ի���",JOptionPane.DEFAULT_OPTION);
		String add_time=JOptionPane.showInputDialog(frame,"������Ҫ�޸ĵ�addtime","����Ի���",JOptionPane.DEFAULT_OPTION);
		String last_ip=JOptionPane.showInputDialog(frame,"������Ҫ�޸ĵ�lastip","����Ի���",JOptionPane.DEFAULT_OPTION);
		String email=JOptionPane.showInputDialog(frame,"������Ҫ�޸ĵ�email","����Ի���",JOptionPane.DEFAULT_OPTION);
		String status=JOptionPane.showInputDialog(frame,"������Ҫ�޸ĵ�status","����Ի���",JOptionPane.DEFAULT_OPTION);
		 try {
	    	  String famula=JOptionPane.showInputDialog(frame,"������Ҫ�޸ĵ��������ʽ(������ֵ)","����Ի���",JOptionPane.DEFAULT_OPTION);
	    	  pstm=conn.prepareStatement("UPDATE user SET id=?,phone=?,password=?,addtime=?,lastip=?,email=?,status=? WHERE id=?");
	    	  pstm.setString(1,id);
	  		pstm.setString(2, phone);
	  		pstm.setString(3,password);
	  		pstm.setString(4, add_time);
	  		pstm.setString(5, last_ip);
	  		pstm.setString(6,email);
	  		pstm.setString(7, status);
	  		pstm.setString(8, famula);
	  		pstm.executeUpdate();
	      }catch (SQLException e1) {
				e1.printStackTrace();
		  }
	}else if(e.getActionCommand().equals("��ѯ")) {
		 try {
	    	  String famula=JOptionPane.showInputDialog(frame,"������Ҫ��ӵ��������ʽ(����������ֵ)","����Ի���",JOptionPane.DEFAULT_OPTION);
	    	  pstm=conn.prepareStatement("SELECT * FROM user WHERE id=?");
	    	  pstm.setString(1,famula);
	    	  pstm.executeQuery();
	      }catch (SQLException e1) {
				e1.printStackTrace();
		  }
	}
    }catch(SQLException e1) {
    	e1.printStackTrace();
	}catch (ClassNotFoundException e2) {
		e2.printStackTrace();
	}
}
}
class Test{
	public static void main(String[] args) {
		new Table();
	}
}
