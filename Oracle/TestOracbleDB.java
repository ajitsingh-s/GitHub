package Oracle;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestOracbleDB {
	public static void main(String[] args) {
		System.out.println("main method ...");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Step 1 ... Load the driver class");
		
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:xe","system","oracle");
			System.out.println(" Step 2 get connection");
			
			Statement stmt =  conn.createStatement();
			System.out.println("Step 3 get statement object");
			
			String query = "create table student( id int, name varchar(255), subject varchar(255))";
			int x1  = stmt.executeUpdate(query);
			System.out.println("Table is created successfully"+x1);
			
			String query1 = "insert into student values(112, 'Aman', 'English')";
			int x2  = stmt.executeUpdate(query1);
			System.out.println("Records is inserted successfully in the table"+x2);
			
			ResultSet rs = stmt.executeQuery("select * from student");

			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			
			conn.close();// Step 5 close the connection
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
}


