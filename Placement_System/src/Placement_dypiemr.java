import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Placement_dypiemr extends JFrame implements ActionListener {

/*________________________________All Static Declarations____________________________*/
	
	static JFrame login,f,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
    static String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s16;
    static int a1,a2,a3,a4,a5,m=1,n=1;
    static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,  t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26
    ,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60;
    static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28 ,l29,l30,l31,
    l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,l51,l52,l53,l54,l55,l56,l57,l58,l59,l60,l61,l62;
    static JTextArea p1,p2,p3,p4,p5,p6,p7,p8,p9;
    static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29 
    ,b30,b31,b32,b33,b34,b35,b36,b37,b38;
	@SuppressWarnings("deprecation")
	static int ssn=1;
	static JComboBox a,b;
	static JRadioButton jrb1,jrb2,jrb3,jrb4,jrb5;
	static ButtonGroup G1;
	Border border1 = BorderFactory.createLineBorder(Color.white, 2);
	
	Placement_dypiemr(){
		
		
		/*________________________________All Frames One By One___________________________*/
		

		/*_____________________________Login Frame__________________________*/
		login=new JFrame();
		login.setLayout(null);
	    Container c=login.getContentPane();
	    Color cl1=new Color(241,241,241);
		c.setBackground(Color.white);
		login.setVisible(true);
		//login.setVisible(false);
		login.setBounds(0, 0,1920, 1080);
	

		Image imgs1=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_strip.jpg");
  	    ImageIcon is1=new ImageIcon(imgs1);
  	    JLabel i1=new JLabel(is1);
  	    i1.setForeground(Color.white);
  	    i1.setBounds(0,0, 1919, 176);
  	    login.add(i1);
  	    
  	    /*Image imgs2=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_lower.jpg");
	    ImageIcon is2=new ImageIcon(imgs2);
	    JLabel i2=new JLabel(is2);
	    i2.setForeground(Color.white);
	    i2.setBounds(0,656, 1919, 424);
	    login.add(i2);*/
  	    
		l12=new JLabel("Welcome to DYPIEMR Placement Cell");
		l12.setFont(l12.getFont().deriveFont(50.85632412f));
		l12.setBounds(500, 200, 1000, 60);
		login.add(l12);
		
		  Image imgs21=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c11.jpg");
          ImageIcon is21=new ImageIcon(imgs21);
        
          Image imgs22=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c12.jpg");
          ImageIcon is22=new ImageIcon(imgs22);
         
          Image imgs23=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c13.jpg");
          ImageIcon is23=new ImageIcon(imgs23);
          
          Image imgs24=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c14.jpg");
          ImageIcon is24=new ImageIcon(imgs24);
         
	
		
		b1=new JButton(is21);
		b1.setFont(b1.getFont().deriveFont(30.85632412f));
		b1.setBounds(100,400, 350,393);
		b1.enable();
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		b1.setBorder(border1);
		b1.setVisible(true);
		login.add(b1);
		
		b2=new JButton(is23);
		b2.setFont(b2.getFont().deriveFont(30.85632412f));
		b2.setBounds(1450,400, 350, 393);
		b2.enable();
		b2.addActionListener(this);
		b2.setBackground(Color.DARK_GRAY);
		b2.setForeground(Color.white);
		b2.setBorder(border1);
		b2.setVisible(true);
		login.add(b2);
		
		b3=new JButton(is22);
		b3.setFont(b3.getFont().deriveFont(30.85632412f));
		b3.setBounds(550,400, 350, 393);
		b3.enable();
		b3.addActionListener(this);
		b3.setBackground(Color.DARK_GRAY);
		b3.setForeground(Color.white);
		b3.setBorder(border1);
		b3.setVisible(true);
		login.add(b3);
		
		b4=new JButton(is24);
		b4.setFont(b4.getFont().deriveFont(30.85632412f));
		b4.setBounds(1000,400, 350, 393);
		b4.enable();
		b4.addActionListener(this);
		b4.setBackground(Color.DARK_GRAY);
		b4.setForeground(Color.white);
		b4.setBorder(border1);
		b4.setVisible(true);
		login.add(b4);
		
		/*-----------------------------------frame 1---------------------------------------*/
		
		/*_____________________________Colleage Login Frame__________________________*/
		f1=new JFrame();
		f1.setLayout(null);
	    Container c1=f1.getContentPane();
		c1.setBackground(cl1);
		//f1.setVisible(true);
		f1.setVisible(false);
		f1.setBounds(0, 0,1920, 1080);
		f1.setTitle("Colleage Login ");
		f1.add(i1);
		
		Image imgs3=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_logo.jpg");
	    ImageIcon is3=new ImageIcon(imgs3);
	    JLabel i3=new JLabel(is3);
	    i3.setForeground(Color.white);
	    i3.setBounds(390,350, 400, 400);
	    f1.add(i3);
		
		l1=new JLabel("Login to Continue");
		l1.setFont(l1.getFont().deriveFont(40.85632412f));
		l1.setBounds(800, 350, 450, 50);
		f1.add(l1);
		
		l2=new JLabel("Colleage ID");
		l2.setFont(l2.getFont().deriveFont(25.85632412f));
		l2.setBounds(800, 420, 150, 30);
		f1.add(l2);
		
		l3=new JLabel("Password");
		l3.setFont(l3.getFont().deriveFont(25.85632412f));
		l3.setBounds(800, 520, 150, 30);
		f1.add(l3);
		
		l13=new JLabel("Wrong Id or Password !");
		l13.setFont(l13.getFont().deriveFont(20.85632412f));
		l13.setBounds(1220, 570, 300, 30);
		//l13.setForeground(Color.RED);
		l13.setVisible(false);
	    f1.add(l13);
		
		Border border = BorderFactory.createLineBorder(Color.darkGray, 2);
		t1=new JTextField();
		t1.setBounds(800, 470, 350, 40);
		t1.setFont(t1.getFont().deriveFont(20.85632412f));
		t1.setVisible(true);
		t1.setBorder(border);
		f1.add(t1);
		
		t2=new JTextField();
		t2.setBounds(800,570,350,40);
		t2.setFont(t2.getFont().deriveFont(20.85632412f));
		t2.setVisible(true);
		t2.setBorder(border);
		f1.add(t2);
		
		Border border1 = BorderFactory.createLineBorder(Color.white, 2);
		b5=new JButton("Back");
		b5.setBounds(800,640,170,50);
		b5.setFont(b5.getFont().deriveFont(20.85632412f));
		b5.enable();
		b5.addActionListener(this);
		b5.setBackground(Color.DARK_GRAY);
		b5.setForeground(Color.white);
		b5.setBorder(border1);
		b5.setVisible(true);
		f1.add(b5);
		
		b6=new JButton("Login");
		b6.setBounds(1000,640,170,50);
		b6.enable();
		b6.setFont(b6.getFont().deriveFont(20.85632412f));
		b6.setBackground(Color.DARK_GRAY);
		b6.setForeground(Color.white);
		b6.addActionListener(this);
		b6.setBorder(border1);
		b6.setVisible(true);
		f1.add(b6);
	
/*-----------------------------------frame 2--------------------------------------*/
		
		/*_____________________________Company Login Frame__________________________*/
		f2=new JFrame();
		f2.setLayout(null);
	    Container c2=f2.getContentPane();
		c2.setBackground(cl1);
		//f2.setVisible(true);
		f2.setVisible(false);
		f2.setBounds(0, 0,1920, 1080);
		f2.setTitle("Company Login ");
		f2.add(i1);
		f2.add(i3);
		
		l4=new JLabel("Login To Continue");
		l4.setFont(l4.getFont().deriveFont(40.85632412f));
		l4.setBounds(800, 350, 450, 50);
		f2.add(l4);
		
		l5=new JLabel("Company ID");
		l5.setFont(l5.getFont().deriveFont(25.85632412f));
		l5.setBounds(800, 420, 250, 30);
		f2.add(l5);
		
		l6=new JLabel("Password");
		l6.setFont(l6.getFont().deriveFont(25.85632412f));
		l6.setBounds(800, 520, 150, 30);
		f2.add(l6);
		
		l14=new JLabel("Wrong Id or Password !");
		l14.setFont(l14.getFont().deriveFont(20.85632412f));
		l14.setBounds(1180, 570, 300, 30);
		l14.setForeground(Color.RED);
		l14.setVisible(false);
	    f2.add(l14);
		
		t3=new JTextField();
		t3.setBounds(800, 470, 350, 40);
		t3.setFont(t3.getFont().deriveFont(20.85632412f));
		t3.setVisible(true);
		t3.setBorder(border);
		f2.add(t3);
		
		t4=new JTextField();
		t4.setBounds(800,570,350,40);
		t4.setFont(t4.getFont().deriveFont(20.85632412f));
		t4.setVisible(true);
		t4.setBorder(border);
		f2.add(t4);
		
		b7=new JButton("Back");
		b7.setBounds(800,640,170,50);
		b7.setFont(b7.getFont().deriveFont(20.85632412f));
		b7.enable();
		b7.addActionListener(this);
		b7.setBackground(Color.GRAY);
		b7.setForeground(Color.white);
		b7.setBorder(border1);
		b7.setVisible(true);
		f2.add(b7);
		
		b8=new JButton("Login");
		b8.setBounds(1000,640,170,50);
		b8.enable();
		b8.setFont(b8.getFont().deriveFont(20.85632412f));
		b8.setBackground(Color.DARK_GRAY);
		b8.setForeground(Color.white);
		b8.addActionListener(this);
		b8.setBorder(border1);
		b8.setVisible(true);
		f2.add(b8);
		
		l7=new JLabel("Dont have an account ? Click here to ");
		l7.setFont(l6.getFont().deriveFont(20.85632412f));
		l7.setBounds(800, 710, 450, 40);
		f2.add(l7);
		
		Border border2 = BorderFactory.createLineBorder(cl1, 2);
		b9=new JButton("Register");
		b9.setBounds(1172,714,120,30);
		b9.enable();
		b9.setFont(b9.getFont().deriveFont(20.85632412f));
		b9.setBackground(cl1);
		b9.setForeground(Color.blue);
		b9.setBorder(border2);
		b9.addActionListener(this);
		b9.setVisible(true);
		f2.add(b9);
/*-----------------------------------frame 3-------------------------------------*/
		
		/*_____________________________Student Login Frame__________________________*/
		f3=new JFrame();
		f3.setLayout(null);
	    Container c3=f3.getContentPane();
		c3.setBackground(cl1);
		//f3.setVisible(true);
		f3.setVisible(false);
		f3.setBounds(0, 0,1920, 1080);
		f3.setTitle("Student Login ");
		f3.add(i1);
		f3.add(i3);
		
		l8=new JLabel("Login To Continue");
		l8.setFont(l8.getFont().deriveFont(40.85632412f));
		l8.setBounds(800, 350, 450, 50);
		f3.add(l8);
		
		l9=new JLabel("Student ID ");
		l9.setFont(l9.getFont().deriveFont(25.85632412f));
		l9.setBounds(800, 420, 250, 30);
		f3.add(l9);
		
		l10=new JLabel("Password");
		l10.setFont(l10.getFont().deriveFont(25.85632412f));
		l10.setBounds(800, 520, 150, 30);
		f3.add(l10);
		
		l15=new JLabel("Wrong Id or Password !");
		l15.setFont(l14.getFont().deriveFont(20.85632412f));
		l15.setBounds(1180, 570, 300, 30);
		l15.setForeground(Color.RED);
		l15.setVisible(false);
	    f3.add(l15);
		
		t5=new JTextField();
		t5.setBounds(800, 470, 350, 40);
		t5.setFont(t5.getFont().deriveFont(15.85632412f));
		t5.setVisible(true);
		t5.setBorder(border);
		f3.add(t5);
		
		t6=new JTextField();
		t6.setBounds(800, 570, 350, 40);
		t6.setFont(t6.getFont().deriveFont(15.85632412f));
		t6.setVisible(true);
		t6.setBorder(border);
		f3.add(t6);
		
		b10=new JButton("Back");
		b10.setBounds(800,640,170,50);
		b10.setFont(b10.getFont().deriveFont(15.85632412f));
		b10.enable();
		b10.addActionListener(this);
		b10.setBackground(Color.GRAY);
		b10.setForeground(Color.white);
		b10.setBorder(border1);
		b10.setVisible(true);
		f3.add(b10);
		
		b11=new JButton("Login");
		b11.setBounds(1000,640,170,50);
		b11.enable();
		b11.setFont(b11.getFont().deriveFont(15.85632412f));
		b11.setBackground(Color.DARK_GRAY);
		b11.setForeground(Color.white);
		b11.addActionListener(this);
		b11.setBorder(border1);
		b11.setVisible(true);
		f3.add(b11);
		
		l11=new JLabel("Dont have an account ? Click here to ");
		l11.setFont(l11.getFont().deriveFont(20.85632412f));
		l11.setBounds(800, 710, 450, 40);
		f3.add(l11);
		
		b12=new JButton("Register");
		b12.setBounds(1172,714,120,30);
		b12.enable();
		b12.setFont(b12.getFont().deriveFont(20.85632412f));
		b12.setBackground(cl1);
		b12.setForeground(Color.blue);
		b12.addActionListener(this);
		b12.setBorder(border2);
		b12.setVisible(true);
		f3.add(b12);
		
/*-----------------------------------frame 4-------------------------------------*/
		
		/*_____________________________Student Registration__________________________*/
		
		Image imgs4=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\login_strip2.jpg");
  	    ImageIcon is4=new ImageIcon(imgs4);
  	    JLabel i4=new JLabel(is4);
  	    i4.setForeground(Color.white);
  	    i4.setBounds(0,0, 1919, 64);
   
		f4=new JFrame();
		f4.setLayout(null);
	    Container c4=f4.getContentPane();
		c4.setBackground(cl1);
		//f4.setVisible(true);
		f4.setVisible(false);
		f4.setBounds(0, 0,1920, 1080);
		f4.setTitle("Colleage Login ");
		f4.add(i4);
		
		l16=new JLabel("Student Registration");
		l16.setFont(l16.getFont().deriveFont(40.85632412f));
		l16.setBounds(200, 100, 450, 50);
		f4.add(l16);
		
		l17=new JLabel("Roll Number");
		l17.setFont(l17.getFont().deriveFont(24.85632412f));
		l17.setForeground(Color.GRAY);
		l17.setBounds(200, 200, 250, 30);
		f4.add(l17);
		
		Border border3 = BorderFactory.createLineBorder(Color.gray, 2);
		t7=new JTextField();
		t7.setBounds(200, 240, 150, 33);
		t7.setText("    ");
		t7.setFont(t7.getFont().deriveFont(18.85632412f));
		t7.setVisible(true);
		t7.setBorder(border3);
		f4.add(t7);
         
		l18=new JLabel("Surname");
		l18.setFont(l18.getFont().deriveFont(24.85632412f));
		l18.setForeground(Color.GRAY);
		l18.setBounds(200, 280, 250, 30);
		f4.add(l18);
		
		t8=new JTextField();
		t8.setBounds(200, 320, 220, 33);
		t8.setText("    ");
		t8.setFont(t8.getFont().deriveFont(18.85632412f));
		t8.setVisible(true);
		t8.setBorder(border3);
		f4.add(t8);
		
		l19=new JLabel("Name");
		l19.setFont(l19.getFont().deriveFont(24.85632412f));
		l19.setForeground(Color.gray);
		l19.setBounds(450, 280, 250, 30);
		f4.add(l19);
		
		t9=new JTextField();
		t9.setBounds(450, 320, 220, 33);
		t9.setText("    ");
		t9.setFont(t9.getFont().deriveFont(18.85632412f));
		t9.setVisible(true);
		t9.setBorder(border3);
		f4.add(t9);
		
		l20=new JLabel("Branch");
		l20.setFont(l20.getFont().deriveFont(24.85632412f));
		l20.setForeground(Color.gray);
		l20.setBounds(700, 280, 250, 30);
		f4.add(l20);
		
		t11=new JTextField();
		t11.setBounds(700, 320, 220, 33);
		t11.setText("    ");
		t11.setFont(t11.getFont().deriveFont(18.85632412f));
		t11.setVisible(true);
		t11.setBorder(border3);
		f4.add(t11);
		
		l21=new JLabel("Mobile Number ");
		l21.setFont(l21.getFont().deriveFont(24.85632412f));
		l21.setForeground(Color.gray);
		l21.setBounds(200, 360, 250, 30);
		f4.add(l21);
		
		t12=new JTextField();
		t12.setBounds(200, 400, 200, 33);
		t12.setFont(t12.getFont().deriveFont(18.85632412f));
		t12.setVisible(true);
		t12.setBorder(border3);
		f4.add(t12);
		
		l22=new JLabel("Mail ID ");
		l22.setFont(l22.getFont().deriveFont(24.85632412f));
		l22.setForeground(Color.gray);
		l22.setBounds(200, 450, 250, 30);
		f4.add(l22);
		
		t13=new JTextField();
		t13.setBounds(200, 490, 300, 33);
		t13.setText("    ");
		t13.setFont(t13.getFont().deriveFont(18.85632412f));
		t13.setVisible(true);
		t13.setBorder(border3);
		f4.add(t13);
		
		l23=new JLabel("10th Marks ");
		l23.setFont(l23.getFont().deriveFont(24.85632412f));
		l23.setForeground(Color.gray);
		l23.setBounds(200, 540, 150, 30);
		f4.add(l23);
		
		t14=new JTextField();
		t14.setBounds(200, 580, 100, 33);
		t14.setText("    ");
		t14.setFont(t14.getFont().deriveFont(18.85632412f));
		t14.setVisible(true);
		t14.setBorder(border3);
		f4.add(t14);
		
		l24=new JLabel("12th Marks ");
		l24.setFont(l24.getFont().deriveFont(24.85632412f));
		l24.setForeground(Color.gray);
		l24.setBounds(360, 540, 150, 30);
		f4.add(l24);
		
		t15=new JTextField();
		t15.setBounds(360, 580, 100, 33);
		t15.setText("    ");
		t15.setFont(t15.getFont().deriveFont(18.85632412f));
		t15.setVisible(true);
		t15.setBorder(border3);
		f4.add(t15);
		
		l25=new JLabel("1st Year");
		l25.setFont(l25.getFont().deriveFont(24.85632412f));
		l25.setForeground(Color.gray);
		l25.setBounds(200, 630, 200, 30);
		f4.add(l25);
		
		t16=new JTextField();
		t16.setBounds(200, 670, 100, 33);
		t16.setText("    ");
		t16.setFont(t14.getFont().deriveFont(18.85632412f));
		t16.setVisible(true);
		t16.setBorder(border3);
		f4.add(t16);
		
		l26=new JLabel("2nd Year");
		l26.setFont(l26.getFont().deriveFont(24.85632412f));
		l26.setForeground(Color.gray);
		l26.setBounds(360, 630, 200, 30);
		f4.add(l26);
		
		t17=new JTextField();
		t17.setBounds(360, 670, 100, 33);
		t17.setText("    ");
		t17.setBackground(Color.white);
		t17.setFont(t17.getFont().deriveFont(18.85632412f));
		t17.setVisible(true);
		t17.setBorder(border3);
		f4.add(t17);
		
		l27=new JLabel("3rd Year");
		l27.setFont(l27.getFont().deriveFont(24.85632412f));
		l27.setForeground(Color.gray);
		l27.setBounds(510, 630, 200, 30);
		f4.add(l27);
		
		t18=new JTextField();
		t18.setBounds(510, 670, 100, 33);
		t18.setText("    ");
		t18.setFont(t15.getFont().deriveFont(18.85632412f));
		t18.setVisible(true);
		t18.setBorder(border3);
		f4.add(t18);
		
		l28=new JLabel("Please choose your current status ");
		l28.setFont(l28.getFont().deriveFont(24.85632412f));
		l28.setForeground(Color.gray);
		l28.setBounds(200, 730, 450, 30);
		f4.add(l28);
		
		jrb1= new JRadioButton();
		jrb1.setText("I Want Placement ");
		jrb1.setFont(jrb1.getFont().deriveFont(20.85632412f));
		jrb1.setForeground(Color.gray);
		jrb1.setBounds(200,770,300,30);
		jrb1.addActionListener(this);
		f4.add(jrb1);
		
		jrb2= new JRadioButton();
		jrb2.setText("I am already Placed ");
		jrb2.setFont(jrb1.getFont().deriveFont(20.85632412f));
		jrb2.setForeground(Color.gray);
		jrb2.setBounds(200,810,300,30);
		jrb2.addActionListener(this);
		f4.add(jrb2);
		
		jrb3= new JRadioButton();
		jrb3.setText("I want to do Higher studies ");
		jrb3.setFont(jrb3.getFont().deriveFont(20.85632412f));
		jrb3.setForeground(Color.gray);
		jrb3.setBounds(200,850,300,30);
		jrb3.addActionListener(this);
		f4.add(jrb3);
		
		G1 = new ButtonGroup();
		G1.add(jrb1);
		G1.add(jrb2);
		G1.add(jrb3);
		//f4.add(G1);
		
		l47=new JLabel("Enter Company Name You Have Placed ");
		l47.setFont(l47.getFont().deriveFont(21.85632412f));
		l47.setForeground(Color.gray);
		l47.setBounds(700, 730, 450, 30);
		f4.add(l47);
		
		t31=new JTextField();
		t31.setBounds(700, 770, 200, 33);
		t31.setText("    ");
		t31.setFont(t31.getFont().deriveFont(17.85632412f));
		t31.setVisible(true);
		t31.setBorder(border3);
		f4.add(t31);
		
		l48=new JLabel("Enter package Offered in LPA");
		l48.setFont(l48.getFont().deriveFont(21.85632412f));
		l48.setForeground(Color.gray);
		l48.setBounds(700, 810, 450, 30);
		f4.add(l48);
		
		t32=new JTextField();
		t32.setBounds(700, 850, 100, 33);
		t32.setText("    ");
		t32.setFont(t32.getFont().deriveFont(17.85632412f));
		t32.setVisible(true);
		t32.setBorder(border3);
		f4.add(t32);
		
		b13=new JButton("Register");
		b13.setBounds(200,930,150,40);
		b13.enable();
		b13.setFont(b13.getFont().deriveFont(20.85632412f));
		b13.setBackground(Color.gray);
		b13.setForeground(Color.white);
		b13.addActionListener(this);
		b13.setBorder(border1);
		b13.setVisible(true);
		f4.add(b13);
		  
		b14=new JButton("Back");
		b14.setBounds(380,930,150,40);
		b14.enable();
		b14.setFont(b14.getFont().deriveFont(20.85632412f));
		b14.setBackground(Color.gray);
		b14.setForeground(Color.white);
		b14.addActionListener(this);
		b14.setBorder(border1);
		b14.setVisible(true);
		f4.add(b14);
		
		//-----------------------------------frame -------------------------------------/
		
		//___Company Registration From____/


    
         f5=new JFrame();
         f5.setLayout(null);
         Container c5=f5.getContentPane();
         c5.setBackground(cl1);
         //f5.setVisible(true);
         f5.setVisible(false);
         f5.setBounds(0, 0,1920, 1080);
         f5.setTitle("Company Registration ");
         f5.add(i4);

l29=new JLabel("Company Registration From");
l29.setFont(l16.getFont().deriveFont(40.85632412f));
l29.setBounds(200, 100, 600, 50);
f5.add(l29);

l30=new JLabel("Register your Company by using this form. Required fields are marked with an asterisk(*)");
l30.setFont(l30.getFont().deriveFont(20.85632412f));
l30.setForeground(Color.GRAY);
l30.setBounds(200, 160, 1800, 30);
f5.add(l30);

l31=new JLabel("_______________________________________");
l31.setFont(l31.getFont().deriveFont(24.85632412f));
l31.setForeground(Color.GRAY);
l31.setBounds(200, 170, 1800, 50);
f5.add(l31);

l32=new JLabel("Company Name*");
l32.setFont(l32.getFont().deriveFont(24.85632412f));
l32.setForeground(Color.GRAY);
l32.setBounds(200, 250, 250, 30);
f5.add(l32);

t19=new JTextField();
t19.setBounds(200, 290, 220, 30);
t19.setText("    ");
t19.setFont(t19.getFont().deriveFont(18.85632412f));
t19.setVisible(true);
t19.setBorder(border3);
f5.add(t19);

l33=new JLabel("Owner*");
l33.setFont(l33.getFont().deriveFont(24.85632412f));
l33.setForeground(Color.GRAY);
l33.setBounds(450, 250, 250, 30);
f5.add(l33);

t20=new JTextField();
t20.setBounds(450, 290, 220, 30);
t20.setText("    ");
t20.setFont(t20.getFont().deriveFont(18.85632412f));
t20.setVisible(true);
t20.setBorder(border3);
f5.add(t20);

l34=new JLabel("Company Head Branch address*");
l34.setFont(l34.getFont().deriveFont(24.85632412f));
l34.setForeground(Color.GRAY);
l34.setBounds(200, 350, 400, 30);
f5.add(l34);

l35=new JLabel("Street Address");
l35.setFont(l35.getFont().deriveFont(20.85632412f));
l35.setForeground(Color.GRAY);
l35.setBounds(200, 390, 250, 30);
f5.add(l35);

t21=new JTextField();
t21.setBounds(200, 420, 470, 30);
t21.setText("    ");
t21.setFont(t21.getFont().deriveFont(18.85632412f));
t21.setVisible(true);
t21.setBorder(border3);
f5.add(t21);

l36=new JLabel("City");
l36.setFont(l36.getFont().deriveFont(20.85632412f));
l36.setForeground(Color.GRAY);
l36.setBounds(200, 460, 250, 30);
f5.add(l36);

t22=new JTextField();
t22.setBounds(200, 490, 220, 30);
t22.setText("    ");
t22.setFont(t22.getFont().deriveFont(18.85632412f));
t22.setVisible(true);
t22.setBorder(border3);
f5.add(t22);

l37=new JLabel("State");
l37.setFont(l37.getFont().deriveFont(20.85632412f));
l37.setForeground(Color.GRAY);
l37.setBounds(450, 460, 250, 30);
f5.add(l37);

t23=new JTextField();
t23.setBounds(450, 490, 220, 30);
t23.setText("    ");
t23.setFont(t23.getFont().deriveFont(18.85632412f));
t23.setVisible(true);
t23.setBorder(border3);
f5.add(t23);

l38=new JLabel("Pin Code");
l38.setFont(l38.getFont().deriveFont(20.85632412f));
l38.setForeground(Color.GRAY);
l38.setBounds(200, 530, 250, 30);
f5.add(l38);

t24=new JTextField();
t24.setBounds(200, 560, 220, 30);
t24.setText("    ");
t24.setFont(t24.getFont().deriveFont(18.85632412f));
t24.setVisible(true);
t24.setBorder(border3);
f5.add(t24);

l39=new JLabel("Country");
l39.setFont(l39.getFont().deriveFont(20.85632412f));
l39.setForeground(Color.GRAY);
l39.setBounds(450, 530, 250, 30);
f5.add(l39);

String Contry[]={"India","China","United States","Germany","Russia","United Kingdom","Singapore","Israel","Switzerland"};
a=new JComboBox(Contry);
a.setBounds(450, 560, 220, 30);
f5.add(a);

l40=new JLabel("Email*");
l40.setFont(l40.getFont().deriveFont(20.85632412f));
l40.setForeground(Color.GRAY);
l40.setBounds(200, 610, 400, 30);
f5.add(l40);

t25=new JTextField();
t25.setBounds(200, 640, 220, 30);
t25.setText("    ");
t25.setFont(t25.getFont().deriveFont(18.85632412f));
t25.setVisible(true);
t25.setBorder(border3);
f5.add(t25);

l41=new JLabel("Phone Number*");
l41.setFont(l41.getFont().deriveFont(20.85632412f));
l41.setForeground(Color.GRAY);
l41.setBounds(450, 610, 400, 30);
f5.add(l41);

t26=new JTextField();
t26.setBounds(450, 640, 220, 30);
t26.setFont(t26.getFont().deriveFont(18.85632412f));
t26.setVisible(true);
t26.setBorder(border3);
f5.add(t26);

l42=new JLabel("Nominal Capital*");
l42.setFont(l42.getFont().deriveFont(20.85632412f));
l42.setForeground(Color.GRAY);
l42.setBounds(200, 680, 400, 30);
f5.add(l42);

t27=new JTextField();
t27.setBounds(200, 710, 220, 30);
t27.setText("    ");
t27.setFont(t27.getFont().deriveFont(18.85632412f));
t27.setVisible(true);
t27.setBorder(border3);
f5.add(t27);

l43=new JLabel("Industry*");
l43.setFont(l43.getFont().deriveFont(20.85632412f));
l43.setForeground(Color.GRAY);
l43.setBounds(450, 680, 400, 30);
f5.add(l43);

String Industry[]={"Hardware","Software","Software as a Service","Platforms","Systems Integrator", "Business Process Outsourcing", "Infrastructure", "Data Centers"};
b=new JComboBox(Industry);
b.setBounds(450, 710, 220, 30);
f5.add(b);

l44=new JLabel("Website*");
l44.setFont(l44.getFont().deriveFont(20.85632412f));
l44.setForeground(Color.GRAY);
l44.setBounds(200, 750, 400, 30);
f5.add(l44);

t28=new JTextField();
t28.setBounds(200, 780, 220, 30);
t28.setText("    ");
t28.setFont(t28.getFont().deriveFont(18.85632412f));
t28.setVisible(true);
t28.setBorder(border3);
f5.add(t28);

l45=new JLabel("Company description*");
l45.setFont(l45.getFont().deriveFont(20.85632412f));
l45.setForeground(Color.GRAY);
l45.setBounds(200, 820, 400, 30);
f5.add(l45);

t29=new JTextField();
t29.setBounds(200, 850, 470, 60);
t29.setText("    ");
t29.setFont(t29.getFont().deriveFont(18.85632412f));
t29.setVisible(true);
t29.setBorder(border3);
f5.add(t29);

b15=new JButton("Register");
b15.setBounds(200,930,150,40);
b15.enable();
b15.setFont(b15.getFont().deriveFont(20.85632412f));
b15.setBackground(Color.gray);
b15.setForeground(Color.white);
b15.addActionListener(this);
b15.setBorder(border1);
b15.setVisible(true);
f5.add(b15);
  
b16=new JButton("Back");
b16.setBounds(380,930,150,40);
b16.enable();
b16.setFont(b16.getFont().deriveFont(20.85632412f));
b16.setBackground(Color.gray);
b16.setForeground(Color.white);
b16.addActionListener(this);
b16.setBorder(border1);
b16.setVisible(true);
f5.add(b16);

/*-----------------------------------frame 6-------------------------------------*/

/*_____________________________ Student HomePage__________________________*/

     
     f6=new JFrame();
     f6.setLayout(null);
     //f6.setVisible(true);
     f6.setVisible(false);
     Container c6=f6.getContentPane();
     c6.setBackground(Color.white);
  
     f6.setBounds(0, 0,1900, 1060);
     f6.setTitle("Homepage ");
     f6.add(i4);
     
     l49=new JLabel("Home");
     l49.setFont(l49.getFont().deriveFont(60.85632412f));
     l49.setBounds(100, 40, 250, 150);
     f6.add(l49);
     
     l50=new JLabel("________________________________________________________________________________________________________________");
     //l50.setForeground(Color.GRAY);
     l50.setBounds(100, 150, 1500, 30);
     f6.add(l50);
     
     l51=new JLabel("Sangram Nangare");
     l51.setFont(l51.getFont().deriveFont(25.85632412f));
     l51.setBounds(1600, 500, 250, 30);
     f6.add(l51);
     
     l52=new JLabel("Computer Engineering");
     l52.setFont(l52.getFont().deriveFont(20.85632412f));
     l52.setForeground(Color.GRAY);
     l52.setBounds(1600, 540, 300, 30);
     f6.add(l52);
     
     b17=new JButton("Edit Profile ");
     b17.setBounds(1600,600,200,40);
     b17.enable();
     b17.setFont(b17.getFont().deriveFont(20.85632412f));
     b17.setBackground(Color.gray);
     b17.setForeground(Color.white);
     b17.addActionListener(this);
     b17.setBorder(border1);
     b17.setVisible(true);
     f6.add(b17);
     
     b18=new JButton("Logout");
     b18.setBounds(1600,660,200,40);
     b18.enable();
     b18.setFont(b18.getFont().deriveFont(20.85632412f));
     b18.setBackground(Color.gray);
     b18.setForeground(Color.white);
     b18.addActionListener(this);
     b18.setBorder(border1);
     b18.setVisible(true);
     f6.add(b18);
    
     
     Image imgs6=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c1.jpg");
     ImageIcon is6=new ImageIcon(imgs6);
   
     Image imgs7=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c2.jpg");
     ImageIcon is7=new ImageIcon(imgs7);
    
     Image imgs8=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c3.jpg");
     ImageIcon is8=new ImageIcon(imgs8);
     
     Image imgs9=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c4.jpg");
     ImageIcon is9=new ImageIcon(imgs9);
    
     Image imgs10=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c5.jpg");
     ImageIcon is10=new ImageIcon(imgs10);
    
     b19=new JButton();
     b19.setBounds(100,200, 350,393);
     b19.setIcon(is6);
     b19.setBorder(border1);
     b19.addActionListener(this);
     b19.setVisible(true);
     f6.add(b19);
     
     b20=new JButton();
     b20.setBounds(550,610, 350, 393);
     b20.setIcon(is7);
     b20.setBorder(border1);
     b20.addActionListener(this);
     b20.setVisible(true);
     f6.add(b20);
     
     b21=new JButton();
     b21.setBounds(550,200, 350, 393);
     b21.setIcon(is8);
     b21.setBorder(border1);
     b21.addActionListener(this);
     b21.setVisible(true);
     f6.add(b21);
     
     b21=new JButton();
     b21.setBounds(1000,200, 350, 393);
     b21.setIcon(is9);
     b21.setBorder(border1);
     b21.addActionListener(this);
     b21.setVisible(true);
     f6.add(b21);
     
     b22=new JButton();
     b22.setBounds(1570,230, 250,250);
     b22.setIcon(is10);
     b22.setBorder(border1);
     b22.addActionListener(this);
     b22.setVisible(true);
     f6.add(b22);

     /*-----------------------------------frame 7------------------------------------*/
     

     /*_____________________________ Company HomePage__________________________*/
     
  
          f7=new JFrame();
          f7.setLayout(null);
          //f7.setVisible(true);
          f7.setVisible(false);
          Container c7=f7.getContentPane();
          c7.setBackground(Color.white);
       
          f7.setBounds(0, 0,1900, 1060);
          f7.setTitle("Homepage ");
          f7.add(i4);
          
          l54=new JLabel("Home");
          l54.setFont(l54.getFont().deriveFont(60.85632412f));
          l54.setBounds(100, 40, 250, 150);
          f7.add(l54);
          
          l55=new JLabel("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
          l55.setForeground(Color.GRAY);
          l55.setBounds(100, 150, 1700, 30);
          f7.add(l55);
          
          l56=new JLabel("Tech Mahindra");
          l56.setFont(l56.getFont().deriveFont(25.85632412f));
          l56.setBounds(1600, 500, 250, 30);
          f7.add(l56);
          
          l57=new JLabel("IT Company");
          l57.setFont(l57.getFont().deriveFont(20.85632412f));
          l57.setForeground(Color.GRAY);
          l57.setBounds(1600, 540, 300, 30);
          f7.add(l57);
          
          b23=new JButton("Edit Info ");
          b23.setBounds(1600,600,200,40);
          b23.enable();
          b23.setFont(b23.getFont().deriveFont(20.85632412f));
          b23.setBackground(Color.gray);
          b23.setForeground(Color.white);
          b23.addActionListener(this);
          b23.setBorder(border1);
          b23.setVisible(true);
          f7.add(b23);
          
          b24=new JButton("Logout");
          b24.setBounds(1600,660,200,40);
          b24.enable();
          b24.setFont(b24.getFont().deriveFont(20.85632412f));
          b24.setBackground(Color.gray);
          b24.setForeground(Color.white);
          b24.addActionListener(this);
          b24.setBorder(border1);
          b24.setVisible(true);
          f7.add(b24);
         
          
          Image imgs11=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c7.jpg");
          ImageIcon is11=new ImageIcon(imgs11);
        
          Image imgs12=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c6.jpg");
          ImageIcon is12=new ImageIcon(imgs12);
         
          Image imgs13=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c8.jpg");
          ImageIcon is13=new ImageIcon(imgs13);
          
          Image imgs14=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c10.jpg");
          ImageIcon is14=new ImageIcon(imgs14);
         
          Image imgs15=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c5.jpg");
          ImageIcon is15=new ImageIcon(imgs15);
         
          b25=new JButton();
          b25.setBounds(100,200, 350,393);
          b25.setIcon(is11);
          b25.setBorder(border1);
          b25.addActionListener(this);
          b25.setVisible(true);
          f7.add(b25);
          
          b26=new JButton();
          b26.setBounds(550,610, 350, 393);
          b26.setIcon(is12);
          b26.setBorder(border1);
          b26.addActionListener(this);
          b26.setVisible(true);
          f7.add(b26);
          
          b27=new JButton();
          b27.setBounds(550,200, 350, 393);
          b27.setIcon(is13);
          b27.setBorder(border1);
          b27.addActionListener(this);
          b27.setVisible(true);
          f7.add(b27);
          
          b28=new JButton();
          b28.setBounds(1000,200, 350, 393);
          b28.setIcon(is14);
          b28.setBorder(border1);
          b28.addActionListener(this);
          b28.setVisible(true);
          f7.add(b28);
          
          b29=new JButton();
          b29.setBounds(1570,230, 250,250);
          b29.setIcon(is15);
          b29.setBorder(border1);
          b29.addActionListener(this);
          b29.setVisible(true);
          f7.add(b29);
          
          /*-----------------------------------frame 8------------------------------------*/

          /*_____________________________ Colleage HomePage__________________________*/

               
               f8=new JFrame();
               f8.setLayout(null);
               //f8.setVisible(true);
               f8.setVisible(false);
               Container c8=f8.getContentPane();
               c8.setBackground(Color.white);
               f8.setBounds(0, 0,1900, 1060);
               f8.setTitle("Homepage ");
               f8.add(i4);
               
               l58=new JLabel("Home");
               l58.setFont(l58.getFont().deriveFont(60.85632412f));
               l58.setBounds(120, 200, 250, 100);
               f8.add(l58);
               
               l59=new JLabel("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
               l59.setForeground(Color.GRAY);
               l59.setBounds(120, 300, 1700, 30);
               f8.add(l59);
               
               l60=new JLabel("DY Patil Colleage Of Engineering");
               l60.setFont(l60.getFont().deriveFont(35.85632412f));
               l60.setBounds(730, 110, 750, 50);
               f8.add(l60);
               
               l61=new JLabel("Akurdi Pune");
               l61.setFont(l61.getFont().deriveFont(20.85632412f));
               l61.setForeground(Color.GRAY);
               l61.setBounds(730, 150, 250, 30);
               f8.add(l61);
               
               b30=new JButton("Logout");
               b30.setBounds(1650,920,200,40);
               b30.enable();
               b30.setFont(b30.getFont().deriveFont(20.85632412f));
               b30.setBackground(Color.gray);
               b30.setForeground(Color.white);
               b30.addActionListener(this);
               b30.setBorder(border1);
               b30.setVisible(true);
               f8.add(b30);
              
               
               Image imgs16=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c7.jpg");
               ImageIcon is16=new ImageIcon(imgs16);
             
               Image imgs17=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c10.jpg");
               ImageIcon is17=new ImageIcon(imgs17);
              
               Image imgs18=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c8.jpg");
               ImageIcon is18=new ImageIcon(imgs18);
               
               Image imgs19=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\c9.jpg");
               ImageIcon is19=new ImageIcon(imgs19);
              
               Image imgs20=Toolkit.getDefaultToolkit().getImage("C:\\Users\\itsme\\OneDrive\\Documents\\Java_Advance\\Placement_System\\design_images\\dypm.jpg");
               ImageIcon is20=new ImageIcon(imgs20);
              
               b31=new JButton();
               b31.setBounds(100,400, 350,393);
               b31.setIcon(is16);
               b31.setBorder(border1);
               b31.addActionListener(this);
               b31.setVisible(true);
               f8.add(b31);
               
               b32=new JButton();
               b32.setBounds(1450,400, 350, 393);
               b32.setIcon(is17);
               b32.setBorder(border1);
               b32.addActionListener(this);
               b32.setVisible(true);
               f8.add(b32);
               
               b33=new JButton();
               b33.setBounds(550,400, 350, 393);
               b33.setIcon(is18);
               b33.setBorder(border1);
               b33.addActionListener(this);
               b33.setVisible(true);
               f8.add(b33);
               
               b34=new JButton();
               b34.setBounds(1000,400, 350, 393);
               b34.setIcon(is19);
               b34.setBorder(border1);
               b34.addActionListener(this);
               b34.setVisible(true);
               f8.add(b34);
               
               b35=new JButton();
               b35.setBounds(500,40, 200,136);
               b35.setIcon(is20);
               b35.setBorder(border1);
               b35.addActionListener(this);
               b35.setVisible(true);
               f8.add(b35);

	}
	
	public static void main(String[] args) {
		new  Placement_dypiemr();
	}

	
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o==b1){
			int val=operations.check_login(1);
			if(val==1){
				login.setVisible(false);
				int id=operations.search_ID(1);
				//String name=operations.search_by_ID(id, 1);
				//l51.setText(name);
				f6.setVisible(true);
			}
			else{
			login.setVisible(false);
			f3.setVisible(true);}
		}
		if(o==b2){
			login.setVisible(false);
		}
		if(o==b3){
			int val=operations.check_login(2);
			if(val==1){
				login.setVisible(false);
				int id=operations.search_ID(2);
				//String name=operations.search_by_ID(id, 2);
				//l56.setText(name);
				f7.setVisible(true);
			}
			else{
			login.setVisible(false);
			f2.setVisible(true);}
		}
		if(o==b4){
			int val=operations.check_login(3);
			if(val==1){
				login.setVisible(false);
				f8.setVisible(true);
			}
			else{
			login.setVisible(false);
			f1.setVisible(true);
			}
	
		}
		if(o==b5){
			login.setVisible(true);
			f1.setVisible(false);
		}
		if(o==b6){
			int val=operations.login(t1.getText(),t2.getText(),3);
			if(val==1){
			f8.setVisible(true);}
			else{
				l13.setVisible(true);
			}
		}
		if(o==b7){
			login.setVisible(true);
			f2.setVisible(false);
		}
		if(o==b8){
			int val=operations.login(t3.getText(),t4.getText(),3);
			if(val==1){
				int id=Integer.parseInt(t3.getText());
				//String name=operations.search_by_ID(id, 2);
				//l56.setText(name);
			    f7.setVisible(true);}
			else{
				l13.setVisible(true);
			}
		}
		if(o==b9){
			f2.setVisible(false);
			f5.setVisible(true);
		}
		if(o==b10){
			login.setVisible(true);
			f3.setVisible(false);
		}
		if(o==b11){
			int val=operations.login(t5.getText(),t6.getText(),3);
			if(val==1){
				int id=Integer.parseInt(t5.getText());
				//String name=operations.search_by_ID(id, 2);
				//l51.setText(name);
			    f6.setVisible(true);}
			else{
				l15.setVisible(true);
			}
		}
		if(o==b12){
			f3.setVisible(false);
			f4.setVisible(true);
	
		}
		if(o==b13){
			String selected;
			if(jrb1.isSelected()){
				selected="I Want Placement";
				
				operations.insert2(t12.getText().toString(), t7.getText(),t8.getText(), t9.getText(), t11.getText(), t12.getText(), t13.getText(), t14.getText(), t15.getText(), t16.getText(), t17.getText(), t18.getText(), selected, "", "");
				operations.insert1(t12.getText(), t12.getText()+"@Abc");
				String id=t7.getText();
				String name=operations.search_by_ID(id, 1);
				System.out.println("in b13");
				System.out.println(name);
				l51.setText(name);
				m++;
				f4.setVisible(false);
				f6.setVisible(true);
				
			}
			else if(jrb2.isSelected()){
				selected="I am already placed";
				operations.insert2(t12.getText(), t7.getText(),t8.getText(), t9.getText(), t11.getText(), t12.getText(), t13.getText(), t14.getText(), t15.getText(), t16.getText(), t17.getText(), t18.getText(), selected, t31.getText(), t32.getText());
				operations.insert1(t12.getText(), t12.getText()+"@Abc");
				String id=t7.getText();
				String name=operations.search_by_ID(id, 1);
				l51.setText(name);
				m++;
				f4.setVisible(false);
				f6.setVisible(true);
			}
			else{
				selected="I want to do Higher studies ";
				operations.insert2(t12.getText(), t7.getText(),t8.getText(), t9.getText(), t11.getText(), t12.getText(), t13.getText(), t14.getText(), t15.getText(), t16.getText(), t17.getText(), t18.getText(), selected, "", "");
				operations.insert1(t12.getText(), t12.getText()+"@Abc");
				String id=t7.getText();
				String name=operations.search_by_ID(id, 1);
				l51.setText(name);
				m++;
				f4.setVisible(false);
				f6.setVisible(true);
			}
			
		}
		if(o==b14){
			f4.setVisible(false);
			f3.setVisible(true);
		}
		if(o==b15){
			operations.insert5(t26.getText(), t19.getText(), t20.getText(), t21.getText(), t22.getText(), t23.getText(), t24.getText(), a.getItemAt(a.getSelectedIndex())+"", t25.getText(), t26.getText(), t27.getText(), b.getItemAt(b.getSelectedIndex())+"", t28.getText(), t29.getText());
			operations.insert1(t26.getText(), t26.getText()+"@Abc");
			int id=n;
			//String name=operations.search_by_ID(id, 2);
			n++;
			//l56.setText(name);
			f5.setVisible(false);
			f7.setVisible(true);
		}
		if(o==b16){
			f5.setVisible(false);
			f2.setVisible(true);
	
		}
		
	}

}
