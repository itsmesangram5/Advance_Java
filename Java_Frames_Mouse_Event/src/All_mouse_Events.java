
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class All_mouse_Events extends Applet implements MouseMotionListener,MouseListener{
	int X=0, Y=0;
	String msg;
	public void init()
	{
	this.setSize(800,480);
	// this is default object of applet
	addMouseListener(this);
	addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent me)
	{
	 X=me.getX();
	 Y=me.getY();
	 repaint();
	}
	public void paint(Graphics g){
		//g.drawString("Mouse at "+X+","+Y, 100, 60); // at fix position
		g.drawString(msg, 100, 60);
	}
	public void mouseDragged(MouseEvent me){
		X=me.getX();
		Y=me.getY();
		msg="Dragged  ";
		repaint();
	}
	public void  mouseExited(MouseEvent me){
		msg="Exit from applet window ";
		repaint();
	}
	public void  mousePressed(MouseEvent me){
		msg="Down ";
		repaint();
	}
    
	public void  mouseReleased(MouseEvent me){
		msg="Up ";
		repaint();
	}
	
	public void mouseClicked(MouseEvent e) {
		msg="Clicked ";
		repaint();
		
	}
	
	public void mouseEntered(MouseEvent e){
		msg="Entered ";
		repaint();
		
	}
	
    
    
}
