package com.company.Exercises;

public class DeveloperFather {
    public boolean work=true;

    public boolean workConditions() {
        if (work) {
            System.out.println("everything is ok");
            return true;
        }
        else {
            System.out.println("I cannot work");
            return false;
        }
    }

}
