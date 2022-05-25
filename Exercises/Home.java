package com.company.Exercises;

public class Home implements utilityListener {
    Utilities utilities = new Utilities();
    Grandmother hripsimeGrandma = new Grandmother();
//    DeveloperFather developerFather=new DeveloperFather();
    public boolean anunkdnem(){
        if (hripsimeGrandma.getMoney() < 30000) {
            utilities.setEnergy(false);
            return false;
        } else {
            utilities.setEnergy(true);
            return true;
        }
    }


    public boolean anunkdnem(boolean anunkdnem) {
        return true;
    }
}
