package com.company;

import java.util.Random;
import java.util.Scanner;

public class NewLesson {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input length");
        int length = scanner.nextInt();
        int[] array = new int[length];  //complex object
        System.out.println("array was created, length: " + length);
        System.out.println();
        System.out.println("input maximum value for element");
        int maxValue = scanner.nextInt();
        System.out.println("input minimum value for element");
        int minvalue = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(minvalue, maxValue);
            //System.out.println("array [" + i + "] =" + array[i]);
        }
        //min value of array
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
       // System.out.println("min:" + min);

        int duplicateArray[]=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int count=0;
            if (arrayContains(duplicateArray,array[i])){
                continue;
            }
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicateArray[i]=array[i];
                    count++;
                }
            }
            if (count>1) {
               // System.out.println(array[i] + ",count" + count);
            }        }
    }
    public static boolean arrayContains(int array[], int value){
        for (int i=0;i<array.length;i++){
            if (array[i]==value) return true;
        }
        return false;
    }
}
