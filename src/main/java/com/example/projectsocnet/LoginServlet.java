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
        DatabaseManager database = new DatabaseManager();
        if (!database.contains(new com.database.User()) || email.isBlank()) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("noUser.jsp");
            request.setAttribute("email", email);
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
            request.setAttribute("email", email);
            dispatcher.forward(request, response);
        }

    }

    class User {
        private String firstName;
        private String surName;
        private String userName;
        private String passW;
        private int id;

        public User(String email, String password) {

        }
    }
}