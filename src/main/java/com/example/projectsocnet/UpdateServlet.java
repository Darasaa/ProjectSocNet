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
@WebServlet(name = "updateServlet", value = "/update-Servlet")
public class UpdateServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("email");
        String password = request.getParameter("paroli");
        String firstName = request.getParameter("firstname");
        String surName = request.getParameter("surname");
        String profess = request.getParameter("proff");
        DatabaseManager database = new DatabaseManager();
        User user = database.getUser(email,password);

        user.setFirstName(firstName);
        user.setLastName(surName);
        user.setUserName(email);
        user.setPassW(password);
        user.setProfes(profess);
        database.selectUpdate(user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
        request.setAttribute("email", email);
        request.setAttribute("firstname", user.getFirstName());
        request.setAttribute("surname", user.getLastName());
        request.setAttribute("proff",user.getProfes());
        dispatcher.forward(request, response);

    }
}