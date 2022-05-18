package com.company.dynamic_arrays;

public class Main {
    public static void main(String[] args) {

//        DynamicArray dynamicArray = new DynamicArray(5);
//
//        dynamicArray.add("A");
//        dynamicArray.add("B");
//
//
//        //System.out.println(dynamicArray.get(0));
//        //dynamicArray.insert(0, "X");
//        dynamicArray.delete("C");
//        //System.out.println(dynamicArray.search("C"));
//
//        System.out.println(dynamicArray);
//        System.out.println("empty: " + dynamicArray.isEmpty());

        LinkedList linkedList =new LinkedList();
        linkedList.add("15");
        linkedList.add("24");
        linkedList.add("36");
        linkedList.add("78");

//        Node a = new Node();
//        Node b = new Node();
//        Node c = new Node();
//        Node d = new Node();
//        a.data="A";
//        a.next=b;
//        b.data="B";
//        b.next=c;
//        c.data="C";
//        c.next=d;
//        d.data="D";
//        d.next=null;

        linkedList.print();
        System.out.println(linkedList.getCount());
        linkedList.delete("24");
        linkedList.print();
        System.out.println("----------------------------------------");
        System.out.println("the data of inputted index is :" + linkedList.get(1));

        linkedList.addFirst("36");
        linkedList.print();


    }
}
