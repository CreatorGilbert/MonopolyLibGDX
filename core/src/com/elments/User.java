package com.elments;
import java.util.ArrayList;

public class User {
    int money;
    ArrayList<Properties> boughtProperties;
    ArrayList<Properties> mortgagedProperties;
    boolean chanceGetOutOfJail;
    boolean chestGetOutOfJail;

    User(){
        this.money = 1500;
        boughtProperties = new ArrayList<>();
        mortgagedProperties = new ArrayList<>();
        chanceGetOutOfJail = false;
        chestGetOutOfJail = false;
    }

    public void addMoney(int amount){
        this.money += amount;
    }

    public void removeMoney(int amount){
        this.money -= amount;
    }

    //return true if the list is modified
    public boolean addBoughtProperty(Properties equity){
        return this.boughtProperties.add(equity);
    }

    public boolean removeBoughtProperty(Properties equity) {
        return this.boughtProperties.remove(equity);
    }

    public boolean addMortgagedProperty(Properties equity){
        return this.mortgagedProperties.add(equity);
    }

    public boolean removeMortgagedProperty(Properties equity) {
        return this.mortgagedProperties.remove(equity);
    }

    public void obtainedChanceGetOutOfJail(){
        this.chanceGetOutOfJail = true;
    }

    public void usedChanceGetOutOfJail(){
        this.chanceGetOutOfJail = false;
    }

    public void obtainedChestGetOutOfJail(){
        this.chestGetOutOfJail = true;
    }

    public void usedChestGetOutOfJail(){
        this.chestGetOutOfJail = false;
    }

}
