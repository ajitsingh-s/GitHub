package Login;

import java.sql.*;

public class DBConnection {
	private static Connection conn = null;
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
//	public static void main(String[] args) {
//		Connection conn = DBConnection.getConnection();
//		System.out.println("Conn "+conn);
//	}
	
}
