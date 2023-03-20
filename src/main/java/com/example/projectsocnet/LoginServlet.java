package com.example.projectsocnet;

import com.database.DatabaseManager;
import com.database.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;

import static com.database.DatabaseManager.DATABASE_NAME;


@WebServlet(name = "loginServlet", value = "/login-Servlet")
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("username");
        String password = request.getParameter("paroli");
        String firstName = request.getParameter("firstname");
        String surname = request.getParameter("surname");
        String profess = request.getParameter("proff");
        DatabaseManager database = new DatabaseManager();
        var user = new User(email,password);

        if (!database.contains(user) || email.isBlank()) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("noUser.jsp");
            request.setAttribute("email", email);
            dispatcher.forward(request, response);
        } else if (database.contains(user)){
            RequestDispatcher dispatcher = request.getRequestDispatcher("fromLogin.jsp");
            request.setAttribute("email", email);
            request.setAttribute("firstname", firstName);
            request.setAttribute("surname", surname);
            request.setAttribute("proff",profess);
            dispatcher.forward(request, response);
        }
    }
}