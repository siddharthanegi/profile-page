package com.test.profile.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req , HttpServletResponse res){
		
		String userName , passWord;
		userName=req.getParameter("username");
		passWord=req.getParameter("password");
		System.out.println(userName);
		
	}

}
