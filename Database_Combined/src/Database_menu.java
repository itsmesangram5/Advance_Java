import java.util.Scanner;

public class Database_menu{
	public static void main(String  args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("___________Menu__________");
		System.out.println("____1_Insert__________");
		System.out.println("____2_Update__________");
		System.out.println("____3_Delete__________");
		System.out.println("____4_Display__________");
		System.out.println("____5_Exit__________");
		System.out.println("Enter Your Choice ");
		int c=sc.nextInt();
		
		switch(c){
		case 1:
			Database_class.insert();
		case 2:
			Database_class.update();
		case 3:
			Database_class.delete();
		case 4:
			Database_class.display();
			
		}
	}
}
