

import java.applet.*;
import java.awt.*;

public class Applet_Frame1 extends Applet
{
	public void init()
	{
		Frame f=new Frame();

		f.setUndecorated(true);

		f.setTitle("Demo");

		//f.setBackground(Color.YELLOW);
		f.setBackground(new Color(55,255,255));

       // f.setVisible(true);

		f.setCursor(6);

		f.setResizable(false);

f.setIconImage(Toolkit.getDefaultToolkit().getImage("777.jpg"));

		f.setSize(200,300);

		f.setLocation(200,300);

	 }
}











