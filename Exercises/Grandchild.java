package com.company.Exercises;

public class Grandchild implements Callback {
    @Override
    public void call() {
        if (Grandmother.isTrue) {
            System.out.println("give me my money");
        }
    }

    Grandchild() {
        call();
    }
}

