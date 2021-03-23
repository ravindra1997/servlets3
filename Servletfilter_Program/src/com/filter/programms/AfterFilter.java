package com.filter.programms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AfterFilter extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {

		super.doGet(req, resp);

		PrintWriter printWriter = resp.getWriter();
		printWriter.write("Welcome Ravindra");
		printWriter.close();
	}

}
