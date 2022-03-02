import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Open_app_swing {
	public void main(String[] args) {
		JFrame f=new JFrame();
		JButton r,g,b;
		r=new JButton("Notepd");
		g=new JButton("MsPaint");
		b=new JButton("Calc");
		r.createActionListener();
		g.createActionListener();
		b.createActionListener();
		add(r);
		add(g);
		add(b);
	   	 f.setDefaultCloseOperation(0);

	}

}
