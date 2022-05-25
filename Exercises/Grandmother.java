package com.company.Exercises;

public class Grandmother extends Human implements OnPensionListener {
    private double money = 0;

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public OnPensionListener onPensionReceived(double pensionAmount) {
        money += pensionAmount;
        System.out.println(money);
        return null;
    }

    public double moneyForGrandchild(double grandchildPart){
        if (money>0 && money>grandchildPart){
            money-=grandchildPart;
            System.out.println(money);
            return grandchildPart;
        }
        else {
            System.out.println("I do not have enough money");
            return 0;
        }
    }

    public void moneyForGrandchild() {
    }
}