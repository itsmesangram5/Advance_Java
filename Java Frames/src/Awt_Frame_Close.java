import java.awt.*;

import java.awt.event.*;

public class Awt_Frame_Close
{
   public static void main(String args[])
  {
   	    final Frame f=new Frame();
	    f.setTitle("Demo");
	    f.setBackground(new Color(12,223,255));
        f.setSize(200,300);
        f.setVisible(true);

       f.addWindowListener(new WindowAdapter()
       {
          public void windowClosing(WindowEvent e)
        {
      	   //f.setVisible(false);
         f.dispose();
    //    System.exit(0);
         }
      });
    }
  }





