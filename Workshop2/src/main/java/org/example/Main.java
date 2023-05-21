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
                case "update":
                    System.out.println("Podaj Nazwę, email, hasło, id");
                    updateeuser(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextInt());
                    break;
                case "delete":
                    System.out.println("podaj Id");
                    deleteUser(scanner.nextInt());
                        break;
                default:
                    System.out.println("Wybierz poprawne zadanie");
            }

        }



    }
    static final String[] tasks = {"create","read","update","delete",  "exit"};
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

    public static void updateeuser(String username, String emai, String password, int id) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName(username);
        user.setEmail(emai);
        user.setPassword(password);
        user.setId(id);
        userDao.update(user);
    }

    public static void deleteUser(int userId) {
        UserDao userDao = new UserDao();
        userDao.deleteUser(userId);
    }

}