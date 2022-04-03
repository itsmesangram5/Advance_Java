import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class file_transfer extends JFrame implements ActionListener{
	static int rate=15000,len;
	JButton brsource,dtsource,bcp,b1;
	JTextField sft,dft;
	JFileChooser jfc1,jfc2;
	static String s1,s2;
	
	@SuppressWarnings("deprecation")
	file_transfer()throws Exception{
	JFrame f=new JFrame();
	
	JLabel source=new JLabel();
	source.setText("Source");
	source.setBounds(50,50,100,30);
	f.add(source);
	
	sft=new JTextField();
	sft.setBounds(200, 50, 200, 30);
	sft.addActionListener(this);
	f.add(sft);
	
	brsource=new JButton("Browse Copy Source");
	brsource.setBounds(200, 120, 200, 30);
	brsource.setVisible(true);
	brsource.addActionListener(this);
	f.add(brsource);
	
	JLabel desti=new JLabel();
	desti.setText("Destination");
	desti.setBounds(50,190,100,30);
	f.add(desti);
	
	dft=new JTextField();
	dft.addActionListener(this);
	dft.setBounds(200, 190, 200, 30);
	f.add(dft);
	
	dtsource=new JButton("Browse Destination Source");
	dtsource.setBounds(200, 260, 200, 30);
	dtsource.setVisible(true);
	dtsource.addActionListener(this);
	f.add(dtsource);
	
	bcp=new JButton("Copy");
	bcp.setBounds(50,330, 100, 30);
	bcp.addActionListener(this);
	bcp.setVisible(false);
	//bcp.setVisible(true);
	f.add(bcp);
	
	b1=new JButton("Cancel");
	b1.setBounds(200, 330, 100, 30);
	b1.addActionListener(this);
	b1.setVisible(true);
	f.add(b1);
	
	f.setVisible(true);
	f.setLayout(null);
    f.setTitle("Transfer Files ");
	f.setBounds(100, 100, 500, 500);
	
	jfc1=new JFileChooser();
	jfc1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	
	jfc2=new JFileChooser();
	jfc2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	
	}
	public void trans_fun(String fname,String dname){
		try{
			copy(fname,dname);
		}
		catch(Exception e){}
	}
	static void copy(String s,String d)throws Exception
	{
		File sf = new File(s);
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		byte[]buf = new byte[rate];
		
		if (sf.isFile())   //for life
		{
			in = new FileInputStream(s);
			out = new FileOutputStream(d);
			while(((len=in.read(buf))>0))
			{
				out.write(buf,0,len);
				
			}
		}
		else
		{
			String list_of_file[]=sf.list();
			
			File df = new File(d);
			df.mkdir();
			
			for(int k=0;k<list_of_file.length;k++ )
			{
				File isf = new File(s+"\\"+list_of_file[k]);
				
				if(isf.isFile())
					copy(s+"\\"+list_of_file[k],d+"\\"+list_of_file[k]);
				else
					copy(s+"\\"+list_of_file[k],d+"\\"+list_of_file[k]);
				{
			}
			}
		}
	}
	public static void main(String[] args) throws Exception{
		new file_transfer();
		
	}

	public void actionPerformed(ActionEvent e){
		Object z=e.getSource();
		int result1=0,result2=0;
		if(z==brsource){
			result1 = jfc1.showOpenDialog(this);
		}
		if(z==dtsource){
			result2 = jfc2.showOpenDialog(this);
		}
		if(result1==0 && result2==0){
			File f1=jfc1.getSelectedFile();
			s1=f1.getAbsolutePath();
			System.out.println(" Path open "+s1);
			sft.setText(s1);
			
			File f2=jfc2.getSelectedFile();
			s2=f2.getAbsolutePath();
			dft.setText(s2);
			System.out.println(" Destination path "+s2);
			bcp.setVisible(true);
			bcp.enable();
		}
		if(z==bcp){
			trans_fun(s1,s2);
			System.out.println("Copied Succesfully ");
		}
		
	}

}
