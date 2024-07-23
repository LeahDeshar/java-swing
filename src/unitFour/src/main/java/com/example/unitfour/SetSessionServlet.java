package com.example.unitfour;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

@WebServlet("/setSession")
public class SetSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the session object, create one if it doesn't exist
        HttpSession session = request.getSession(true);

        // Store the user's name in the session
        session.setAttribute("userName", "JohnDoe");

        response.setContentType("text/html");
        response.getWriter().println("<h1>User name 'JohnDoe' has been stored in the session</h1>");
        System.out.println("User name 'JohnDoe' has been stored in the session");
    }
}
