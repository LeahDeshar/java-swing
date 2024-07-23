package com.example.unitfour;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/readSession")
public class ReadSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the session object, do not create one if it doesn't exist
        HttpSession session = request.getSession(false);
        String userName = "Not Found";

        if (session != null) {
            userName = (String) session.getAttribute("userName");
        }

        response.setContentType("text/html");
        response.getWriter().println("<h1>User name from session: " + userName + "</h1>");
        System.out.println("User name from session: " + userName);
    }
}
