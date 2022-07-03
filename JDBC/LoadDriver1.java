package JDBC;

import oracle.jdbc.driver.OracleDriver;

import java.sql.*;
import java.util.Properties;

public class LoadDriver1 {

	public static void main(String[] args) {

		try {
			OracleDriver driver = new OracleDriver();
			DriverManager.registerDriver(driver);

			Properties prop = new Properties();
			prop.put("user", "system");
			prop.put("password", "oracle");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", prop);
			Statement stmt = conn.createStatement();

			stmt.executeUpdate("insert into student values (1208,'Neeraj','EVS')");
			System.out.println("ID\tName\tSubject");
			ResultSet rs = stmt.executeQuery("select * from student");
			System.out.println(rs);
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
