import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.JFrame;
public class Frame_using_swing {
	public static void main(String[] args) {
		JFrame f=new JFrame();
	   	 f.setUndecorated(false);
	   	 f.setTitle("My Frame ");
	   	 //f.setBackground(Color.YELLOW);
	   	 f.getContentPane().setBackground(Color.gray);
	   	 f.setBackground(new Color(55,255,255)); //can not run
	   	 f.setCursor(6);
	   	 f.setResizable(true);
	   	 f.setVisible(true);
	   	 f.setCursor(6);
	   	 f.setResizable(true);
	   	 f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Java Frames\\src\\my.jpg"));
	   	 //you have a Image.jpg
	   	 f.setSize(500,500);
	   	 f.setLocation(200, 300);
	   	 //f.setDefaultCloseOperation(f.DO_NOTHING_ON_CLOSE);
	   	 //f.DO_NOTHING_ON_CLOSE is a final variable in system having given value '0'
	   	 f.setDefaultCloseOperation(1);

	}
	/*public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		try {
		if(str.equals("Notepd")){
				runtime.exec("notepad.exe");
		}
		if(str.equals("MsPaint")){
			runtime.exec("mspaint.exe");
		}
		if(str.equals("Calc")){
			runtime.exec("calc.exe");
		}
		}
		catch(IOException e1){
		e1.printStackTrace();
	}*/

}
