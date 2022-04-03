import javax.swing.*;

import java.awt.event.*;

class JTextAreaExampleNew implements ActionListener
{
	JLabel l1,l2,l3;
	JTextArea area;
	JButton b;

	JTextAreaExampleNew()
	{
	    JFrame f= new JFrame();

	    l1=new JLabel("hi");
	    l1.setBounds(50,25,100,30);
	    l2=new JLabel("Dude");
	    l2.setBounds(160,25,100,30);

	    l3=new JLabel("Hello");
	    l3.setBounds(300,25,100,30);

	    area=new JTextArea();
	    area.setBounds(20,75,250,200);

	    b=new JButton("Count Words");
	    b.setBounds(100,300,120,30);
	    b.addActionListener(this);

	    f.add(l1);
	    f.add(l2);
	    f.add(l3);
	    f.add(area);
	    f.add(b);

	    f.setSize(450,450);
	    f.setLayout(null);
	    f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	    String text=area.getText();

	    text=text.trim();

	    String words[]=text.split(" ");

	    String line[]=text.split("\n");

        if(text.length()==0)
	    l1.setText("Words: 0");
	    else
	    l1.setText("Words: "+words.length);

	    l2.setText("Characters: "+((text.length()-(words.length-1))));

	    l3.setText("Line: "+line.length);

	}
	public static void main(String[] args)
	{
	    new JTextAreaExampleNew();
	}
}






