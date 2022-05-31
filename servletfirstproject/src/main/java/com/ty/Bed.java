package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Bed extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter printWriter = res.getWriter();

		String htmlcode = "<html><body><h1><a><h>Welcome to my Bed </a></h1></body></html>";

		printWriter.write(htmlcode);
	}
}
