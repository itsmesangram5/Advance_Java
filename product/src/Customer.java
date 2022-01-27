import java.util.Scanner;


public class Customer extends Basic {
	int id,total;
	String mob,name;

	public void get()
	{
		super.get();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer id");
		this.id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		this.name=sc.nextLine();
		System.out.println("Enter MObile Number");
		mob=sc.nextLine();
		System.out.println("Enter Quantity");
		total=sc.nextInt();
	}
	public void show(){
		super.show();
		System.out.println(" Customer ID "+this.id);
		System.out.println(" Name "+this.name);
		System.out.println(" Mobile Number "+mob);
		System.out.println(" Total Price "+calculate());
	}
	public int calculate(){
		return total*(super.price);
	}
	

}
