package com.ServletProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLogout extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>You have successfully logout.</h1>");
		RequestDispatcher rd = req.getRequestDispatcher("logout.html");
		rd.include(req, resp);
		RequestDispatcher cd = req.getRequestDispatcher("index.html");
		cd.include(req, resp);

}
}
