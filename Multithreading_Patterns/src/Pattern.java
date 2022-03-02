import java.util.*;
class Pattern
{
     public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int id=Integer.parseInt(args[1]);

        Scanner sc=new Scanner(System.in);

		for(int i=1;i<=a;i++)
		{
		   	for(int j=a;j>=i;j--)
		  		System.out.print(" ");

		    for(int k=1;k<=i;k++)
		    {
				if(id==1)
  				   System.out.print(" "+"*");
	         	if(id==2)
  				   System.out.print(" "+k);
  		  	    if(id==3)
  				   System.out.print(" "+i);
	         }
	         System.out.print(" \n");
	 	}
	 	sc.nextInt();
	}
}






