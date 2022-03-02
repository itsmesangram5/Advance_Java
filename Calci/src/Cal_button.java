import java.applet.Applet;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;


public class Cal_button extends Applet implements ActionListener  {
	JButton c0,c1,c2,c3,c4,c5,c6,c7,c8,c9,c_add,c_sub,c_mul,c_div,c_back,c_exit;
	Runtime runtime=Runtime.getRuntime();
	int x=1;
	public void init(){
		setSize(500,500);
		c0=new JButton("0");
		c1=new JButton("1");
		c2=new JButton("2");
		c3=new JButton("3");
		c4=new JButton("4");
		c5=new JButton("5");
		c6=new JButton("6");
		c7=new JButton("7");
		c8=new JButton("8");
		c9=new JButton("9");
		c_add=new JButton(" + ");
		c_sub=new JButton(" - ");
		c_mul=new JButton(" * ");
		c_div=new JButton(" / ");
		c_back=new JButton("Backspace");
		c_exit=new JButton("Exit");
		c0.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		c5.addActionListener(this);
		c6.addActionListener(this);
		c7.addActionListener(this);
		c8.addActionListener(this);
		c9.addActionListener(this);
		c_add.addActionListener(this);
		c_sub.addActionListener(this);
		c_div.addActionListener(this);
		c_back.addActionListener(this);
		c_exit.addActionListener(this);
		
		add(c0);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		add(c9);
		add(c_add);
		add(c_sub);
		add(c_mul);
		add(c_div);
		add(c_back);
		add(c_exit);
}
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		while(str.equals("Exit")){
		try {
		if(str.equals("0")){
				runtime.exec("notepad.exe");
		}
		if(str.equals("1")){
			runtime.exec("m");
		}
		if(str.equals("2")){
			runtime.exec("calc.exe");
		}
		if(str.equals("0")){
			runtime.exec("notepad.exe");
	    }
	    if(str.equals("1")){
		    runtime.exec("m");
	    }
	    if(str.equals("2")){
		    runtime.exec("calc.exe");
	    }
	    if(str.equals("0")){
			runtime.exec("notepad.exe");
	    }
	    if(str.equals("1")){
		     runtime.exec("m");
	    }
	    if(str.equals("2")){
		      runtime.exec("calc.exe");
	    }
	    if(str.equals("0")){
		     runtime.exec("notepad.exe");
        }
        if(str.equals("1")){
	         runtime.exec("m");
        }
        if(str.equals("2")){
	         runtime.exec("calc.exe");
        }
		
		}
		catch(IOException e1){
		//e1.printStackTrace(); //optional 
	              }
		}
	
}
}