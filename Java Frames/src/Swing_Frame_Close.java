import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class Swing_Frame_Close
{
   public static void main(String args[])
  {
   	    final JFrame f=new JFrame();
	    f.setTitle("Demo");
	    f.getContentPane().setBackground(new Color(12,223,255));
        f.setSize(200,300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
        {
           public void windowClosing(WindowEvent e)
         {
        	   int option =JOptionPane.showConfirmDialog(f,
						"Do you want to Save?",
						"Title",
JOptionPane. YES_NO_CANCEL_OPTION,
	JOptionPane.QUESTION_MESSAGE);

if (option == 0)   // yes=0 & No = 1 &	Cancel=2
{
System.out.println("file Save");
f.dispose();
}
else
if(option==1)
f.dispose();
else
f.setVisible(true);
       	    //System.out.println("Frame close");
       	    f.dispose();
          }
       });
// f.setDefaultCloseOperation(f.DO_NOTHING_ON_CLOSE);
     f.setDefaultCloseOperation(0);
    }
  }










//or
	//  f.setDefaultCloseOperation(f.DO_NOTHING_ON_CLOSE);
	//  f.setDefaultCloseOperation(0);
	 //f.setDefaultCloseOperation(2);
	//     f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);







      
     

