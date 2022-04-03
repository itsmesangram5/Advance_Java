import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class File_Chooser_Application extends JFrame implements ActionListener
{
JMenuBar mb;
JMenu file;
JMenuItem open;
JTextArea ta;

	
	public static void main(String[] args)
	{
		File_Chooser_Application om=new File_Chooser_Application();
		om.setSize(500,500);
		om.setLayout(null);
		om.setVisible(true);
		
		

	}
	File_Chooser_Application()
	{
		mb=new JMenuBar();
		
		file=new JMenu("File");
		
		open=new JMenuItem("Open File");
		
		open.addActionListener(this);
		
		file.add(open);
		
		mb.setBounds(0,0,800,20);
		mb.add(file);
		
		ta=new JTextArea(800,800);
		ta.setBounds(0,20,1000,800);
		add(mb);
		add(ta);
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==open)
		{
			JFileChooser fc=new JFileChooser();
			
			int i=fc.showOpenDialog(this);
			
			if(i==JFileChooser.APPROVE_OPTION)
			{
				File f=fc.getSelectedFile();
				 
				String filepath=f.getPath();
				
				try
				{
					BufferedReader br=new BufferedReader(new FileReader(filepath));
					String s1="",s2="";
					
					while((s1=br.readLine())!=null)
						s2+=s1+"\n";
						
					ta.setText(s2);
					br.close();
					
				}
				catch(Exception ex){}
			}
			
		}
		
	}

}
