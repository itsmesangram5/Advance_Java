package password;
import java.util.*;
public class verify {
   public static void passv(String s)
   { 
	       int upper=0,lower=0,symbol=0,number=0;
	       String b=s;
	       int z=b.length();
	       if(z>=8)
	               {
	                for(int i=0;i<b.length();i++)
	                         { 
	                	      //System.out.print(" In loop "); 
	                          char q=b.charAt(i);
	                          int m=(int)q;
	                          if(m>96 && m<123){
	                             lower++;
	                             //System.out.print(" In lower"); 
	                          }
	                          else if(m>64 && m<91){
	                             upper++;
	                             //System.out.print(" In upper");
	                          }
	                          else if(m>32 && m<48 ){
	                             symbol++;
	                             //System.out.print(" In symbol");
	                          }
	                          else if(m>47 && m<58)
	                             number++;
	                          }
	               }
	       //else
	       else 
	            {
	             System.out.print(" Your password is too short !!  ___Enter again "); 
	             System.exit(1);
	            }
	        
	       if(upper<=2 && lower>=2 && symbol>=2 && number>=2 )//change this condition some problem is there
	        	System.out.print(" Your Password is so simple __please try again "); 
	        //else
	       else if(upper>=2 && lower>=2 && symbol>=2 && number>=2 )
	                System.out.print(" You Can Continue "); 
	        
	        
	           
	       
	     }
	    
   }
   
