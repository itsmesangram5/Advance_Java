import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class operations  {
	static int kis=1;
	static int insert1(String a1,String a2){
		try
		{
			DAO db=new DAO();
			Connection conn=db.getConnection();
	
			 long id=Long.parseLong(a1);
			 String pass=a2;
			 
			 String insertQuery="insert into tb1 values(?,?)";
			 PreparedStatement preparedStatement;
			 
			 preparedStatement=conn.prepareStatement(insertQuery);
			 preparedStatement.setLong(1, id);
			 preparedStatement.setString(2,pass);
			 
			 preparedStatement.executeUpdate();
			 return 1;
			 
		}
		catch(Exception e){
			 System.out.println(e);
			 return 0;
			
		}
		}
	static int insert2(String a1,String a2,String a3, String a4,String a5,String a6,String a7,String a8, String a9,String a10,String a11,String a12,String a13, String a14,String a15){
		try
		{
			DAO db=new DAO();
			Connection conn=db.getConnection();
	
			 long id=Long.parseLong(a1);
			 String roll=a2;
			 String surname=a3;
			 String name=a4;
			 String fname=a5;
			 String mobile=a6;
			 String mail=a7;
			 String ten=a8;
			 String twelth=a9;
			 String first=a10;
			 String second=a11;
			 String third=a12;
			 String status=a13;
			 String company=a14;
			 String pkj=a15;
			 String insertQuery="insert into tb2 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			 PreparedStatement preparedStatement;
			 
			 preparedStatement=conn.prepareStatement(insertQuery);
			 preparedStatement.setLong(1, id);
			 preparedStatement.setString(2,roll);
			 preparedStatement.setString(3,surname);
			 preparedStatement.setString(4,name);
			 preparedStatement.setString(5,fname);
			 preparedStatement.setString(6,mobile);
			 preparedStatement.setString(7,mail);
			 preparedStatement.setString(8,ten);
			 preparedStatement.setString(9,twelth);
			 preparedStatement.setString(10,first);
			 preparedStatement.setString(11,second);
			 preparedStatement.setString(12,third );
			 preparedStatement.setString(13,status);
			 preparedStatement.setString(14,company);
			 preparedStatement.setString(15,pkj);
			 preparedStatement.executeUpdate();
			 return 1;
			 
			 
			 
		}
		catch(Exception e){
			 System.out.println(e);
			 return 0;
			
		}
		}

		
	static int insert4(String a1,String a2){
		try
		{
			DAO db=new DAO();
			Connection conn=db.getConnection();
	
			 int id=Integer.parseInt(a1);
			 String pass=a2;
			 
			 String insertQuery="insert into tb4 values(?,?)";
			 PreparedStatement preparedStatement;
			 
			 preparedStatement=conn.prepareStatement(insertQuery);
			 preparedStatement.setInt(1, id);
			 preparedStatement.setString(2,pass);
			 
			 preparedStatement.executeUpdate();
			 return 1;
			 
			 
			 
		}
		catch(Exception e){
			 System.out.println(e);
			 return 0;
			
		}
		}
	static int insert5(String a1,String a2,String a3, String a4,String a5,String a6,String a7,String a8, String a9,String a10,String a11,String a12,String a13, String a14){
		try
		{
			DAO db=new DAO();
			Connection conn=db.getConnection();
	
			 int id=Integer.parseInt(a1);
			 String name=a2;
			 String owner=a3;
			 String address=a4;
			 String city=a5;
			 String state=a6;
			 String pin=a7;
			 String country=a8;
			 String mail=a9;
			 String phone=a10;
			 String capital=a11;
			 String industry=a12;
			 String web=a13;
			 String description=a14;
			 
			 String insertQuery="insert into tb5 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			 PreparedStatement preparedStatement;
			 
			 preparedStatement=conn.prepareStatement(insertQuery);
			 preparedStatement.setInt(1, id);
			 preparedStatement.setString(2,name);
			 preparedStatement.setString(3,owner);
			 preparedStatement.setString(4,address);
			 preparedStatement.setString(5,city);
			 preparedStatement.setString(6,state);
			 preparedStatement.setString(7,pin);
			 preparedStatement.setString(8,country);
			 preparedStatement.setString(9,mail);
			 preparedStatement.setString(10,phone);
			 preparedStatement.setString(11,capital);
			 preparedStatement.setString(12,industry);
			 preparedStatement.setString(13,web);
			 preparedStatement.setString(14,description);
			 preparedStatement.executeUpdate();
			 
			 return 1;
			 
			 
			 
		}
		catch(Exception e){
			 System.out.println(e);
			 return 0;
			
		}
		}
	
	static int update(String a1,String a2,int val1){
		try{
			DAO db=new DAO();
			Connection conn=db.getConnection();
			
			
			 int id=Integer.parseInt(a1);
			 String pass=a2;
			 
			 
			 String selectQuery;
				if(val1==1){
					selectQuery="update tb1 set pass=? where id=?";
				}
				else if(val1==2){
					selectQuery="update tb4 set pass=? where id=?";
				}
				else if(val1==3){
					selectQuery="update tb7 set pass=? where id=?";
				}
				else{
					//System.out.print("Invalid ID");
					selectQuery="update tb1 set pass=? where id=?";
				}
			 PreparedStatement preparedStatement=null;
			 
			 preparedStatement=conn.prepareStatement(selectQuery);
			 preparedStatement.setInt(1, id);
			 preparedStatement.setString(2,pass);
			 
			 int count=preparedStatement.executeUpdate();
			 if(count==0){
				 //System.out.println("No Record Found ");
				 return 0;
			 }
			 else{
			 //System.out.println("Data Succesfully Updated");
			    return 1;
			 }
		}
		catch(Exception e){
			System.out.println(e);
			return -1;
		}
	}
	static int update2(String a1,String a2,String a3, String a4,String a5,String a6,String a7,String a8, String a9,String a10,String a11,String a12,String a13, String a14,String a15){
		try{
			DAO db=new DAO();
			Connection conn=db.getConnection();
			
			int id=Integer.parseInt(a1);
			 String roll=a2;
			 String surname=a3;
			 String name=a4;
			 String fname=a5;
			 String mobile=a6;
			 String mail=a7;
			 String ten=a8;
			 String twelth=a9;
			 String first=a10;
			 String second=a11;
			 String third=a12;
			 int status=Integer.parseInt(a13);
			 String company=a14;
			 String pkj=a15;
			 
			 
			 String selectQuery="update tb2 set roll=?,surname=?,name=?,fname=?,mobile=?,mail=?,ten=?,twelth=?,first=?,second=?,third=?,status=?,company=?,pkj=? where id=?";
			 PreparedStatement preparedStatement=null;
			 
			 preparedStatement=conn.prepareStatement(selectQuery);
			 preparedStatement.setInt(1, id);
			 preparedStatement.setString(2,roll);
			 preparedStatement.setString(3,surname);
			 preparedStatement.setString(4,name);
			 preparedStatement.setString(5,fname);
			 preparedStatement.setString(6,mobile);
			 preparedStatement.setString(7,mail);
			 preparedStatement.setString(8,ten);
			 preparedStatement.setString(9,twelth);
			 preparedStatement.setString(10,first);
			 preparedStatement.setString(11,second);
			 preparedStatement.setString(12,third );
			 preparedStatement.setInt(13,status);
			 preparedStatement.setString(14,company);
			 preparedStatement.setString(14,pkj);
			 preparedStatement.executeUpdate();
			 
			 int count=preparedStatement.executeUpdate();
			 if(count==0){
				 //System.out.println("No Record Found ");
				 return 0;
			 }
			 else{
			 //System.out.println("Data Succesfully Updated");
			    return 1;
			 }
		}
		catch(Exception e){
			System.out.println(e);
			return -1;
		}
	}
	
	static int update5(String a1,String a2,String a3, String a4,String a5,String a6,String a7,String a8, String a9,String a10,String a11,String a12,String a13, String a14){
		try{
			DAO db=new DAO();
			Connection conn=db.getConnection();
			
			 int id=Integer.parseInt(a1);
			 String name=a2;
			 String owner=a3;
			 String address=a4;
			 String city=a5;
			 String state=a6;
			 String pin=a7;
			 String country=a8;
			 String mail=a9;
			 String phone=a10;
			 String capital=a11;
			 String industry=a12;
			 String web=a13;
			 String description=a14;
			 
			 
			 String selectQuery="update tb5 set name=?,owner=?,address=?,city=?,state=?,pin=?,country=?,mail=?,phone=?,capital=?,industry=?,web=?,description=? where id=?";
			 PreparedStatement preparedStatement=null;
			 

			 
			 preparedStatement=conn.prepareStatement(selectQuery);
			 preparedStatement.setInt(1, id);
			 preparedStatement.setString(2,name);
			 preparedStatement.setString(3,owner);
			 preparedStatement.setString(4,address);
			 preparedStatement.setString(5,city);
			 preparedStatement.setString(6,state);
			 preparedStatement.setString(7,pin);
			 preparedStatement.setString(8,country);
			 preparedStatement.setString(9,mail);
			 preparedStatement.setString(10,phone);
			 preparedStatement.setString(11,capital);
			 preparedStatement.setString(12,industry);
			 preparedStatement.setString(13,web);
			 preparedStatement.setString(14,description);
			 preparedStatement.executeUpdate();
			 
			 int count=preparedStatement.executeUpdate();
			 if(count==0){
				 //System.out.println("No Record Found ");
				 return 0;
			 }
			 else{
			 //System.out.println("Data Succesfully Updated");
			    return 1;
			 }
		}
		catch(Exception e){
			System.out.println(e);
			return -1;
		}
	}
	
		
		static int login(String a1,String a2,int val1){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
			
				String selectQuery;
				if(val1==1){
					selectQuery="select * from tb1";
				}
				else if(val1==2){
					selectQuery="select * from tb4";
				}
				else if(val1==3){
					selectQuery="select * from tb7";
				}
				else{
					//System.out.print("Invalid ID");
					selectQuery="select * from tb4";
				}
				PreparedStatement preparedStatement;
				
				int s1=Integer.parseInt(a1);
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				
				int data=0;
				while(result.next()){
					if(result.getInt(1)==s1){
						if(result.getString(2)==a2){
						data=1;
						}
					}
				}
				return data;
				}
				catch(Exception e){
					return -1;
				}
		}
		
		
		
		static int login_logout(String a1,int val,int val1){
			try
			{
				DAO db=new DAO();
				Connection conn=db.getConnection();
				String insertQuery;
				String selectQuery;
				if(val1==1){
					insertQuery="insert into tb3 values(?,?,?)";
					selectQuery="select * from tb3";
				}
				else if(val1==2){
					insertQuery="insert into tb6 values(?,?,?)";
					selectQuery="select * from tb6";
				}
				else if(val1==3){
					insertQuery="insert into tb8 values(?,?,?)";
					selectQuery="select * from tb8";
				}
				else{
					//System.out.print("Invalid ID");
					insertQuery="insert into tb3 values(?,?,?)";
					selectQuery="select * from tb3";
				}
				
				
		         if(val==1){
		        	 
				 int id=Integer.parseInt(a1);
				 Date d=new Date();
				 String s=d+"";
				 
				 InetAddress localhost = InetAddress.getLocalHost();
				 String s1 = localhost.getHostAddress().trim()+"";
				 
				 PreparedStatement preparedStatement;
				 
				 preparedStatement=conn.prepareStatement(insertQuery);
				 preparedStatement.setInt(1, id);
				 preparedStatement.setString(2,s);
				 preparedStatement.setString(4,s1);
				 
				 preparedStatement.executeUpdate();
				 return 1;
				 }
		         else{
						PreparedStatement preparedStatement;
						
						int s1=Integer.parseInt(a1);
						preparedStatement=conn.prepareStatement(selectQuery);
						ResultSet result=preparedStatement.executeQuery();
						
						while(result.next()){
							if(result.getInt(1)==s1){
								Date d=new Date();
								 String s=d+"";
								 PreparedStatement preparedStatement1;
								 
								 preparedStatement1=conn.prepareStatement(insertQuery);
								 preparedStatement1.setString(3, s);
								 
								 preparedStatement.executeUpdate();
							}
						}
		        	 return 1;
		         }
				 
			}
			catch(Exception e){
				 System.out.println(e);
				 return 0;
				
			}
		}
		
		static int check_login(int val1){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
				String selectQuery;
				if(val1==1){
					selectQuery="select * from tb3";
				}
				else if(val1==2){
					selectQuery="select * from tb6";
				}
				else if(val1==3){
					selectQuery="select * from tb8";
				}
				else{
					//System.out.print("Invalid ID");
					selectQuery="select * from tb3";
				}
			
				PreparedStatement preparedStatement;
				
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				
				InetAddress localhost = InetAddress.getLocalHost();
				 String s1 = localhost.getHostAddress().trim()+"";
				 
				int data=0;
				while(result.next()){
					if(result.getString(4)==s1){
						if(result.getString(2)!="" && result.getString(3)==""){
							
						data=1;
						}
					}
				}
				return data;
				}
				catch(Exception e){
					return -1;
				}
		}
		
		static int search_ID(int val1){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
			
				String selectQuery;
				if(val1==1){
					selectQuery="select * from tb3";
				}
				else if(val1==2){
					selectQuery="select * from tb6";
				}
				else if(val1==3){
					selectQuery="select * from tb8";
				}
				else{
					//System.out.print("Invalid ID");
					selectQuery="select * from tb3";
				}
				PreparedStatement preparedStatement;
				
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				
				InetAddress localhost = InetAddress.getLocalHost();
				 String s1 = localhost.getHostAddress().trim()+"";
				 
				int data=0;
				while(result.next()){
					if(result.getString(4)==s1){
						data=result.getInt(1);
					}
				}
				return data;
				}
				catch(Exception e){
					return -1;
				}
		}
		
		
		static String search_by_ID(String b1,int val1){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
			    
				String selectQuery;
				if(val1==1){
					selectQuery="select * from tb2";
				}
				else if(val1==2){
					selectQuery="select * from tb5";
				}
				else{
					//System.out.print("Invalid ID");
					selectQuery="select * from tb2";
				}
				PreparedStatement preparedStatement;
				
				String s1=b1;
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				
				String data="Data Not Found!!";
				while(result.next()){
					if((result.getString(2)).equals(s1)){
						System.out.println("searching");
						if(val1==1){
							     System.out.println(result.getString(4));
							     System.out.println(result.getString(3));
						         data=result.getString(4)+" "+result.getString(3);
						         return data;
						         }
						else{
							System.out.println("in else");
							data=result.getString(2);;
							return data;
						}
					}
				}
				return data;
				}
				catch(Exception e){
					return e+"";
				}
		}
		
      public static void main(String args[]){
    	  System.out.println();
      }

}
