package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Database 
{
	public static void saveData(String name, String Add, String state, String city, String zip, String Mbno) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##Aditya", "aditya");
		String sql = "insert into regForm values(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, Add);
		ps.setString(3, state);
		ps.setString(4, city);
		ps.setString(5, zip);
		ps.setString(6, Mbno);
		int n = ps.executeUpdate();
		System.out.println("Data Inserted Successfully!");
	}
}
