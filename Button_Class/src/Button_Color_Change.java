import java.applet.Applet;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Button_Color_Change extends Applet implements ActionListener  {
	JButton r,g,b;
	public void init(){
		setSize(500,500);
		r=new JButton("Red");
		//r.getBackground();
		//r.setBorderPainted(true);
		g=new JButton("Green");
		b=new JButton("Blue");
		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
		add(r);
		add(g);
		add(b);
}
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		if(str.equals("Red")){
			setBackground(Color.red);
		}
		if(str.equals("Green")){
			setBackground(Color.green);
		}
		if(str.equals("Blue")){
			setBackground(Color.blue);
		}
	}
	/*public void actionPerformedObject(ActionEvent e){
		Object str=e.getSource();
		if(str.equals(str)){
			setBackground(Color.red);
		}
		if(str.equals(str)){
			setBackground(Color.green);
		}
		if(str.equals(str)){
			setBackground(Color.blue);
		}
	}*/
}