package com.example.unitfour;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/lifecycle")
public class LifecycleServlet extends HttpServlet {

    // Called when the servlet is first loaded into memory
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Servlet is being initialized");
    }

    // Called to handle each request to the servlet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from LifecycleServlet</h1>");
        System.out.println("Handling GET request");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Post request handled</h1>");
        System.out.println("Handling POST request");
    }

    // Called when the servlet is being taken out of service
    @Override
    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }
}
