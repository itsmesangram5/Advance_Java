import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DisplayAllRecords {
	public static void main(String[] args) {
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
