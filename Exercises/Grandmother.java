package com.company.Exercises;

import java.util.Scanner;

public class Grandmother implements Callback {

    public static boolean isTrue;

    @Override
    public void callBack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the pension date");
        int date = scanner.nextInt();
        if (date > 0 && date <= 31) {
            isTrue = true;
            System.out.println("I've get my pension");
        } else System.out.println("Sorry, invalid date, you can not get your pension");

    }

    Grandmother() {
        callBack();
    }

}