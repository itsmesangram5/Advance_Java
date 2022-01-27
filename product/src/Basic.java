import java.util.*;
abstract public class Basic implements Common {
	  int id , price;
	  String name;
	  public void get(){
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Product ID ");
		  this.id=sc.nextInt();
		  sc.nextLine();
		  System.out.println("Enter Product Name");
		  this.name=sc.nextLine();
		  System.out.println("Enter Product Price ");
		  this.price=sc.nextInt();
	  }
	  public void show(){
		  System.out.println(" Product ID "+this.id);
		  System.out.println(" Product Name "+this.name);
		  System.out.println(" Product Price "+this.price);
	  }
	  
	  
	  

}
