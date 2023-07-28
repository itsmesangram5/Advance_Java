import java.sql.Connection;
import java.sql.DriverManager;

// Simple DAO File

public class DAO {
	   String username="root";

	   String password="tiger";

	   static final String DB_URL = "jdbc:mysql://localhost:3306/placement";
		                            
	   public Connection getConnection()
	   {
		 Connection conn=null;
		 try{
		 Class.forName("com.mysql.jdbc.Driver");
	    conn = DriverManager.getConnection
                (DB_URL,username,password);
	    }
	   catch (Exception e)
	   {
	     System.out.println("Unable to connect Database placement"+e);
	     
	   }
		 return conn;

	   }
}
