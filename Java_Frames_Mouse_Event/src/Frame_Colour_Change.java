import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Frame_Colour_Change extends Applet implements MouseListener{
   Frame f;
   public void init(){
	   f=new Frame();
	   f.setTitle("Color Change ");
	   f.setVisible(true);
	   f.setSize(400,400);
	   f.addMouseListener(this);//Important Line without this you can not change the color as all methods below will be disabled
	   f.addWindowListener(new WindowAdapter()
	 	 {
	 		 public void windowClosing(WindowEvent e)
	 		 {
	 			 f.dispose();
	 	     }
		});
   }
   public void mouseEntered(MouseEvent e){
	   f.setBackground(Color.red);
   }
   public void mouseExited(MouseEvent e){
	   f.setBackground(new Color(0,255,0));
   }
   public void mousePressed(MouseEvent me){}
   public void mouseReleased(MouseEvent me){}
   public void mouseClicked(MouseEvent me){}
   
}
