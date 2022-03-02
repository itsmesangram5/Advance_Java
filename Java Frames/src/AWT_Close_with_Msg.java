import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

class AWT_Close_with_Msg
{
	public static void main(String a[])
	{
	    final Frame f=new Frame();
	    f.setTitle("Demo");
	    f.setLocation(300,200);
	    f.setBackground(new Color(12,223,255));
        f.setSize(300,350);
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

	       }
      });
}
}



/*
	  		   JOptionPane.showMessageDialog( f,
	                                                        "Thank You For Visiting !!!",
	                                                        "AboutUs",3);
//   				                             JOptionPane.PLAIN_MESSAGE);


JOptionPane.showMessageDialog( f,
	                                                        "Thank You For Visiting !!!",
	                                                        "AboutUs",
   				                             JOptionPane.PLAIN_MESSAGE);

		  //0 =error    1=plain

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



JOptionPane.showMessageDialog(f,
														  "Error Dialog Box",
														  "Title",0);
														 //JOptionPane.ERROR_MESSAGE);


 int option =JOptionPane.showConfirmDialog(f,
 																				"Do you to close?",
 																				"Title",
                    									JOptionPane.YES_NO_OPTION,3);
//             									JOptionPane.QUESTION_MESSAGE);

        if (option == 0)   // yes=0 & No = 1
	     f.dispose();


	int option =JOptionPane.showConfirmDialog(f,
																	 "Do you want to Save?",
 																		"Title",
                    					  JOptionPane. YES_NO_CANCEL_OPTION,
      							          JOptionPane.QUESTION_MESSAGE);

	    if (option == 0)   // yes=0 & No = 1 &	Cancel=2
    {
       System.out.println("file Save");
    }
    else
    if(option==1)
      f.dispose();
  }
*/