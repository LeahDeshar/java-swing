package com.example.unitfour;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/myHttpServlet")
public class MyHttpServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("MyHttpServlet is being initialized");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from MyHttpServlet - GET</h1>");

        String paramValue = request.getParameter("param");
        response.getWriter().println("<p>Request Parameter 'param': " + paramValue + "</p>");

        String userAgent = request.getHeader("User-Agent");
        response.getWriter().println("<p>User-Agent: " + userAgent + "</p>");

        System.out.println("Handling GET request in MyHttpServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from MyHttpServlet - POST</h1>");

        String paramValue = request.getParameter("param");
        response.getWriter().println("<p>Request Parameter 'param': " + paramValue + "</p>");

        System.out.println("Handling POST request in MyHttpServlet");
    }

    @Override
    public void destroy() {
        System.out.println("MyHttpServlet is being destroyed");
    }
}
