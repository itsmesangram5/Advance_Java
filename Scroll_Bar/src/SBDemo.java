import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class SBDemo extends Applet implements AdjustmentListener  {
	String msg="";
	Scrollbar vertSB,horzSB;
	public void init(){
		vertSB = new Scrollbar(Scrollbar.VERTICAL);
		horzSB = new Scrollbar(Scrollbar.HORIZONTAL);
		add(vertSB);
		add(horzSB);
		vertSB.addAdjustmentListener(this);
		horzSB.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae){
		repaint();
	}
	public void paint(Graphics g) {
	    msg="Vertical"+vertSB.getValue();
	    msg="Horizontal"+horzSB.getValue();
	    g.drawString(msg, 10, 160);

	}

}
