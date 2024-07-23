package com.example.unitfour;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
@WebServlet("/httpServlet")
public class HttpServletExample extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("HttpServlet is being initialized");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from MyHttpServlet - GET</h1>");
        System.out.println("Handling GET request in HttpServlet");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from MyHttpServlet - POST</h1>");
        System.out.println("Handling POST request in HttpServlet");
    }

    // Called when the servlet is being taken out of service
    @Override
    public void destroy() {
        System.out.println("HttpServlet is being destroyed");
    }
}
