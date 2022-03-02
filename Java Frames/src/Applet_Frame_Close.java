import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Applet_Frame_Close extends Applet
{
	Frame f;

	public void init()
	{
	    f=new Frame();
	    f.setTitle("Demo");
	    f.setBackground(new Color(12,223,255));
        f.setSize(200,300);
        f.setVisible(true);

		f.addWindowListener(new WindowAdapter()
		{
			  public void windowClosing(WindowEvent e)
			  {
				   	f.dispose();
			   }
		 });
   }
}










