package com.example.unitfour;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get an array of Cookies associated with this domain
        Cookie[] cookies = request.getCookies();
        String userName = "Not Found";

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    userName = cookie.getValue();
                    break;
                }
            }
        }
        response.setContentType("text/html");
        response.getWriter().println("<h1>Cookie 'user' value: " + userName + "</h1>");
        System.out.println("Cookie 'user' value: " + userName);
    }
}
