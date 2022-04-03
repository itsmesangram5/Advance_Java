import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class SimpleKey extends Applet implements KeyListener{
	
	private static final long serialVersionUID = 1L;
	String msg = "";
	int X=10,Y=20;
	public void init()
	{
		addKeyListener(this);
	}
	
	
	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Up");
	}
	public void keyTyped(KeyEvent ke)
	{
		msg=msg+ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
	}

	public void keyPressed(KeyEvent e) {
		showStatus("Key Down");
	}

	}