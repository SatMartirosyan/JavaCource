package com.company.Homework;

import java.util.ArrayList;

public class Cordinator {
    User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void isKnownAboutNews(String content) {
        if (user != null) {
            user.newPostPublished(content);
        }
    }

    public ArrayList<Workers> pensioneerWorkers(ArrayList<Workers> workers) {
        ArrayList<Workers> pensioneerWorkers = new ArrayList<>();
        System.out.println("The following employees are already retired, as according to the Mamul.am, from now on the retirement age is considered to be more than 30.");
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).age > 30) {
                System.out.println("Name : " + workers.get(i).name + " , Age : " + workers.get(i).age);
                pensioneerWorkers.add(workers.get(i));
            }
        }
        return pensioneerWorkers;
    }

    public ArrayList<Workers> youngWorkers(ArrayList<Workers> workers) {
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).age < 30) {
                workers.remove(i);
            }
        }
        return workers;
    }
}
