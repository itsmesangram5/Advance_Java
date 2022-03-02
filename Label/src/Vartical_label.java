import java.awt.Frame;
import java.awt.Label;

public class Vartical_label extends Frame{
	Label l1,l2,l3;
	
	Vartical_label(){
		l1=new Label("one");
		l1.setBounds(50, 50, 150, 20);
		
		l2=new Label("two");
		l2.setBounds(50, 100, 150, 20);
		
		l3=new Label("three");
		l3.setBounds(50, 150, 150, 20);
		setSize(300,300);
		
		setLayout(null);
		setVisible(true);
		
		add(l1);
		add(l2);
		add(l3);
	}
	public static void main(String[] args){
		Vartical_label v=new Vartical_label();
				}

}
