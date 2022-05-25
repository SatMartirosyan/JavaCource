package com.company.Exercises;

public class Utilities {
    private boolean isEnergy;
    private boolean isInternet;

    public boolean isEnergy() {
        return isEnergy;
    }

    public void setEnergy(boolean energy) {
        isEnergy = energy;
    }

    public boolean isInternet() {
        return isInternet;
    }

    public void setInternet(boolean internet) {
        isInternet = internet;
    }

    public void energyOn(boolean energy){
        if (isEnergy()){
            System.out.println("everything is ok");
        }
        else System.out.println("light is off");
    }
}
