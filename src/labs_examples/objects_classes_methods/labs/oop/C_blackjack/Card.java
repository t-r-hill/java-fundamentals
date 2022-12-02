package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    char suit;
    int cardValue;

    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public char getSuit() {
        return suit;
    }

    public int getCardValue() {
        if (cardValue <=10) {
            return cardValue;
        } else {
            return 10;
        }
    }

    public String toString(){
        return "[ " + suit + ", " + cardValue + "]";
    }
}
