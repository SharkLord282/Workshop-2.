package org.example;

import java.net.PasswordAuthentication;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printtasks(tasks);
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            switch (input) {
                case "exit":
                    System.exit(0);
                    break;
                case "create":
                    System.out.println("Podaj Nazwę, email, hasło");
                    createuser(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
                    break;
                case "read":
                    System.out.println("Podaj Id");
                    readuser(scanner.nextInt());
                    break;
                default:
                    System.out.println("Wybierz poprawne zadanie");
            }
            printtasks(tasks);
        }



    }
    static final String[] tasks = {"create","read", "exit"};
    public static void printtasks(String[] tab) {
        System.out.println("wybierz zadanie:");
        for (String task : tab) {
            System.out.println(task);
        }
    }

    public static void readuser(int userid) {
        UserDao userDao = new UserDao();
        User user = UserDao.read(userid);
        System.out.println(user.getId());
        System.out.println(user.getUserName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
    }

    public static void createuser(String username, String emai, String password) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName(username);
        user.setEmail(emai);
        user.setPassword(password);
        userDao.create(user);
    }
}