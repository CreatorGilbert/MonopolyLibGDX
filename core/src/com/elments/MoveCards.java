package com.elments;

public class MoveCards extends OpportunityCards{
    int movement;
    int position;
    int variableCard;

    MoveCards(){
    }

    public MoveCards build(){
        MoveCards moveCard = new MoveCards();
        moveCard.isChance = this.isChance;
        moveCard.description = this.description;
        moveCard.movement = this.movement;
        moveCard.position = this.position;
        moveCard.variableCard = this.variableCard;

        return moveCard;
    }

    public static class moveCardsBuilder{
        String description;
        int movement;
        int position;
        boolean isChance;
        int variableCard;

        public MoveCards.moveCardsBuilder withDescription(String explanation){
            this.description = explanation;
            return this;
        }

        public MoveCards.moveCardsBuilder isItChance(boolean chanceOrChest){
            this.isChance = chanceOrChest;
            return this;
        }

        public MoveCards.moveCardsBuilder withMovement(int howFar){
            this.movement = howFar;
            return this;
        }

        public MoveCards.moveCardsBuilder withPosition(int whereTo){
            this.position = whereTo;
            return this;
        }

        public MoveCards.moveCardsBuilder withVariableCard(int type){
            this.variableCard = type;
            return this;
        }

    }

}

