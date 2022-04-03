import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Database_function_for_UI {
	static void insert(String zid,String zuser,String zpass){
		//String zid,String zuser,String zpass
		try
		{
			DAO db=new DAO();
			Connection conn=db.getConnection();
	
			 int id=Integer.parseInt(zid);
			 String user=zuser;
			 String pass=zpass;
			 
			 String insertQuery="insert into registration values(?,?,?)";
			 PreparedStatement preparedStatement;
			 
			 preparedStatement=conn.prepareStatement(insertQuery);
			 preparedStatement.setString(1,id+"");
			 preparedStatement.setString(2,user);
			 preparedStatement.setString(3,pass);
			 
			 preparedStatement.executeUpdate();
			 //l5.setText("Data Entered Succesfully ");
			 //l5.setForeground(Color.green);
			 
			 
			 
		}
		catch(Exception e){
			System.out.println(e);
			 //l5.setText("Exception Occur_Cant submit the data!!");
			 //l5.setForeground(Color.red);
			
		}

}

}
