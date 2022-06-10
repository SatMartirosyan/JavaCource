package com.company.my_gam;

public class Player implements ActionsListener {
    Player[] players = new Player[3];

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName;

    @Override
    public void actionPerformed() throws InterruptedException {

    }
}
