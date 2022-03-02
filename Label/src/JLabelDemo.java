import java.applet.Applet;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class JLabelDemo extends Applet {
	private static final String Imgs=null;
      public void init(){
    	  JLabel one =new JLabel();
    	  one.setText("One");
    	  
    	  Image imgs=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\Dropbox\\PC\\Downloads\\logostart.png");
    	  ImageIcon is=new ImageIcon(imgs);
    	  JLabel two=new JLabel(is);
    	  
    	  imgs=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\Dropbox\\PC\\Downloads\\logostart.png");
    	  is=new ImageIcon(imgs);
    	  JLabel three=new JLabel("Three",is,10);
    	  add(one);
    	  add(two);
    	  add(three);
      }
}
