import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Applet_Frame_using_awt_main {
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
  			 f.dispose();
  	     }
	});
}	
}
