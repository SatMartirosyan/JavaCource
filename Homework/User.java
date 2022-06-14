package com.company.Homework;

import java.util.ArrayList;
import java.util.Random;

public class User extends Human implements OnNewPostListener{
    public String name;
    public   int age=new Random().nextInt(18,80);
    public User(String name, int age){
        this.name=name;
    }
    @Override
    public void newPostPublished(String content) {
        System.out.println("User " + name+ " notified obout "+ content);

    }
    public static String generateRandomName(int len) {
        String chars = "asdfghjklqwertyuiopzxcvbnm";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

}