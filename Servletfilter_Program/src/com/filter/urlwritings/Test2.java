package com.filter.urlwritings;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);

		resp.setContentType("text/html");
		String s = req.getParameter("uname");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("welcome " + s);
		printWriter.close();

	}

}
