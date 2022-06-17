package com.company.loan_managment_system;

import java.util.Random;

public class Client {
    Random rd = new Random();
    Passport passport = new Passport();
    long salary = rd.nextInt(65000, 10000000);

    Client() {

        Passport passport = this.passport;
        long salary = this.salary;
        System.out.println("client");
    }
}
