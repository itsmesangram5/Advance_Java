import java.applet.Applet;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class JButtoDemo extends Applet {
	JButton b1,b2;
	public void init(){
		setSize(500,500);
		ImageIcon is1=new ImageIcon(Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\Dropbox\\PC\\Downloads\\logostart.png"));
		b1=new JButton(is1);
		//b1.setBounds(1,1,1,1);
		//b1.setBounds(2, 2, 3, 3);
		ImageIcon is2=new ImageIcon(Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\Dropbox\\PC\\Downloads\\logostart.png"));
		b2=new JButton("Pause",is2);
		add(b1);
		add(b2);
	}
             
}
