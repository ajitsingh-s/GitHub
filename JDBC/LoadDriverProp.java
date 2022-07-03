package JDBC;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class LoadDriverProp {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("Propdb.properties");

			System.out.println("Read the file");
			Properties prop = new Properties();
			prop.load(fis);
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String uname = prop.getProperty("uname");
			String pass = prop.getProperty("pass");

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, uname, pass);
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print("\t" + rs.getString(2));
				System.out.println("\t" + rs.getString(3));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
