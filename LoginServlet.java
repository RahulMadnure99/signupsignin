package com.project.login;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/log")
public class LoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
	{
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		System.out.println(email+" "+pass);
	}


}
