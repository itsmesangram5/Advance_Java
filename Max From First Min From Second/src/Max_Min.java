import java.util.*;
public class Max_Min {
        public static void main(String args[]){
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter Two Numbers ");
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	String a1=a+"";
        	String b1=b+"";
        	char ar[]=a1.toCharArray();
        	char br[]=b1.toCharArray();
        	Arrays.sort(ar);
        	Arrays.sort(br);
        	a1=ar[ar.length-1]+"";
        	b1=br[0]+"";
        	int ans=Integer.parseInt(a1+b1);
        	System.out.print(ans);
        	//System.out.print(ar[ar.length-1]);
        	//System.out.println(br[0]);
        	}
 }

