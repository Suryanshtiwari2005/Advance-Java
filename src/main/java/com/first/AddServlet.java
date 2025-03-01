package com.first;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Get parameters as strings
        String num1Str = req.getParameter("num1");
        String num2Str = req.getParameter("num2");

        // Check for null or empty input
        if (num1Str == null || num1Str.isEmpty() || num2Str == null || num2Str.isEmpty()) {
            res.getWriter().println("Error: Missing input values.");
            return; // Stop execution
        }

        try {
            // Parse numbers safely
            int i = Integer.parseInt(num1Str);
            int j = Integer.parseInt(num2Str);

            int k = i + j;
            
            Cookie cookie = new Cookie("k", k + "");
            res.addCookie(cookie);

            res.sendRedirect("sq");   //comes under session management
            //it's called URL Rewriting
            
            
//            RequestDispatcher rd = req.getRequestDispatcher("sq");
//            rd.forward(req, res);
           
        } catch (NumberFormatException e) {
            res.getWriter().println("Error: Please enter valid numbers.");
        }
    }
    
}
