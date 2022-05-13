package com.company.dynamic_arrays;

public class Main {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");


        //System.out.println(dynamicArray.get(0));
        //dynamicArray.insert(0, "X");
        dynamicArray.delete("C");
        //System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("empty: " + dynamicArray.isEmpty());
    }
}
