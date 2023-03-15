package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseManager {
    private static final String DATABASE_NAME = "baza";
    private static final String URL = "jdbc:mysql://localhost/" + DATABASE_NAME;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "shechema";
    private static final String TABLE_NAME = "profiles";

    public void insert(User user) {
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String query = "insert into " + TABLE_NAME +"(FirstName, LastName, userName, id) values (?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3,user.getUserName());
            preparedStatement.setInt(4, user.getId());
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

            String query = "select * from " + TABLE_NAME +" where FirstName = ? and LastName = ? and userName = ? and id = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getUserName());
            ps.setInt(4, user.getId());

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

}
