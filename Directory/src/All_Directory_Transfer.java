import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class All_Directory_Transfer {
	static int rate=15000,len;
    
	public static void main(String args[])
	{
		String fname,dname;
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter source path");
			fname = in.readLine();
			
			System.out.println("Enter Destination path");
			dname = in.readLine();
			
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
}
		
		
	
	


