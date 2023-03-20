package com.database;

public class User {
    private String firstName;
    private String surname;
    private String userName;
    private int id;

    private String profes;

    private String passW;

    public User(){


    }

    public User(String email, String pass){
        userName = email;
        passW = pass;
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

    public void setPassW(String passW){
        this.passW = passW;
    }

    public void setProfes(String profes){
        this.profes = profes;
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

    public String getProfes(){
        return profes;
    }

    public String getPassW(){
        return passW;
    }

    public int getId() {
        return id;
    }
}
