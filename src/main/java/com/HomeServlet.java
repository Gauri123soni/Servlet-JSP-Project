package com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        HttpSession session = request.getSession();

        String username = (String) session.getAttribute("username");

        response.getWriter().println("<html>");
        response.getWriter().println("<body>");

        response.getWriter().println("<h1>Welcome Home</h1>");
        response.getWriter().println(
            "<h2>Hello, " + username + "</h2>"
        );

        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
