package com.company;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] arg) {
//array();
        //  duplicateNumbers();
        //sqrt();
        sumOfElements();
    }

    public static int scanner() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public static int[] array() {
        System.out.println("input length");
        int length = scanner();
        System.out.println("input minimum value for element");
        int minvalue = scanner();
        System.out.println("input maximum value for element");
        int maxValue = scanner();
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(minvalue, maxValue);
            System.out.println("array [" + i + "] =" + array[i]);
        }
        return array;
    }

    public static void duplicateNumbers() {
        int[] array = array();
        System.out.println("input the number");
        int num = scanner();
        int duplicate = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) duplicate++;
        }
        System.out.println(duplicate);
    }

    public static void sqrt() {
        int[] array = array();
        int[] sqrtArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j <= array[i] / 2; j++) {
                if (j * j == array[i]) {
                    sqrtArray[i] = array[i];
                    count++;
                }
            }

        }
        int maximum = sqrtArray[0];
        int minimum = Integer.MAX_VALUE;
        if (count == 0) System.out.println("there is no number from which the square root comes out");
        else {
            for (int i : sqrtArray) {
                if (i != 0)
                    System.out.println("the number from which the square root comes out: " + i);
            }
        }
        if (count > 1) {
            for (int i = 1; i < sqrtArray.length; i++) {
                if (maximum < sqrtArray[i]) maximum = sqrtArray[i];
            }
            System.out.println("this is the maximum value of array.sqrt:" + maximum);

            for (int i = 0; i < sqrtArray.length; i++) {
                if (minimum > sqrtArray[i] && sqrtArray[i] > 0) minimum = sqrtArray[i];
            }
            System.out.println("this is the minimum value of array.sqrt:" + minimum);
        }

    }

    public static void sumOfElements(){
        int[] array=array();
        int number =scanner();
        int k=0;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i]+array[j]==number) {
                    while (k<1){
                        System.out.println("the numbers which sum is equal to "+number +": ");
                        k++;
                    }
                    System.out.println( array[i]+" and "+array[j]);
                }
            }
        }
    }


}
