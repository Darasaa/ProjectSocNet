package com.database;

import java.sql.*;

public class DatabaseManager {
    public static final String DATABASE_NAME = "baza";
    private static final String URL = "jdbc:mysql://localhost/" + DATABASE_NAME;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "shechema";
    private static final String TABLE_NAME = "profiles";

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


    private static void selectExample() {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String query = "select * from " + TABLE_NAME;

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String userName = rs.getString("userName");
                String passWord = rs.getString("passW");
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e);
        }
    }



}
