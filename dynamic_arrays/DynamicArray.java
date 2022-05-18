package com.company.dynamic_arrays;

public class DynamicArray implements DynamicArrayMethods{
    int size;
    int capacity;
    String[] array;

//    public DynamicArray() {
//        this.array = new String[capacity];
//    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new String[capacity];
    }

    public String  get(int  index) {
        for (int i = 0; i < size; i++) {
            if (i==index) {
                return array[i];
            }
        }
        return "index is not found";
    }

    public void add(String data) {

        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, String data) {

        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(String data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if (size <= capacity / 3) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(String data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {

        int newCapacity = capacity * 2;
        String[] newArray = new String[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {

        int newCapacity = capacity / 2;
        String[] newArray = new String[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

        String element = "";

        for (int i = 0; i < capacity; i++) {
            if (array[i] != null) {
                element += array[i] + ", ";
            }
        }
        if (element != "") {
            element = "[" + element.substring(0, element.length() - 2) + "]";
        } else {
            element = "[]";
        }
        return element;
    }
}
