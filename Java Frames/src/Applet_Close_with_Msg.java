/*
<html>

<applet code="Applet_Close_with_Msg.class"
height=200 width=320>

  </applet>
</html>

*/
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Applet_Close_with_Msg extends Applet
{
	Frame f;

	public void init()
	{
	    f=new Frame();
	    f.setTitle("Demo");
	    f.setLocation(500,200);
	    f.setBackground(new Color(12,223,255));
        f.setSize(300,350);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
{
  public void windowClosing(WindowEvent e)
  {
        JOptionPane.showMessageDialog
                    (f, "Plain Dialog Box","Title",
   				     JOptionPane.PLAIN_MESSAGE);

       JOptionPane.showMessageDialog
                   (f, "Error Dialog Box","Title",
        			JOptionPane.ERROR_MESSAGE);

        int option =
        			JOptionPane.showConfirmDialog
       	             (  f,"Do you to close?","Title",
                    JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE);

                System.out.println(""+option);

        if (option == 0)   // yes=0 & No = 1
	     	f.dispose();
   }
 });

 }

}