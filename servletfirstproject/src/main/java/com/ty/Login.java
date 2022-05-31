package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String n1 = req.getParameter("Name");
		String n2 = req.getParameter("Email");
		String n3 = req.getParameter("Phone");
		String n4 = req.getParameter("Gender");
		String n5 = req.getParameter("Password");
		String n6 = req.getParameter("Country");

		PrintWriter printWriter = res.getWriter();

		String htmlCode = "<html><body><h1>Welcome " + n1 + "<br>" + n2 + "<br>" + n3 + "<br>" + n4 + "<br>" + n5
				+ "<br>" + n6 + "<br>" + "</h1></body></html>";

		printWriter.write(htmlCode);
	}

}
