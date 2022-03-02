
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Coordinate_Mouse_Applet_Viewer extends Applet implements MouseMotionListener{
	int X=0, Y=0;
	public void init()
	{
	this.setSize(800,480);
	// this is default object of applet
	//addMouseListener(this);
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
		g.drawString("Mouse at "+X+","+Y, 100, 60);
	}
	public void mouseDragged(MouseEvent me){
		me.getButton();
	}
    
}
