import java.awt.*;
import java.util.*;
import java.awt.event.*;
// ___________________________________ADD___Close_Event
 class Multi_Window_With_Colour 
{
 public static void main (String args[])
{
Scanner s= new Scanner (System.in);

System.out.println("Enter How Many Frames:");

 int no=s.nextInt();
 SampleFrame f[]=new SampleFrame[no];

for(int i=0; i<no;i++)
{
 f[i]=new SampleFrame(i);
 f[i].setTitle("Handle Mouse EVent ");
 f[i].setSize(300,200);
 f[i].setLocation(100*i, 100*i);
 f[i].setAutoRequestFocus(true);
f[i].setVisible(true);
}
}
}

 class SampleFrame extends Frame implements MouseListener
{
 Random ra= new Random();

 SampleFrame(int i)
{
 addMouseListener((MouseListener) this);
}
 public void mouseEntered(MouseEvent evtObj)
{
 int r=ra.nextInt(256);
 int g=ra.nextInt(256);
 int b=ra.nextInt(256);
setBackground(new Color(r,g,b));
}

 public void mouseExited(MouseEvent evtObj)
{
 int r=ra.nextInt(256);
 int g=ra.nextInt(256);
 int b=ra.nextInt(256);
  setBackground(new Color(r,g,b));
 }

public void mousePressed(MouseEvent me){}

public void mouseReleased(MouseEvent me){}


public void mouseClicked(MouseEvent me){}
}