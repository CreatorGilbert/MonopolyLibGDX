package com.elments;

public class PayCards extends OpportunityCards{
    int amount;
    boolean variableCard;

    PayCards(){
    }

    public PayCards build(){
        PayCards payCard = new PayCards();
        payCard.description = this.description;
        payCard.amount = this.amount;
        payCard.variableCard = this.variableCard;
        payCard.isChance = this.isChance;

        return payCard;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public static class payCardsBuilder{
        String description;
        boolean isChance;
        int amount;
        boolean variableCard;

        public PayCards.payCardsBuilder withDescription(String explanation){
            this.description = explanation;
            return this;
        }

        public PayCards.payCardsBuilder isItChance(boolean chanceOrChest){
            this.isChance = chanceOrChest;
            return this;
        }

        public  PayCards.payCardsBuilder withAmount(int money){
            this.amount = money;
            return this;
        }

        public  PayCards.payCardsBuilder withVariableCard(boolean type){
            this.variableCard = type;
            return this;
        }
    }

}
