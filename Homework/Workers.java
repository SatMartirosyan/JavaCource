package com.company.Homework;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class Workers extends Human{
    int age=new Random().nextInt(18,80);
    Workers(String name, int age){
        this.name=generateRandomName(5);
    }

    public ArrayList<Workers> workers(String name, int age){
    ArrayList<Workers> workers=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            workers.add(new Workers(generateRandomName(5), age));
        }
        return workers;
    }
}
