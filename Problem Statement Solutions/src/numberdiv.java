//Write a program to print first n number divided completly by its sum of digits 
import java.util.*;
public class numberdiv {
	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total Number of Digits ");
		int total=sc.nextInt();
		for(int No=0;total>0;No++){
			int add=0,temp=No;
			while(No>0){
				int digit=No%10;
				add=add+digit;
				No=No/10;
			}
			if(temp%add==0){
				System.out.println(" Num "+temp);
				total--;
			}
			No=temp;
		}
		

	}

}
