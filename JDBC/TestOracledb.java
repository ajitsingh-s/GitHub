package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestOracledb {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

			Statement stmt = conn.createStatement();

			stmt.executeUpdate("insert into login values('efg','efg')"); // insert, update, delete, drop, create, DDL

			ResultSet rs = stmt.executeQuery("select * from login"); // It fetch-(get) the data from the database in the
																		// form of table.
			System.out.println("Uname\tPassword");
			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.println("\t" + rs.getString(2));
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
