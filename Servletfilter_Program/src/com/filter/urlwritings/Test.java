package com.filter.urlwritings;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
		resp.setContentType("text/html");

		String name = req.getParameter("name");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("welcome " + name);
		printWriter.print("<a href='servlet?name=" + name + "'>Show</a>");
		printWriter.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
