import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ComboBoxActionNew implements ActionListener {
	JFrame f;
	JComboBox cb;
	JLabel label;
	ComboBoxActionNew(){
		f=new JFrame("Combo Box Example ");
		label = new JLabel();
		label.setSize(100,100);
		label.setBounds(100, 300, 150, 100);
		JButton b=new JButton("Show ");
		b.setBounds(0, 0, 0, 0);
		String languages[]={"c","c++","java","c#","PHP"};
		cb=new JComboBox(languages);
		cb.setBounds(50, 50, 100, 50);
		f.add(b);
		f.add(cb);
		f.add(label);
		f.setSize(500,500);
		f.setVisible(true);
		b.addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		//String data="Selected"+ cb.getItemAt(cb.getSelectedIndex());
		//label.setText(data);
	}
	public static void main(String args[]){
		new ComboBoxActionNew();
	}

}
