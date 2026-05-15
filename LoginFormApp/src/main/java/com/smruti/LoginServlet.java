package com.smruti;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded usernames and passwords
        String u1 = "admin";
        String p1 = "admin123";

        String u2 = "smruti";
        String p2 = "smruti@123";

        String u3 = "student";
        String p3 = "student123";

        out.println("<html><body>");

        if ((username.equals(u1) && password.equals(p1)) ||
            (username.equals(u2) && password.equals(p2)) ||
            (username.equals(u3) && password.equals(p3))) {

            out.println("<h1>Welcome " + username + "</h1>");
            out.println("<h2>Login Successful</h2>");

        } else {

            out.println("<h1>Invalid Username or Password</h1>");

            out.println("<a href='index.html'>Try Again</a>");
        }

        out.println("</body></html>");
    }
}