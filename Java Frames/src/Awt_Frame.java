import java.awt.*;

public class Awt_Frame
{
    public static void main(String args[])
    {
        Frame f = new Frame();

      //f.setUndecorated(true);

	f.setSize(300, 300);

	f.setTitle("Demo");

	f.setBackground(Color.YELLOW);

	f.setCursor(4);

    f.setLocation(200, 200);

    f.setVisible(true);

    f.setIconImage(Toolkit.getDefaultToolkit().getImage("777.jpg"));

    }
}



