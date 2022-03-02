import java.util.*;
public class Star_num_pattern_equal_to_num {
    public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int n=sc.nextInt();
		int r=0;
		if(n%2==0){
			r=((n/2)*n)+1;
		}
		else
			r=(((n+1)/2)*(n))+1;
		int id=2,q=1;
		for(int i=1;i<=n;i++){
				if((id%2)==0){
				     for(int j=0;j<n;j++){
						System.out.print(q);
						q++;
						if(j!=n-1)
							System.out.print("*");
						else
							System.out.print("\n");
						
					}
				     //System.out.println("Straced_End_of")
				     id++;
				     //System.out.println("Straced_End_of_first_for_value_of q="+q);
				}
				else{
					//System.out.print("Start-of_Second_for");
					for(int k=0;k<n;k++){
						//System.out.print("In_of_Second_for");
						System.out.print(r);
						r++;
						
						if(k!=n-1){
							System.out.print("*");
							//System.out.println("Straced_if_k!=q+2*n");
						}
						else{
							//System.out.println("Straced_second_else");
							System.out.print("\n");
						}
					}
					//System.out.println("At_the_end_of-second_for
					id++;
	
			}
		}
     }
}


