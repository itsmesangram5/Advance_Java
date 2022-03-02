import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Button_Nmae_Change extends Applet implements ActionListener {
	JButton r,g,b;
	public void init(){
		setSize(500,500);
		r=new JButton("Start");;
		r.addActionListener(this);
		add(r);
}
	public void actionPerformed(ActionEvent e){
		String str =e.getActionCommand();
		if(str.equals("Start")){
			r.setLabel("Pause");
			System.out.println(" Start pressed");
		}
		if(str.equals("Pause")){
			r.setLabel("Start");
			System.out.println(" Pause pressed");
		}
	}
}
