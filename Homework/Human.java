package com.company.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Human {


    public ArrayList<Workers> workers = new ArrayList<>();
    boolean isWorker = new Random().nextBoolean();
    boolean isUser = new Random().nextBoolean();
    int age = new Random().nextInt(18, 80);
    String name;
    public static String generateRandomName(int len) {
        String chars = "asdfghjklqwertyuiopzxcvbnm";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

    ArrayList<Human> humans = new ArrayList<>();
    ArrayList<Human> users = new ArrayList<>();

    public ArrayList<Human> users(String name, int age, boolean isUser) {
        User us = new User(name, age);
        for (int i = 0; i < 10; i++) {
            humans.add(new Human());
            // System.out.println(humans.get(i).age);
        }
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).isUser) {
                users.add(us);
            }
        }
        return users;
    }
}
