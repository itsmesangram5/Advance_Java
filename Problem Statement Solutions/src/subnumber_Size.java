//Write a program to to take number from user take input of size of subnumber and print max subnumbers its sum
//of its digits
import java.util.*;
public class subnumber_Size {

	public static void main(String[] args) {
	   Scanner a=new Scanner(System.in);
	   System.out.println("Enter the Number ");
	   String s=a.nextLine();
	   System.out.println("Enter the size of Subnumber ");
	   int sub=a.nextInt();
	   char n[]=s.toCharArray();
	   Arrays.sort(n);
	   StringBuffer b=new StringBuffer();
	   for(int i=n.length-1;i>=(n.length-sub);i--){
		   b.append(n[i]);
	   }
	   String m=b.toString();
	   int z=Integer.parseInt(m);
	   int add=0;
	   while(z>0){
		   int digit=z%10;
		   add=add+digit;
		   z=z/10;  
	   }
	   System.out.println("Sum of Digits of subnumber "+add);
	   ///////Second Logic but having some Errors
	   /*int sum=0,num=Integer.parseInt(s),size=s.length();
	     int my[]=new int();
	     for(int k=0;num>0;k++){
		   int t=num%10;
		   my[k]=t;
		   num=num/10;
		   
	   }
	   for(int i=n.length-1;i>=(n.length-sub);i--){
		   sum=sum+(int)n[i];
	   }
	   System.out.println("Sum of Digits of subnumber By Second Logic "+sum);*/
	}

}
