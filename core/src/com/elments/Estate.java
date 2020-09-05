package com.elments;


public class Estate extends Properties{
    int color;
    int noHouse;
    int oneHouse;
    int twoHouses;
    int threeHouses;
    int homeCost;
    int hotel;

    Estate(){
    }

    public static class estateBuilder{
        int color;
        int noHouse;
        int oneHouse;
        int twoHouses;
        int threeHouses;
        int hotel;
        int homeCost;
        int marketPrice;
        int mortgagePrice;
        String estateName;

        public estateBuilder withColor(int setColor){
            this.color = setColor;
            return this;
        }

        public estateBuilder withRents(int[] rents){
            this.noHouse = rents[0];
            this.oneHouse = rents[1];
            this.twoHouses = rents[2];
            this.threeHouses = rents[3];
            this.hotel = rents[4];
            return this;
        }

        public estateBuilder withHomeCost(int houseCost){
            this.homeCost = houseCost;
            return this;
        }

        public estateBuilder withPrice(int setPrice){
            this.marketPrice = setPrice;
            return this;
        }

        public estateBuilder withMortgage(int setMortgage){
            this.mortgagePrice = setMortgage;
            return this;
        }

        public estateBuilder withName(String setName){
            this.estateName = setName;
            return this;
        }

    }

    public Estate build(){
        Estate estate = new Estate();
        estate.name = this.name;
        estate.color = this.color;
        estate.noHouse = this.noHouse;
        estate.oneHouse = this.oneHouse;
        estate.twoHouses = this.twoHouses;
        estate.threeHouses = this.threeHouses;
        estate.hotel = this.hotel;
        estate.mortgagePrice = this.mortgagePrice;
        estate.marketPrice = this.marketPrice;
        estate.homeCost = this.homeCost;

        return estate;
    }
}