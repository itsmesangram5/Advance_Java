import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Reg_form  implements ActionListener {

	static JTextField tn,tm;
	static JLabel ln,lm,ldob,ldate,lmonth,lyear;
	//static JButton submit,cancel;
	static JFrame f;
	Reg_form(){
		f=new JFrame("Registration Form ");
		f.setBounds(400, 200, 800, 500);
		f.setVisible(true);
		f.setTitle("Registration Form ");
		f.setDefaultCloseOperation(1);
		
		tn= new JTextField(20);
		tn.setBounds(200,50, 150, 30);
		f.add(tn);
		
		tm= new JTextField(16);
		tm.setBounds(200,150, 150, 30);
		f.add(tm);
		
		//ln=new JLabel("Name");
		//ln.setLocation(100, 50);
		//ln.setBounds(100,100, 50, 50);
		//f.add(ln);
		
		//lm=new JLabel("Mob Number ");
		//lm.setBounds(100,50, 50, 50);
		//f.add(lm);
		
		//ldob=new JLabel("Date Of Birth ");
		//ldob.setBounds(100,200, 100, 50);
		//f.add(ldob);
		
		//ldate=new JLabel("Date ");
		//ldate.setBounds(100,200, 100, 50);
		//f.add(ldate);
		
		//lmonth=new JLabel("Month");
		//lmonth.setBounds(100,200, 100, 50);
		//f.add(lmonth);
		
		//lyear=new JLabel("Year");
		//lyear.setBounds(100,200, 100, 50);
		//f.add(lyear);
		
		//String months[]={"Jan","Feb","March","April","May","June","Jul","Aug","Sept","Oct","Nov","Dec"};
		//JComboBox d=new JComboBox(months);
		//d.setBounds(200, 200, 100, 50);
		//f.add(d);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		
	}
	public static void main (String[] args){
		new Reg_form();	
	}

}
