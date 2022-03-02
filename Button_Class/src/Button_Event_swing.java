import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Button_Event_swing extends Applet implements ActionListener {
	JButton s,p;
	public void init(){
		setSize(500,500);
	s = new JButton("Start");
	p = new JButton("Pause");
	s.addActionListener(this);
	p.addActionListener(this);
	p.setEnabled(false);
	
	add(s);
	add(p);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj==s){
			p.setEnabled(true);
			s.setEnabled(false);
		}
		else if(obj==p){
			p.setEnabled(false);
			s.setEnabled(true);
		}
		
	}
	

}

