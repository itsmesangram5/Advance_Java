import java.applet.Applet;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextareaExampleAwt extends Applet implements ActionListener{
	String t;
	Button b1,b2;
	TextArea txt;
	
	public void init(){
		txt = new TextArea("Welcome to java ",10,50);
		b1=new Button("Upper Case");
		b2=new Button("Lower Case");
		add(txt);
		add(b1);
		add(b2);
	    b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String k=e.getActionCommand();
	    if(k.equals("Upper Case")){
	    	t=txt.getText();
	    	t=t.toUpperCase();
	    	txt.setText(t);
	    	
	    }
	    if(k.equals("Lower Case")){
	    	t=txt.getText();
	    	t=t.toLowerCase();
	    	txt.setText(t);
	    	
	    }
		
	}

}
