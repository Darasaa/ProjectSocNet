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
@WebServlet(name = "registrationServlet", value = "/registration-Servlet")
public class RegistrationServlet extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            String email = request.getParameter("email");
            String password = request.getParameter("paroli");
            String repeatPassword = request.getParameter("rparoli");
            String firstName = request.getParameter("firstname");
            String surName = request.getParameter("surname");
            String profess = request.getParameter("proff");

            if (!password.equals(repeatPassword)) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("loginError.jsp");
                request.setAttribute("email", email);
                dispatcher.forward(request, response);
            }

            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(surName);
            user.setUserName(email);
            user.setPassW(password);
            user.setProfes(profess);
            DatabaseManager bazaa = new DatabaseManager();
            bazaa.insert(user);

            DatabaseManager baza = new DatabaseManager();
            if(baza.contains(user)){
                RequestDispatcher dispatcher = request.getRequestDispatcher("loginError.jsp");
                request.setAttribute("email", email);
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
                request.setAttribute("email", email);
                dispatcher.forward(request, response);
            }

        }


}


