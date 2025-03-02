package com.first;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class SecondFilter
 */
@WebFilter("/addAlien")
public class SecondFilter extends HttpFilter implements Filter {
       
    

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		HttpServletRequest req = (HttpServletRequest)request;
		String aname = request.getParameter("aname");
		
		if(aname.length() > 2)
			chain.doFilter(request, response);
		else
			((HttpServletResponse)response).sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid Input");
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
