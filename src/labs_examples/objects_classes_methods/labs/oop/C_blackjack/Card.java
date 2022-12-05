package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    char suit;
    int cardValue;
    String cardFace;

    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
        switch(cardValue){
            case 1:
                this.cardFace = "Ace";
                break;
            case 2:
                this.cardFace = "Two";
                break;
            case 3:
                this.cardFace = "Three";
                break;
            case 4:
                this.cardFace = "Four";
                break;
            case 5:
                this.cardFace = "Five";
                break;
            case 6:
                this.cardFace = "Six";
                break;
            case 7:
                this.cardFace = "Seven";
                break;
            case 8:
                this.cardFace = "Eight";
                break;
            case 9:
                this.cardFace = "Nine";
                break;
            case 10:
                this.cardFace = "Ten";
                break;
            case 11:
                this.cardFace = "Jack";
                break;
            case 12:
                this.cardFace = "Queen";
                break;
            case 13:
                this.cardFace = "King";
                break;
        }
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
        return "[ " + suit + ", " + cardFace + "]";
    }
}
