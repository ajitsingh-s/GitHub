package Login;
import java.sql.*;
public class LoginBean {
	private String user;
	private String password;
	boolean flag =  false;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean loginverify() {
		try {
			System.out.println("loginverify.....");
			Connection conn = DBConnection.getConnection();
			Statement stmt = conn.createStatement();
			String query = "select * from login where uname='"+getUser()+"' and pass='"+getPassword()+"'";
			ResultSet rs= stmt.executeQuery(query);
			System.out.println("Resultset object created");
			System.out.println(query);
			if(rs.next()) {
				flag = true;
				System.out.println("Successfully login");
				new Registration("Registation Form");
			} else {
				flag = false;
				System.out.println("User and password invalid");
			}
		}catch(Exception e) {
			e.printStackTrace();;
		}
		return flag;
		
	}

}
