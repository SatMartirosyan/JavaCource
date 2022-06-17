package com.company.loan_managment_system;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    Scanner sc= new Scanner(System.in);
    Random random=new Random();
    Client client;
    LoanTypes loanType;
    int amount= sc.nextInt();
    int duration=sc.nextInt();
    Manager manager;

    public long ACRA() {
        int score=random.nextInt(400,850);
        boolean blocked= random.nextBoolean();
      long  salary=client.salary;
        if (blocked && score>=400 && score<=500){
            return salary*2;
        }
        if (blocked && score>=501 && score<=700){
            return salary*5;
        }
        if (blocked && score>=701 && score<=850){
            return salary*7;
        }
        return 0;
    }

    public  long approval(){
        boolean approve= random.nextBoolean();
        if (approve && ACRA()>0){
            System.out.println(ACRA());
            return ACRA();
        }

        else return 0;
    }
    Passport passport = new Passport();

}
