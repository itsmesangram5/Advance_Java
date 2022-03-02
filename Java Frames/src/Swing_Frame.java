import javax.swing.*;

import java.awt.*;

public class Swing_Frame
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();

    //  f.setUndecorated(true);

    f.setSize(300, 300);

		f.setTitle("Demo");

		//f.setBackground(Color.red);

		//f.setResizable(false);

		f.getContentPane().setBackground(Color.red);

		f.setCursor(4);

	        f.setLocation(200, 200);

        f.setVisible(true);

		f.setIconImage(Toolkit.getDefaultToolkit().getImage("123.jpg"));
 }
}


















