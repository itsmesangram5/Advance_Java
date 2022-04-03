import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;


public class Name_Highliter extends JFrame{
	public Name_Highliter(){
		JProgressBar jprgbar= new JProgressBar();
		jprgbar.setOrientation(0); // jprgbar.HORIZONTAL // pin style
		jprgbar.setBackground(new Color(12,23,255));
		jprgbar.setFont(new Font("Algerian",Font.BOLD,40));
		jprgbar.setForeground(Color.red);
		jprgbar.setToolTipText(" Use of this Button ");
		jprgbar.setIndeterminate(true);
		jprgbar.setString("DIAMOND");
		jprgbar.setStringPainted(true);
		add(jprgbar);
		setTitle("ProgressBar");
		setSize(1000,1000);
		setResizable(false);
		
		setLocation(100,200);
		setVisible(true);
	}
	public static void main(String args[]){
		new Name_Highliter();
	}

}
