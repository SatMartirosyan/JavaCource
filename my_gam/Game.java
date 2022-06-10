package com.company.my_gam;

import java.util.Random;
import java.util.Scanner;


public class Game{
    Game() {

    }

    //Timer gametimer;
    Integer output;
    Scanner sc = new Scanner(System.in);
    int score = 0;
    boolean win;
    int count = 0;

    public void game(ActionsListener actionsListener) {
        count++;
        if (count <= 2) {
            int firstNumber = new Random().nextInt(10);
            int secondNumber = new Random().nextInt(10);
            System.out.println("Let's play");
            System.out.println(firstNumber);
            System.out.println(secondNumber);
            System.out.println("Enter the sum");
            if (sc.hasNext()) {
                output = sc.nextInt();
                if (output == firstNumber + secondNumber) {     //Thread.sleep(5000);
                    System.out.println("Nice");
                    win = true;
                    score++;

                } else {
                    System.out.println("you lose");
                    win = false;
                }
//         else if (!sc.hasNext()){
//            System.out.println("you lose");
//            sc.nextLine();
//        }
            }
            game();
        }
    }




//        public int timer () throws InterruptedException {
//            int second = 0;
//            for (int i = 1; i <= 5; i++) {
//                second = i;
//                Thread.sleep(1000);
//                System.out.println(i);
//            }
//
//            return second;
//        }


//    private boolean isEmpty() throws InterruptedException {
//        if (timer()<=5)  return true;
//        else return false;
//    }

//    public void setTimer(){
//        gametimer = new Timer(5000,this);
//        gametimer.start();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("Let's play");
//        System.out.println(firstNumber);
//        System.out.println(secondNumber);
//        System.out.println("Enter the sum");
//        int output = new Scanner(System.in).nextInt();
//        setTimer();
//        if (output == firstNumber + secondNumber) {
//            //Thread.sleep(5000);
//            System.out.println("Nice");
//        }
//        else if (output!=firstNumber+secondNumber) System.out.println("you lose");
//
//    }
}
