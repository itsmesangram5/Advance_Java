import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class JFile_Choose_Demo {
	public static void main(String[] args) {
		new JFile_Choose_Demo();
	}
	public JFile_Choose_Demo(){
		JFrame f=new JFrame();
		JFileChooser jfc=new JFileChooser();
		int result = jfc.showOpenDialog(f);
		//int result = jfc.showSaveDialog(f);
		System.out.println(" Value "+result);
		if(result==0){
			File f1=jfc.getSelectedFile();
			System.out.println("Selected file "+f1.getAbsolutePath());
		}
		}

}
