package com.elments;

public class Properties {
    int marketPrice;
    int mortgagePrice;
    boolean currentlyMortgaged = false;
    String name;
    User owner;
    User bank = new Banker();

    Properties(){
        this.owner = bank;
    }

    public void buyProperty(User buyer){
        this.owner = buyer;
    }

    public void mortgage(){
        this.currentlyMortgaged = true;
    }

    public void unMortgage(){
        this.currentlyMortgaged = false;
    }

    public int getPrice(){
        return this.currentlyMortgaged ? this.mortgagePrice : this.marketPrice;
    }
}
