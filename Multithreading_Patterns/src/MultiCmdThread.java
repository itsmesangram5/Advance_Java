import java.util.*;

class Counter extends Thread
{
   int id=0;
   static int line=0;
   String cmd="";

   public void run()
   {
	 try
	 {
           cmd="cmd /c start  java -cp ./ Pattern "+line+" "+id;

           Runtime.getRuntime().exec(cmd);
     }
     catch(Exception e){System.out.println(e);}
   }
}

class MultiCmdThread
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Total Lines :-");
    Counter.line=sc.nextInt();

	Counter dc1 = new Counter();
	dc1.id=1;

	Counter dc2 = new Counter();
	dc2.id=2;

	Counter dc3 = new Counter();
	dc3.id=3;

	dc1.start();
	dc2.start();
	dc3.start();
  }
}










