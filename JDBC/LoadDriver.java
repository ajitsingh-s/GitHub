package JDBC;

import java.sql.*;

import oracle.jdbc.driver.OracleDriver;

public class LoadDriver {

	public static void main(String[] args) {

		try {
			OracleDriver driver = new OracleDriver();
			DriverManager.registerDriver(driver);
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement stmt = conn.createStatement();

			stmt.executeUpdate("insert into student values(1002,'Sumit','Hindi')");
			System.out.println("ID\tName\tSubject");
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print("\t"+rs.getString(2));
				System.out.println("\t"+rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
