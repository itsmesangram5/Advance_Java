import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Registration implements ActionListener,KeyListener {

	static JTextField tn,tm,td;
	static JLabel lm,ln,ldob,ldate,lmonth,lyear;
	static JButton z,cancel;
	final JFrame f;
	Registration(){
		f=new JFrame("Registration Form ");
		
		
		tn= new JTextField();
		tn.setBounds(200,50, 300, 20);
		tn.addActionListener(this);
		//tn.disable();
		tn.addKeyListener(this);
		f.add(tn);
		
		tm= new JTextField(10);
		tm.setBounds(200,100, 300, 20);
		tm.addActionListener(this);
		f.add(tm);
		
		ln=new JLabel("Name");
		ln.setBounds(100,50,100,30);
		f.add(ln);
		
		lm=new JLabel("Mob Number ");
		lm.setBounds(100,100,100,30);
		lm.setForeground(Color.green);
		f.add(lm);
		
		
		ldob=new JLabel("Date Of Birth ");
		ldob.setBounds(100,150,100,30);
		f.add(ldob);
		
		ldate=new JLabel("Date ");
		ldate.setBounds(200,170, 100, 20);
		f.add(ldate);
		
		lmonth=new JLabel("Month");
		lmonth.setBounds(350,170, 100, 20);
		f.add(lmonth);
		
		lyear=new JLabel("Year");
		lyear.setBounds(500,170, 100, 20);
		f.add(lyear);
		
		String months[]={"Jan","Feb","March","April","May","June","Jul","Aug","Sept","Oct","Nov","Dec"};
		JComboBox d=new JComboBox(months);
		d.setBounds(350, 150, 100, 20);
		f.add(d);
		
		String year[]=new String[73];
		int j=1950;
		for(int i=0;i<73;i++){
				String temp=j+"";
				year[i]=temp;
				j++;
				temp="";
		}
		JComboBox yr=new JComboBox(year);
		yr.setBounds(500, 150, 100, 20);
		f.add(yr);
		
		String date[]=new String[31];
		for(int i1=1;i1<32;i1++){
				String temp1=i1+"";
				year[i1]=temp1;
				i1++;
				temp1="";
		}
		JComboBox dt=new JComboBox(date);
		dt.setBounds(200,150, 100, 20);
		f.add(dt);
		
		z=new JButton("Submit");
		z.setBounds(600, 400, 100, 20);
		z.addActionListener(this);
		f.add(z);
		
		cancel=new JButton("Cancel");
		cancel.setBounds(450, 400, 100, 20);
		cancel.addActionListener(this);
		f.add(cancel);
		
		//f.setSize(800, 500);
		f.setBounds(300, 300, 800, 500);
		f.setLayout(null);
		f.setTitle("Registration Form ");
		//f.setDefaultCloseOperation(1);
		f.setVisible(true);
	}
	public void keyTyped(KeyEvent ke)
	{
		String name,mob,date;
		name=tn.getText();
	    char a1=name.charAt(name.length()-1);
	    /*if((a1>64 && a1<91)||(a1>96 && a1<126)|| a1==' '){
	    	
	    }
	    else{
	    	tn.setText(name.substring(0, name.length()));
	    }*/
	    
	    
	
		mob=tm.getText();
		char a2=mob.charAt(mob.length());
		
		date=td.getText();
		char a3=date.charAt(date.length());
	}
		
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		//Object obj=e.getSource();
		if(s=="Cancel"){
			f.dispose();
		}
        if(s=="Submit"){
			
		}
		
	}
	public static void main (String[] args){
		new Registration();	
	}
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}