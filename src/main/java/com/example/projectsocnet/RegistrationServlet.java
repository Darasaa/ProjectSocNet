package com.example.projectsocnet;

import com.database.DatabaseManager;
import com.database.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationServlet {
    @WebServlet(name = "registrationServlet", value = "/registration-Servlet")
    public class registrationServlet extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            String email = request.getParameter("ragacsaxeli");
            String password = request.getParameter("paroli");
            String repeatPassword = request.getParameter("paroliMeore");
            String firstName = request.getParameter("firstname");
            String surName = request.getParameter("surname");
            String userName = request.getParameter("username");
            String id = request.getParameter("id");

            if (!password.equals(repeatPassword)) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("loginError.jsp");
                request.setAttribute("ragacasaxeli", email);
            }

            User user = new User();
            user.setFirstName("firstName");
            user.setLastName("lastName");
            user.setUserName("username");
            user.setId(user.getId());

            DatabaseManager baza = new DatabaseManager();
            if(baza.contains(user)){
                RequestDispatcher dispatcher = request.getRequestDispatcher("loginError.jsp");
                request.setAttribute("ragacsaxeli", email);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
                request.setAttribute("ragacsaxeli", email);
            }

        }


    }
}
