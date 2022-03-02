import java.util.*;
public class atm_notes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Boolean t=true;
		int x=0;
		atm z = new atm();
		z.set_notes();
		z.display_notes();
		while(t){
		System.out.println("Enter the amount ");
		x=sc.nextInt();
		if(!(x%100==0)){
			System.out.println("Please Enter a valid amount!! i.e In Multiples of 100");           
		}
		t=false;
		}
		z.note_count(x);
		z.change();
		z.display_notes();
		
	}
}
class atm{
	int t_a=0,t_b=0,t_c=0,t_d=0;
	
	 void note_count(int z){
		int a=2000,b=500,c=200,d=100;
		int cnt_a=0,cnt_b=0,cnt_c=0,cnt_d=0,l;
		int rem1=z,rem2=z,rem3=z,rem4=z;
		if(t_a>0){
		cnt_a=z/a;
		   if(cnt_a>t_a){
			   l=cnt_a-t_a;
			   z=z+l*a;
			   cnt_a=t_a;
			   rem1=z%a+l*a;
			   l=0;
		   }
		   else
			   rem1=z%a;
		}
		if(t_b>0){
		cnt_b=rem1/b;
		    if(cnt_b>t_b){
			   l=cnt_b-t_b;
			   cnt_b=t_b;
			   rem2=rem1%b+l*b;
			   l=0;
			   }
			else
				rem2=rem1%b;
			}
		if(t_c>0){
		cnt_c=rem2/c;
		   if(cnt_c>t_c){
			   l=cnt_c-t_c;
			   rem3=rem2%c+l*c;
			   l=0;
			   }
			else
				rem3=rem2%b;
			}
		if(t_d>0){
		cnt_d=rem3/d;
		   if(cnt_d>t_d){
			   l=cnt_d-t_d;
			   cnt_d=t_d;
			   rem4=rem3%d+l*d;
		   }
		}
		if(rem4>0){
			System.out.println(" Cash Note Available_Please try for another Amount ");
		}
		else{
		System.out.println(" The Entered Amount Consist of Following Notes \n"+" 2000 *"+cnt_a+"\n"+" 500 *"+cnt_b);
		System.out.println(" 200 *"+cnt_c+"\n"+" 100 *"+cnt_d);
		t_a=t_a-cnt_a;
		t_b=t_b-cnt_a;
		t_c=t_c-cnt_a;
		t_d=t_d-cnt_a;
		}
	}
     void change(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Which change you want__2000_500_200 ");
    	int ch=sc.nextInt();
    	note_count(ch);
    	if(ch==2000)
    		t_a=t_a+1;
    	if(ch==500)
    		t_b=t_b+1;
    	if(ch==200)
    		t_c=t_c+1;
    }
     void set_notes(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of notes of 2000 ");
    	t_a=sc.nextInt();
    	System.out.println("Enter the number of notes of 500 ");
    	t_b=sc.nextInt();
    	System.out.println("Enter the number of notes of 200 ");
    	t_c=sc.nextInt();
    	System.out.println("Enter the number of notes of 100 ");
    	t_d=sc.nextInt();
    }
    void display_notes(){
    	System.out.println(" Availabel Notes \n"+" 2000 - "+t_a+"\n"+" 500 - "+t_b);
		System.out.println(" 200 - "+t_c+"\n"+" 100 - "+t_d);
    }
	}
    

