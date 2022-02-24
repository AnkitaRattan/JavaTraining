package jdbc;
import java.sql.*;
public class Demo {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///sys","root","Root");
		
		Statement stmt=con.createStatement();
		
		String query ="create table employee(id int,name varchar(20))";
		stmt.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println("Exception has occured" +e);
		}
				
		}
	}
	
