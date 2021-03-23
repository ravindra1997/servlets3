package com.filter.programms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.net.httpserver.Filter.Chain;
import com.sun.net.httpserver.HttpExchange;

public class Admin implements Filter
{
	  @Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		Filter.super.init(filterConfig);
	}
	  @Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		  
		  PrintWriter printWriter=resp.getWriter();
		  
		  String admin=req.getParameter("name");
		  
		  if(admin.equals("ravindra"))
		  {
			  chain.doFilter(req, resp);	
		  }
		  else
		  {
			  printWriter.write("not a valid name re-enter");
			  RequestDispatcher dispatcher=req.getRequestDispatcher("Sample.html");
			  dispatcher.include(req, resp);
		  }
		
		
	}
	  private void distroy() {
		// TODO Auto-generated method stub

	}
}
