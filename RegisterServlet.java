package com.project.registration;

import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.project.dbHandler.RegisterToDb;
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
	{
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		System.out.println(fname+" "+lname+" "+ email+" "+pass);
		
		try {
			RegisterToDb.insertData(fname, lname, email, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
