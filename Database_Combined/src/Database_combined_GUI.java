import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Database_combined_GUI extends JFrame implements ActionListener {
	static JFrame f,f1,f2,f3,f4,f6;
	static JMenuBar mb;
	static JMenu Db;
	static JMenuItem insert,update,delete,display,exit;
    static String sid,suser,spass;
    static JTextArea t1,t2,t3,t4,t5,t6,t7,t8;
    static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    static JButton b1,b2,b3,b4,b5;
	static void insert(String zid,String zuser,String zpass){
		try
		{
			DAO db=new DAO();
			Connection conn=db.getConnection();
	
			 int id=Integer.parseInt(zid);
			 String user=zuser;
			 String pass=zpass;
			 
			 String insertQuery="insert into registration values(?,?,?)";
			 PreparedStatement preparedStatement;
			 
			 preparedStatement=conn.prepareStatement(insertQuery);
			 preparedStatement.setString(1,id+"");
			 preparedStatement.setString(2,user);
			 preparedStatement.setString(3,pass);
			 
			 preparedStatement.executeUpdate();
			 //System.out.println("Data Succesfully Inserted");
			 
			 l5.setForeground(Color.green);
			 l5.setText("Data Entered Succesfully ");
			 
			 
			 
		}
		catch(Exception e){
			 System.out.println(e);
			 l5.setForeground(Color.red);
			 l5.setText("Exception Occur_Cant submit the data!!");
			
		}
		}
		static void update(String pid,String puser,String ppass){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
				
				int id=Integer.parseInt(pid);
				 String user=puser;
				 String pass=ppass;
				 
				 
				 String selectQuery="update registration set user=?,pass=? where id=?";
				 PreparedStatement preparedStatement=null;
				 
				 preparedStatement=conn.prepareStatement(selectQuery);
				 preparedStatement.setString(1,user);
				 preparedStatement.setString(2,pass);
				 preparedStatement.setString(3,id+"");
				 
				 int count=preparedStatement.executeUpdate();
				 if(count==0){
					 //System.out.println("No Record Found ");
					 l5.setForeground(Color.red);
					 l5.setText("No Record Found!!");
				 }
				 else{
				 //System.out.println("Data Succesfully Updated");
				 l5.setForeground(Color.green);
				 l5.setText("Data Entered Succesfully ");
				 }
			}
			catch(Exception e){
				System.out.println(e);
				l5.setForeground(Color.red);
				l5.setText("Exception Occur_Cant update the data!!");
			}
		}
		static void delete(String p){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
		
				int id=Integer.parseInt(p);
				
				String deleteQuery="delete from registration where id=?";
				PreparedStatement preparedStatement;
				
				preparedStatement=conn.prepareStatement(deleteQuery);
				preparedStatement.setString(1, id+"");
				
				int count=preparedStatement.executeUpdate();
				
				if(count==0){
					System.out.println("No record Found With ID ");
					l5.setBounds(260, 300, 150, 20);
					l5.setForeground(Color.red);
					l5.setText("No Record Found!!");}
				else
					{
					System.out.println("Total "+count+"Record Deleted!!");
					l5.setBounds(260, 300, 150, 20);
				    l5.setForeground(Color.green);
				    l5.setText("Data Deleted Succesfully ");}
				
				
			}
			catch(Exception e){
				System.out.println(e);	
				l5.setBounds(260, 300, 150, 20);
				l5.setForeground(Color.red);
				l5.setText("Exception Occur_Cant update the data!!");
				}
		}
		static String display(){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
			
				String selectQuery="select * from registration";
				PreparedStatement preparedStatement;
				
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				
				String string_data="";
				while(result.next()){
					string_data=string_data+"Id   "+result.getString(1)+"\nName   "+result.getString(2)+"\nPassword   "+result.getString(3)+"\n\n";
				}
				return string_data;
				}
				catch(Exception e){
					return e+"";
				}
		}
	Database_combined_GUI(){
		f=new JFrame();
		f.setLayout(null);
		f.setVisible(true);
		//f.setVisible(false);
		f.setBounds(600, 200, 400, 450);
		
		mb=new JMenuBar();
		mb.setBounds(0,0,800,40);
		f.add(mb);
		
		Db=new JMenu("Database Operations ");
		mb.add(Db);
		
		insert=new JMenuItem("Insert");
		insert.addActionListener(this);
		Db.add(insert);
		
		update=new JMenuItem("Update");
		update.addActionListener(this);
		Db.add(update);
		
		delete=new JMenuItem("Delete");
		delete.addActionListener(this);
		Db.add(delete);
		
		display=new JMenuItem("Display");
		display.addActionListener(this);
		Db.add(display);
		
		exit=new JMenuItem("Exit");
		exit.addActionListener(this);
		Db.add(exit);
		
		/*---------------frame 1 for Insertion-------------------*/
				f1=new JFrame();
				f1.setLayout(null);
				f1.setVisible(false);
				//f1.setVisible(true);
				f1.setBounds(400, 200, 800, 500);
				
				l1=new JLabel("Insert Into Database");
				l1.setFont(l1.getFont().deriveFont(20.85632412f));
				l1.setBounds(220, 50, 300, 20);
				f1.add(l1);
				
				l2=new JLabel("Enter the USER ID");
				l2.setBounds(150, 150, 150, 20);
				f1.add(l2);
				
				l3=new JLabel("Enter the User Name ");
				l3.setBounds(150, 200, 150, 20);
				f1.add(l3);
				
				l4=new JLabel("Enter the Password ");
				l4.setBounds(150, 250, 150, 20);
				f1.add(l4);
				
				l5=new JLabel();
				l5.setBounds(260, 350, 250, 20);
				f1.add(l5);
				
				Border border = BorderFactory.createLineBorder(Color.gray, 2);
				t1=new JTextArea();
				t1.setBounds(360,150,100,20);
				t1.setVisible(true);
				t1.setBorder(border);
				f1.add(t1);
				
				t2=new JTextArea();
				t2.setBounds(360,200,150,20);
				t2.setVisible(true);
				t2.setBorder(border);
				f1.add(t2);
				
				t3=new JTextArea();
				t3.setBounds(360,250,150,20);
				t3.setVisible(true);
				t3.setBorder(border);
				f1.add(t3);
				
				b1=new JButton("Submit ");
				b1.setBounds(260,300,100,20);
				b1.enable();
				b1.addActionListener(this);
				b1.setVisible(true);
				f1.add(b1);
				
				/*-----------------------------------*/
				
				/*---------------frame 2 for Update-------------------*/
				f2=new JFrame();
				f2.setLayout(null);
				f2.setVisible(false);
				//f1.setVisible(true);
				f2.setBounds(400, 200, 800, 500);
				
				l6=new JLabel("Update Into Database");
				l6.setFont(l1.getFont().deriveFont(20.85632412f));
				l6.setBounds(220, 50, 300, 20);
				f2.add(l6);
				
				l7=new JLabel("Enter ID of user you want to update");
				l7.setBounds(150, 150, 150, 20);
				f2.add(l7);
				
				l8=new JLabel("Enter the new Name ");
				l8.setBounds(150, 200, 150, 20);
				f2.add(l8);
				
				l9=new JLabel("Enter the new Password ");
				l9.setBounds(150, 250, 150, 20);
				f2.add(l9);
				
				
				t4=new JTextArea();
				t4.setBounds(360,150,100,20);
				t4.setVisible(true);
				t4.setBorder(border);
				f2.add(t4);
				
				t5=new JTextArea();
				t5.setBounds(360,200,150,20);
				t5.setVisible(true);
				t5.setBorder(border);
				f2.add(t5);
				
				t6=new JTextArea();
				t6.setBounds(360,250,150,20);
				t6.setVisible(true);
				t6.setBorder(border);
				f2.add(t6);
				
				b2=new JButton("Update ");
				b2.setBounds(260,300,100,20);
				b2.enable();
				b2.addActionListener(this);
				b2.setVisible(true);
				f2.add(b2);
				
				f2.add(l5);
				
				/*-----------------------------------*/
				
				/*---------------frame 3 for Delete-------------------*/
				f3=new JFrame();
				f3.setLayout(null);
				f3.setVisible(false);
				//f1.setVisible(true);
				f3.setBounds(400, 200, 800, 350);
				
				l10=new JLabel("Delete Into Database");
				l10.setFont(l1.getFont().deriveFont(20.85632412f));
				l10.setBounds(220, 50, 300, 20);
				f3.add(l10);
				
				l11=new JLabel("Enter ID of user you want to Delete Data");
				l11.setBounds(150, 100, 150, 20);
				f3.add(l11);
				
				t7=new JTextArea();
				t7.setBounds(360,100,100,20);
				t7.setVisible(true);
				t7.setBorder(border);
				f3.add(t7);
				
				b3=new JButton("Delete");
				b3.setBounds(260,160,100,20);
				b3.enable();
				b3.addActionListener(this);
				b3.setVisible(true);
				f3.add(b3);
				
				f3.add(l5);
				
				/*-----------------------------------*/
		        
				/*---------------frame 4 for Display -------------------*/
				f4=new JFrame();
				f4.setLayout(null);
				f4.setVisible(false);
				//f1.setVisible(true);
				f4.setBounds(400, 200, 600, 600);
				
				l12=new JLabel("User Record Display");
				l12.setFont(l1.getFont().deriveFont(20.85632412f));
				l12.setBounds(190, 50, 300, 30);
				f4.add(l12);
				
				
				t8=new JTextArea();
				t8.setBounds(60,150,480,350);
				t8.setVisible(true);
				t8.setBorder(border);
				f4.add(t8);
				
				b4=new JButton("Display");
				b4.setBounds(220,100,100,30);
				b4.enable();
				b4.addActionListener(this);
				b4.setVisible(true);
				f4.add(b4);
				
				f4.add(l5);
				
				/*-----------------------------------*/
		
	}
	public void actionPerformed(ActionEvent e) {
		Object z=e.getSource();
		if(z==insert){
			f1.setVisible(true);	
		}
		if(z==b1){
			//System.out.println(t1.getText());
			/*String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();*/
			insert(t1.getText(),t2.getText(),t3.getText());
		}
        if(z==update){
			f2.setVisible(true);
		}
        if(z==b2){
        	update(t4.getText(),t5.getText(),t6.getText());
        }
        if(z==delete){
			f3.setVisible(true);
		}
        if(z==b3){
        	delete(t7.getText());
        }
        if(z==display){
			f4.setVisible(true);
		}
        if(z==b4){
        	t8.setText(display());
        }
        if(z==exit){
			f.dispose();
		}
		
	}

	public static void main(String[] args) {
		new Database_combined_GUI();
	}
}
