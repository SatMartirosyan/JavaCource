package com.company.dynamic_arrays;

public class LinkedList implements DynamicArrayMethods{
    Node head;

    //-----------------adding elements-------------
    public void add(String data) {
        Node insert = new Node(data);
        if (head == null) {
            head = insert;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = insert;
    }

    //-------------printing list-----------------

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;
        }
    }

    //-------------get elements-------------------
    int getCount(){
        if (head==null){
            return 0;
        }
        Node temp=head;
        int count=0;
        while (temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    //----------------delete the element------------------

    public void delete(String key){
        Node temp=head;
        Node prev=null;
        if (temp!=null && temp.data==key){
            head=temp.next;
            System.out.println(key + "deleted");
        }
        while (temp!=null && temp.data!=key){
            prev=temp;
            temp=temp.next;
        }
        if (temp!=null){
            prev.next=temp.next;
            System.out.println(key + " found and deleted");
        }
        if (temp==null){
            System.out.println(key + "not found");
        }
    }

    //---------------------get element---------------
    public String get(int index){
        Node temp=head;
        int count=0;
        while (temp!=null){


            count++;
            if (temp!=null && count==index){
                return temp.data;
            }
            temp=temp.next;
        }

        return " not found";
    }
}

