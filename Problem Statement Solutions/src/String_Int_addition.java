import java.util.*;
public class String_Int_addition {
	public static void main(String[] args) {
		
		String a=new String();
		String b=new String();
		a="123";
		b="10";
		int z=1;
		int suma=0;
		int sumb=0;
		for(int i=a.length()-1;i>=0;i--){
			char d=a.charAt(i);
			int m=Character.getNumericValue(d)*z;
			z=z*10;
			suma=suma+m;
		}
		z=1;
		for(int i=b.length()-1;i>=0;i--){
			char d=b.charAt(i);
			int m=Character.getNumericValue(d)*z;
			z=z*10;
			sumb=sumb+m;
		}
		int sum=suma+sumb;	
		System.out.println(sum);
	}

}
