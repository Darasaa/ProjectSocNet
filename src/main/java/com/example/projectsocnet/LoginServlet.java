package com.example.projectsocnet;

import com.database.DatabaseManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;




@WebServlet(name = "loginServlet", value = "/login-Servlet")
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("username");
        String password = request.getParameter("paroli");

        User user = new User(email, password);
        


        if (email ==null && email.isBlank()) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("loginError.jsp");
            request.setAttribute("ragacasaxeli", email);
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            request.setAttribute("ragacasaxeli", email);
            dispatcher.forward(request, response);
        }

    }

    class User {
        private String firstName;
        private String surName;
        private String userName;
        private int id;

        public User(String email, String password) {

        }
    }
}