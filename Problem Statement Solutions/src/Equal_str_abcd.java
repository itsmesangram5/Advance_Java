import java.util.*;
public class Equal_str_abcd {
	  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int cnt_a=0,cnt_b=0,cnt_c=0,cnt_d=0 ;
      int N=sc.nextInt();
      int max=N/4;
      StringBuffer s=new StringBuffer(N);{
      String str=s.toString();
      sc.nextLine();
      //System.out.println("Enter the string ");
      str=sc.nextLine();
      s.append(str);
      for(int i=0;i<s.length();i++){
    	  if(s.charAt(i)=='a')
    		  cnt_a++;
    	  else if(s.charAt(i)=='b')
    		  cnt_b++;
    	  else if(s.charAt(i)=='c')
    		  cnt_c++;
    	  else
    		  cnt_d++;
      }
      for(int j=0;j<s.length();j++){
          System.out.println("Traced 1st for " +" "+cnt_a+""+cnt_b+""+cnt_c+" "+cnt_d );
    	  char temp=s.charAt(j);
    	  int count=0;
    	  if(temp=='a')
    		  count=cnt_a;
    	  else if(temp=='b')
    		  count=cnt_b;
    	  else if(temp=='c')
    		  count=cnt_c;
    	  else
    		  count=cnt_d;
      if(cnt_a<max || cnt_b<max||cnt_c<max || cnt_d<max){
    	  if(count>max){
                  System.out.println("Traced While " +" "+cnt_a+""+cnt_b+""+cnt_c+" "+cnt_d );
    		  if(cnt_a<max){
    			  s.setCharAt(j, 'a');
    			  cnt_a++;}
    		  else if(cnt_b<max){
    			  s.setCharAt(j, 'b');
    			  cnt_b++;}
    		  else if(cnt_c<max){
    			  s.setCharAt(j, 'c');
    			  cnt_c++;}
    		  else if(cnt_d<max){
    			  s.setCharAt(j, 'd');
    			  cnt_d++;}
                  count--;
                  System.out.println("Count is "+count+" "+cnt_a+""+cnt_b+""+cnt_c+" "+cnt_d );
    	  }
    		  
    	  
      }
      }
     System.out.println(s.toString()); 
}    
}
}
