package org.example;

public class User {
private static int id;
private static String userName;
private static String email;
private static String password;

    public  void setId(int id) {
        User.id = id;
    }

    public  void setUserName(String userName) {
        User.userName = userName;
    }

    public  void setEmail(String email) {
        User.email = email;
    }

    public  void setPassword(String password) {
        User.password = password;
    }

    public  int getId() {
        return id;
    }

    public  String getUserName() {
        return userName;
    }

    public  String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
