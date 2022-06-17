package com.company.loan_managment_system;

import java.util.Scanner;

public class Passport {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String surname = sc.nextLine();
    int year = sc.nextInt();
    int id = sc.nextInt();

    Passport() {
        String name = this.name;
        String surname = this.surname;
        int year = this.year;
        int id = this.id;
        System.out.println("passport");


//        this.name=name;
//        this.surname=surname;
//        this.year=year;
//        this.id=id;
    }

}
