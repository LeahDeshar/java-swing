package com.example.unitfour;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
@WebServlet("/setCookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create a cookie
        Cookie cookie = new Cookie("user", "JohnDoe");
        // Set the maximum age of the cookie in seconds (e.g., 24 hours)
        cookie.setMaxAge(24 * 60 * 60);
        // Add the cookie to the response
        response.addCookie(cookie);

        response.setContentType("text/html");
        response.getWriter().println("<h1>Cookie 'user' has been set to 'JohnDoe'</h1>");
        System.out.println("Cookie 'user' has been set to 'JohnDoe'");
    }
}
