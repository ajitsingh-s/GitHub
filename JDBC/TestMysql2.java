package JDBC;

import java.sql.*;
public class TestMysql2{
	public static void main(String [] args){
		try{
			System.out.println("Entry into try");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Get driver class");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydb","root","mysql");
			System.out.println("Get Connection");
			Statement stmt  = conn.createStatement();
//			stmt.executeUpdate("create table employee(Name varchar(255),ID int,Company varchar(255),Salary int)");
			stmt.executeUpdate("insert into employee values('Abhay',1254,'Infosys',42000)");
			
			System.out.println("Name\tID\tCompany\tSalary");
			ResultSet rs = stmt.executeQuery("select * from employee");
			
			while(rs.next()){
				System.out.print(rs.getString(1));
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t"+rs.getString(3));
				System.out.println("\t"+rs.getString(4));
			}
			conn.close();
		} catch(Exception e){ System.out.println(e); }
	}
}
			