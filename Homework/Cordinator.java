package com.company.Homework;

import java.util.ArrayList;

public class Cordinator {
    User user;

    public void setUser(User user) {
        this.user = user;
        System.out.println(user.name);
    }

    public void isKnownAboutNews(String content){
        if (user!=null){
            user.newPostPublished(content);
        }
        System.out.println(content);
    }

    public ArrayList<Workers> pensioneerWorkers(ArrayList<Workers> workers){
        ArrayList<Workers> pensioneerWorkers = new ArrayList<>();
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).age > 30){
                pensioneerWorkers.add(workers.get(i));
            }
        }
        return pensioneerWorkers;
    }

    public ArrayList<Workers> youngWorkers(ArrayList<Workers> workers){
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).age < 30){
                workers.remove(i);
            }
        }
        return workers;
    }
}
