package com.first;

import java.io.IOException;
import java.util.List;
import java.util.Arrays;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		List<Student> studs = Arrays.asList(
				new Student(1,"Suryansh"),
				new Student(2,"Raj"),
				new Student(3,"Harsh")
				);
		Student s = new Student(1,"Suryansh");
		
		request.setAttribute("students", s);
		RequestDispatcher rd= request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
		
	}
}
