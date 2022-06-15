package com.company.Homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int age1 = new Random().nextInt(18, 80);
        String name="";
        boolean isUser = new Random().nextBoolean();

        NewsPage mamulAM = new NewsPage();
        String content = "Kensatoshakayin tariqy darnum e 30";
        User user = new User(Human.generateRandomName(5), age1);
        user.users();

        mamulAM.setOnNewPostListener(user);
        mamulAM.post(content);

        Cordinator cordinator = new Cordinator();
        cordinator.setUser(user);
        cordinator.isKnownAboutNews(content);

        Human human = new Human();
        System.out.println("---------------------------------------");
        System.out.println(human.users(name, age1, isUser).size());
        human.users(Human.generateRandomName(5), age1, isUser);
        Workers workers = new Workers(Human.generateRandomName(5), age1);
        cordinator.pensioneerWorkers(workers.workers(Human.generateRandomName(5), age1));
    }
}

