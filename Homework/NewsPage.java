package com.company.Homework;

public class NewsPage {
    OnNewPostListener onNewPostListener;

    public void setOnNewPostListener(OnNewPostListener onNewPostListener) {
        this.onNewPostListener = onNewPostListener;
    }

    public void post (String content){
        if (onNewPostListener!=null){
            onNewPostListener.newPostPublished(content);
        }
    }
}
