package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("arek");
        user.setEmail("arek.król@wp.pl");
        user.setPassword("ImTheKing");
        userDao.create(user);


    }
}