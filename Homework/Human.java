package com.company.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Human {

    //public ArrayList<Human> humans=new ArrayList<>();
    // public ArrayList<User> users1 = new ArrayList<>();

    public ArrayList<Workers> workers = new ArrayList<>();
    boolean isWorker = new Random().nextBoolean();
    boolean isUser = new Random().nextBoolean();
    int age = new Random().nextInt(18, 80);
    String name = "kdnem";

    //    public ArrayList<Human> humans(String name, int age) {
//        ArrayList<Human> humans = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            humans.add(new Human());
//            System.out.println(humans.get(i).age);
//        }
//        return humans;
//    }
    ArrayList<Human> humans = new ArrayList<User>();
    ArrayList<User> users = new ArrayList<>();

    public ArrayList<Human> users(String name, int age, boolean isUser) {
        for (int i = 0; i < 10; i++) {
            humans.add(new Human());
            // System.out.println(humans.get(i).age);
        }
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).isUser) {
                users.add(humans.get(i));
            }
        }
        return users;
    }

}
