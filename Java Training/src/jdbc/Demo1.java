package jdbc;
import java.sql.*;

public class Demo1 {

	public static void main(String args[])
	 
	{
	try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql:///sys","root","Root");
	 
	
	Statement stmt = con.createStatement();
	String query = "insert into list(id,name) values(110,'Ravi')";
	int i = stmt.executeUpdate(query);
	if(i>0)
	{
	System.out.println("Record inserted");
	}
	else{
	System.out.println("Error");
	}
	 
	}
	 
	catch(Exception e)
	 
	{
	System.out.println("Exception has occurred "+e);
	}
	
	}
}
	
