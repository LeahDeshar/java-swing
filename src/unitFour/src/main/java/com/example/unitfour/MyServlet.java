package com.example.unitfour;
import jakarta.servlet.*;
import java.io.IOException;
//This servlet will show how to use ServletConfig
// and ServletContext to get initialization parameters
// and context attributes.
public class MyServlet extends GenericServlet {
    private String myParam;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        myParam = config.getInitParameter("myParam");
        ServletContext context = config.getServletContext();
        context.setAttribute("globalAttribute", "This is a global attribute");
        System.out.println("MyServlet is being initialized with myParam: " + myParam);
    }
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello from MyServlet</h1>");
        response.getWriter().println("<p>myParam: " + myParam + "</p>");

        ServletContext context = getServletContext();
        String globalAttr = (String) context.getAttribute("globalAttribute");
        response.getWriter().println("<p>Global Attribute: " + globalAttr + "</p>");
        System.out.println("Handling request in MyServlet");
    }

    // Called when the servlet is being taken out of service
    @Override
    public void destroy() {
        System.out.println("MyServlet is being destroyed");
    }
}
