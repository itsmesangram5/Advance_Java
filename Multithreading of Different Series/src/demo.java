
public class demo extends Thread {
          static int start , end;
          int id;
          public void run(){
        	  if(id==1)
        		  prime();
        	  else if(id==2)
        		  arm();
        	  else if(id==3)
        		  special();
          }
          public void prime(){
        	  //int div=0;
        	  //System.out.println(start+" "+end);
        	  for(int i=start;i<=end;i++){
        		  int div=0;
        		  for(int j=2;j<i;j++){
        			  if(i%j==0)
        			      div++;
        		  }
        	  if(div==0){
        		 
        		  System.out.println(" Prime = "+i);
        	            }
        	  }
          }
          public void arm(){
        	  
        	  System.out.println(start+" "+end);
        	  for(int i=start;i<=end;i++){
        		  String s=i+"";
        		  int temp=i;
        		  int sum=0;
        		  while(temp>0){
        			  int div=temp%10;
        			  sum=sum+(int)Math.pow(div,s.length());
        			  temp=temp/10;
        		  }
        		  if(sum==i){
            		  System.out.println("\t Arm = "+i);
            	            }
        	  }
            	  
        		  }
        	  public void special(){
        		 
            	  for(int i=start;i<=end;i++){
            		  int temp=i;
            		  int sum=0,prod=1;
            		  while(temp>0){
            			  int div=temp%10;
            			  sum=sum+div;
            			  prod=prod*div;
            			  temp=temp/10;
            		  }
            		  if(sum==prod){
                		  System.out.println("\t\t Special "+i);
                	            }
        	  }
        	  
        	  
          }
}
