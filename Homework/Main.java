package com.company.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
        public static void main(String[] args) {
            int age1=new Random().nextInt(18,80);
            NewsPage mamulAM= new NewsPage();
            String content="Kensatoshakayin tariqy darnum e 30";
            mamulAM.post(content);
            mamulAM.setOnNewPostListener(new OnNewPostListener() {
                @Override
                public void newPostPublished(String content) {
                    System.out.println(content);
                }
            });
           // mamulAM.post("Ashkhatanqayin orery darnum en 2 or");
            User user=new User("Mamikon",age1);
            List<User> users = new ArrayList<User>();
            for (int i = 0; i < 5; i++) {
                users.add(new User(User.generateRandomName(5), age1));
//                System.out.println(users.get(i).name);
//                System.out.println(users.get(i).age);
            }

            mamulAM.setOnNewPostListener(user);
            mamulAM.post("Kensatoshakayin tariqy darnum e 30");

            Cordinator cordinator = new Cordinator();
           cordinator.setUser(user);
            cordinator.isKnownAboutNews(content);

        }
    }

