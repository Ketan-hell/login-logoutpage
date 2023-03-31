package com.ServletProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLogin extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String mail =req.getParameter("user-email");
		String pw =req.getParameter("user-password");
		if(mail.equals("kholiaketan2@gmail.com")&& pw.equals("simplilearn")){
			RequestDispatcher rd = req.getRequestDispatcher("link.html");
			rd.include(req, resp);
		}
		else{
			out.print("<div class=note>Login unsuccessfull- Try Again!!!</div>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}
	}

}
