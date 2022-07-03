package JDBC;
import java.sql.*;

public class TestMysql {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mysql");

			Statement stmt = conn.createStatement();
		//	stmt.executeUpdate("create table student (Name varchar(255),ID int,Subject varchar(255),Marks int)");
			stmt.executeUpdate("insert into student values('Sumit',1203,'GK',71)");

			System.out.println("Name\tID\tSubject\tMarks");
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t"+rs.getString(3));
				System.out.println("\t"+rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

//			jdbc - protocol
//			mysql  - protocol
//			//localhost  - ip address
//			3306/mydb - port no./ database name
