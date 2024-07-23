package com.example.unitfour;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/genericServlet")
public class GenericServletExample extends GenericServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("GenericServlet is being initialized");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Example of GenericServlet</h1>");
        System.out.println("Handling request in GenericServlet");
    }

    @Override
    public void destroy() {
        System.out.println("GenericServlet is being destroyed");
    }
}
