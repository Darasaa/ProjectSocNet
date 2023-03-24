package com.database;

import java.sql.*;
import java.sql.PreparedStatement;
public class DatabaseManager {
    public static final String DATABASE_NAME = "baza";
    public static final String URL = "jdbc:mysql://localhost/" + DATABASE_NAME;
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String USER = "root";
    public static final String PASSWORD = "shechema";
    public static final String TABLE_NAME = "profiles";

    public static void insert(User user) {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String query = "insert into " + TABLE_NAME +"(Name, Surname, UsernameOrEmail, Profession, Passw) values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3,user.getUserName());
            preparedStatement.setString(4,user.getProfes());
            preparedStatement.setString(5,user.getPassW());
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e);
        }
    }

    public boolean contains(User user){
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String query = "select * from " + TABLE_NAME +" where UsernameOrEmail = ? and passW = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user.getUserName());
            ps.setString(2,user.getPassW());

            ResultSet rs = ps.executeQuery();
            boolean res = rs.next();
            ps.close();

            return res;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e);
        }
        return false;
    }


    public User getUser(String email,String password){
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String query = "select * from " + TABLE_NAME +" where UsernameOrEmail = ? and passW = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2,password);

            ResultSet rs = ps.executeQuery();
            User user = new User();
            if (rs.next()){
                user.setFirstName(rs.getString("name"));
                user.setLastName(rs.getString("surname"));
                user.setProfes(rs.getString("profession"));
                user.setUserName(email);
                user.setPassW(password);
            }
            ps.close();

            return user;
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e);
        }
        return null;

    }

    public void selectUpdate(User user) {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String query = "UPDATE " + TABLE_NAME + " SET Name=?, Surname=?, UsernameOrEmail=?, Profession=?, Passw=?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getUserName());
            ps.setString(4, user.getProfes());
            ps.setString(5, user.getPassW());

            int rowsAffected = ps.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected.");

            ps.close();
            conn.close();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e);
        }
    }



}
