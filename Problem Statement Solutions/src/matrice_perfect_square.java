/*Consider a m*n matrix inmatrix containing non zero positive numbers and a non zero positive number innum where innum is 
  bet 1 and n,m identify and print outarr based on the logic given below
  for full question reffer to javaintern whatsapp grp 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class matrice_perfect_square {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello");
		int r=sc.nextInt();
		sc.nextLine();
		int c=r;
	    int mat[][]=new int[r][c];
	    String s[]=new String[r];
        for(int a=0;a<3;a++){
        	s[a]=sc.nextLine();
        }
        for(int x=0;x<3;x++){
        String num[]=new String[3];
        num=s[x].split(",");
        for(int m=x;m<x+1;m++){
        	for(int n=0;n<r;n++){
        		mat[m][n]=Integer.parseInt(num[n]);
        	}
        }
        }
        /*for(int g=0;g<r;g++){
        	for(int h=0;h<r;h++){
        		System.out.println(mat[g][h]);
        	}
        }*/
  
        int sub=sc.nextInt();
        ArrayList<Integer> square=new ArrayList<Integer>();
        ArrayList<Integer> nsquare=new ArrayList<Integer>();
        int index1=0,index2=0;
        for(int b=0;b<r-1;b++){
        	    int p=b+sub;
        	    int q=r-(sub-1);
        	    int f=sub,add=1;
        	    for(int d=0;d<q;d++){
                for(int i=b;i<p;i++){
    	              for(int j=d;j<f;j++){
    		                 //System.out.println(mat[i][j]);
    		                 add=add*mat[i][j];
    		                 //System.out.println("_______add in loop_______"+add);
    	                                  }
                                    }
        	                f++;
        	                double sqrt=Math.sqrt(add);
        	                //System.out.println("_______add outside loop_______"+add);
        	                if((sqrt-Math.floor(sqrt))==0){
        	                	square.add(add);
        	                	add=1;
        	                }
        	                else{
        	                	nsquare.add(add);
        	                	add=1;
        	                }
        	                //System.out.println("_________________");
        	                }
                    } 
        int arr1[]=new int[square.size()];
        int arr2[]=new int[nsquare.size()];
        for(int a1=0;a1<square.size();a1++){
        	arr1[a1]=square.get(a1);
        }
        //System.out.println("_______square.get(0)____square.get(2)_____"+square.get(0)+"**"+square.get(1));
        //System.out.println("_______nsquare.get(0)____nsquare.get(2)_____"+nsquare.get(0)+"**"+nsquare.get(1));
        for(int a2=0;a2<square.size();a2++){
        	arr2[a2]=nsquare.get(a2);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //System.out.println("_______arr1[0]____arr1[1]_____"+arr1[0]+"**"+arr1[1]);
        //System.out.println("_______arr2[0]____arr2[1]_____"+arr2[0]+"**"+arr2[1]);
        int outarr[]=new int[(r-(sub-1))*(r-(sub-1))];
        for(int a2=0;a2<arr1.length;a2++){
        	outarr[a2]=arr1[a2];
        }
        int temp=outarr.length-arr2.length;
        for(int a3=arr2.length-1;a3>=0;a3--){
        	outarr[temp]=arr2[a3];
        	temp++;
        }
        //System.out.println("_______arr1.length_____"+arr1.length);
        //System.out.println("_______arr2.length_____"+arr2.length);
        for(int a4=0;a4<outarr.length;a4++){
        	System.out.print(outarr[a4]+",");
        }
        }

}

