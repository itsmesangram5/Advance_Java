import java.applet.Applet;
import java.awt.*;
public class ButtonDemo extends Applet{
	String msg="";
	Button b1,b2,b3;
	
	public void init(){
		setSize(500,500);
		b1=new Button("Yes");
		b2=new Button("No");
		b3=new Button();
		b3.setLabel("Cancel ");
		add(b3);
		add(b2);
		add(b1);
		
	}
	public void paint(Graphics g){
		msg=b1.getLabel();
		g.drawString(msg, 6, 100);
	}
                   
}
