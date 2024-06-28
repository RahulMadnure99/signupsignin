package com.project.dbHandler;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RegisterToDb 
{
	public static void insertData(String fname,String lname,String email,String pass1) throws SQLException 
	{
		String url="jdbc:mysql://localhost/test";
		String user="root";
		String pass="root123";
		String sql="insert into student values(?,?,?,?)";
		Connection con=DriverManager.getConnection(url,user,pass);
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, fname);
		ps.setString(2, lname);
		ps.setString(3, email);
		ps.setString(4, pass1);
		ps.executeUpdate();
	}

}
