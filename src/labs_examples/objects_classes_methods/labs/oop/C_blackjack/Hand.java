package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int handValue;

    public Hand(){
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }
    public int score(){
        int score = 0;
        for (Card card : cards){
            score += card.getCardValue();
        }
        return score;
    }

    public boolean isBust(){
        if (this.score() > 21){
            return true;
        } else return false;
    }
}
