import java.applet.Applet;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;


public class Open_app extends Applet implements ActionListener  {
	JButton r,g,b;
	Runtime runtime=Runtime.getRuntime();
	public void init(){
		setSize(500,500);
		r=new JButton("Notepd");
		g=new JButton("MsPaint");
		b=new JButton("Calc");
		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
		add(r);
		add(g);
		add(b);
}
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		try {
		if(str.equals("Notepd")){
				runtime.exec("notepad.exe");
		}
		if(str.equals("MsPaint")){
			runtime.exec("mspaint.exe");
		}
		if(str.equals("Calc")){
			runtime.exec("calc.exe");
		}
		}
		catch(IOException e1){
		//e1.printStackTrace(); //optional 
	}
	
}
}