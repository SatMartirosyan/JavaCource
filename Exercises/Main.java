package com.company.Exercises;

public class Main {
    public static void main(String[] args) {

        Government g1 = new Government();
        Grandmother hripsimeGrandma = new Grandmother();
        hripsimeGrandma.setAge(100);
        g1.setOnPensionListener(hripsimeGrandma);
        //hripsimeGrandma.onPensionReceived(150000);
        Grandchild grandchild1 = new Grandchild();
        Utilities utilities = new Utilities();
        g1.setOnPensionListener(new OnPensionListener() {
            @Override
            public OnPensionListener onPensionReceived(double pensionAmount) {
                //boolean isEnergy = true;
                grandchild1.giveMoney();
                hripsimeGrandma.setMoney(hripsimeGrandma.getMoney() + pensionAmount);
                System.out.println(hripsimeGrandma.getMoney());
//                if (hripsimeGrandma.getMoney() < pensionAmount) {
//                    utilities.setEnergy(false);
//                } else {
//                    utilities.setEnergy(true);
//                }
//                if (utilities.isEnergy()==false){
//
//                }
                return hripsimeGrandma;
            }
        }.onPensionReceived(100000));
        grandchild1.setMoney(grandchild1.getMoney() + hripsimeGrandma.moneyForGrandchild(20000));
        System.out.println(grandchild1.getMoney());
        DeveloperFather developerFather = new DeveloperFather();

        Home home = new Home();
        home.anunkdnem(new utilityListener() {

            @Override
            public boolean anunkdnem() {
                if (!home.anunkdnem()) {
                    developerFather.work = false;
                    return false;
                } else {
                    developerFather.work = true;
                    return true;
                }
            }

        }.anunkdnem());
        developerFather.workConditions();

    }

}
