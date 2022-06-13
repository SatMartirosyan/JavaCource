package com.company.Homework;

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
}
