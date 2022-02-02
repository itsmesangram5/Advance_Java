import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;


public class Applet_Frame_awt_close_message {
	public static void main(String[] args) {
		final Frame f=new Frame();
   	 f.setUndecorated(false);
   	 f.setTitle("My Frame ");
   	 //f.setBackground(Color.YELLOW);
   	 f.setBackground(new Color(55,255,255));
   	 f.setCursor(6);
   	 f.setResizable(true);
   	 f.setVisible(true);
   	 f.setCursor(6);
   	 f.setResizable(true);
   	 f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Java Frames\\src\\my.jpg"));
   	 //you have a Image.jpg
   	 f.setSize(500,500);
   	 f.setLocation(200, 300);
   	 f.addWindowListener(new WindowAdapter()
  	 {
  		 public void windowClosing(WindowEvent e)
  		 {
  			int option= JOptionPane.showConfirmDialog(f,
  					 "Thank You for Visiting ",
  					 "About Us ",
  					 JOptionPane.YES_NO_CANCEL_OPTION,
  					JOptionPane.QUESTION_MESSAGE);
  					 //JOptionPane.PLAIN_MESSAGE==1 use this or use 0 as before 
  			         //0=error 1=note/warning 3= conformation and so on
  			         // Sop("value ="+option) will print value of option you selected on TERMINAL
  					 //);
  			// yes=0 no=1 & Cancel=1
  			 if(option==0){
  				 System.out.println("save ");// process you want to do i.e code for saving
  				 f.dispose();
  			 }
  			 else if(option==1)
  				 f.dispose();
  			 else
  				 f.setVisible(true);
  				 
  			 
  	     }
	});
}	
}

