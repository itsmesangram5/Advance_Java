import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class UpdateDatabaseRecords {
		public static void main(String args[]){
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
}

