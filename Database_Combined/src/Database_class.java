import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Database_class {
	static void insert(){
		try
		{
			DAO db=new DAO();
			Connection conn=db.getConnection();
			
			BufferedReader br=new BufferedReader
					(new InputStreamReader(System.in));
			 System.out.println("Enter User ID ");
			 int id=Integer.parseInt(br.readLine());
			 
			 System.out.println("Enter User Name ");
			 String user=br.readLine();
			 
			 System.out.println("Enter Password ");
			 String pass=br.readLine();
			 
			 String insertQuery="insert into registration values(?,?,?)";
			 PreparedStatement preparedStatement;
			 
			 preparedStatement=conn.prepareStatement(insertQuery);
			 preparedStatement.setString(1,id+"");
			 preparedStatement.setString(2,user);
			 preparedStatement.setString(3,pass);
			 
			 preparedStatement.executeUpdate();
			 System.out.println("Data Succesfully Inserted");
			 
			 
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		}
		static void update(){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
				
				BufferedReader br=new BufferedReader
						(new InputStreamReader(System.in));
				 System.out.println("Enter User ID To modify");
				 int id=Integer.parseInt(br.readLine());
				 
				 System.out.println("Enter New User Name");
				 String user=br.readLine();
				 
				 System.out.println("Enter  New Password ");
				 String pass=br.readLine();
				 
				 String selectQuery="update registration set user=?,pass=? where id=?";
				 PreparedStatement preparedStatement=null;
				 
				 preparedStatement=conn.prepareStatement(selectQuery);
				 preparedStatement.setString(1,user);
				 preparedStatement.setString(2,pass);
				 preparedStatement.setString(3,id+"");
				 
				 int count=preparedStatement.executeUpdate();
				 if(count==0){
					 System.out.println("No Record Found ");
				 }
				 else{
				 System.out.println("Data Succesfully Updated");
				 }
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		static void delete(){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
				
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter User ID which want to delete ");
				int id=Integer.parseInt(br.readLine());
				
				String deleteQuery="delete from registration where id=?";
				PreparedStatement preparedStatement;
				
				preparedStatement=conn.prepareStatement(deleteQuery);
				preparedStatement.setString(1, id+"");
				
				int count=preparedStatement.executeUpdate();
				
				if(count==0)
					System.out.println("No record Found With ID ");
				else
					System.out.println("Total "+count+"Record Deleted!!");
				
				
			}
			catch(Exception e){
				System.out.println(e);		
				}
		}
		static void display(){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
			
				String selectQuery="select * from registration";
				PreparedStatement preparedStatement;
				
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				
				while(result.next()){
					System.out.println("Id "+result.getString(1));
					System.out.println("Name "+result.getString(2));
					System.out.println("Password "+result.getString(3));
					System.out.println();
				}
				}
				catch(Exception e){
					System.out.println(e);
				}
		}

}
