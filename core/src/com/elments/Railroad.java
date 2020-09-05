package com.elments;

class Railroad extends Properties{
    int oneTrain;
    int twoTrain;
    int threeTrain;
    int fourTrain;
    Railroad(int buyingPrice, int mortgage,
             String trainName){
        final int TWENTYFIVE = 25;
        final int TWO = 2;
        this.marketPrice = buyingPrice;
        this.mortgagePrice = mortgage;
        this.name = trainName;
        this.oneTrain = TWENTYFIVE;
        this.twoTrain = TWENTYFIVE * TWO;
        this.threeTrain = TWENTYFIVE * TWO * TWO;
        this.fourTrain = TWENTYFIVE * TWO * TWO * TWO;
    }
}
