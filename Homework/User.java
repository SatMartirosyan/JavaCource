package com.company.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User extends Human implements OnNewPostListener {
    public String name;
    public int age = new Random().nextInt(18, 80);

    public User(String name, int age) {
        this.name = name;
    }

    @Override
    public void newPostPublished(String content) {
        System.out.println("Users notified obout " + content);
    }

    ArrayList<User> users() {
        ArrayList<User> users = new ArrayList<User>();
        for (int i = 0; i < 5; i++) {
            users.add(new User(User.generateRandomName(5), age));
            System.out.println("Name : " + users.get(i).name + ", Age : " + users.get(i).age);
        }
        return users;
    }
}