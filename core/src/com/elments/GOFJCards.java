package com.elments;

public class GOFJCards extends OpportunityCards{
    GOFJCards(){
    }
    public GOFJCards build(){
        GOFJCards getOut = new GOFJCards();
        getOut.description = this.description;
        getOut.isChance = this.isChance;

        return getOut;
    }

    public static class gOFJCardsBuilder{
        String description;
        boolean isChance;

        public GOFJCards.gOFJCardsBuilder withDescription(String explanation){
            this.description = explanation;
            return this;
        }

        public GOFJCards.gOFJCardsBuilder isItChance(boolean chanceOrChest){
            this.isChance = chanceOrChest;
            return this;
        }
    }

}
