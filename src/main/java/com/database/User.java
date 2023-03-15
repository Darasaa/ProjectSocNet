package com.database;

public class User {
    private String firstName;
    private String surname;
    private String userName;
    private int id;

    public User(){


    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.surname = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return surname;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }
}
