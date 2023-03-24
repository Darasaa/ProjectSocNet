package com.database;

import java.sql.*;

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


//    public void selectExample() {
//        try {
//            Class.forName(DRIVER);
//            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
//
//            String query = "select * from " + TABLE_NAME;
//
//            Statement st = conn.createStatement();
//            ResultSet rs = st.executeQuery(query);
//
//            while(rs.next()) {
//                String firstName = rs.getString("firstName");
//                String lastName = rs.getString("lastName");
//                String userName = rs.getString("userName");
//                String passWord = rs.getString("passW");
//            }
//            st.close();
//        } catch (Exception e) {
//            System.err.println("Got an exception! ");
//            System.err.println(e);
//        }
//    }

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

            String query = "update" + TABLE_NAME + "(Name, Surname, UsernameOrEmail, Profession, Passw) values (?, ?, ?, ?, ?)";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {
                String firstName = rs.getString("name");
                String lastName = rs.getString("surname");
                String userName = rs.getString("usernameOrEmail");
                String passWord = rs.getString("passW");
                String profession = rs.getString("profession");
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e);
        }
    }



}
