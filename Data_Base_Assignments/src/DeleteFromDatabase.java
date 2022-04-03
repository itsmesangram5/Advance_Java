import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

//import com.mysql.jdbc.Connection;  Dont Use this // it will generate Error


public class DeleteFromDatabase {
	public static void main(String[] args) {
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

}
