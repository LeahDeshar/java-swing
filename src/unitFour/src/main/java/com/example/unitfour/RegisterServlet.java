package com.example.unitfour;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        HttpSession session = request.getSession(true);
        session.setAttribute("username", username);
        session.setAttribute("email", email);
        session.setAttribute("password", password);

        response.sendRedirect("welcome.jsp");
    }
}
