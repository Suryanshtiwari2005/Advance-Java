package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		int k = 0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		//session.removeAttribute("k");   //to remove value
		PrintWriter out = res.getWriter();
		
		
		
		k = k * k;
		
		out.println("Squared Sum is: "+ k);
		
		System.out.println("sq called");
		
		
	}
	
}
