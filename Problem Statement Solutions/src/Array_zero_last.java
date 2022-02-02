// Program to give Zeros to Last
public class Array_zero_last {
	public static void main(String[] args) {
		int a[]={1,0,2,0,3,4,0,5,0,6};
		int size=a.length;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				//a[size-1]=0;
				//size--;
				for(int j=i;j<a.length-1;j++){
					a[j]=a[j+1];
				}
				a[size-1]=0;
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}

	}

}
