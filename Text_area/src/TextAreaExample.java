import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <APPLET CODE ="TextareaExampleAwt.class"
WIDTH=300 HEIGHT=200> </APPLET> */

public class TextAreaExample	extends Applet
										implements ActionListener
{
       String t;
       Button b1,b2;
       TextArea txt;

        public void init()
        {
                txt=new TextArea("Welcome to Java",10,50);

                b1=new Button("Upper Case");

                b2=new Button("Lower Case");

                add(txt);
                add(b1);
                add(b2);

                b1.addActionListener(this);
                b2.addActionListener(this);
            }
           public void actionPerformed(ActionEvent e)
           {
              String k=e.getActionCommand();

                 if(k.equals("Upper Case"))
                 {
                            t=txt.getText();
                             t=t.toUpperCase();
                             txt.setText(t);
                  }
                  else
                  if(k.equals("Lower Case"))
                  {
                            t=txt.getText();
                            t=t.toLowerCase();
                            txt.setText(t);
                   }
           }
   }



