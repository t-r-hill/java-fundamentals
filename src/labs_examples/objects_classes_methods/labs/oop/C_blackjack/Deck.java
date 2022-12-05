package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
    char[] suits = {'♠', '♦', '♥', '♣'};
    int[] cardValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    int numCards = 52;
    Card[] cards;
    ArrayList<Integer> usedCards;
    static int numDecksLoaded;

    void newDeck(){
        this.cards = new Card[this.numCards];
        this.usedCards = new ArrayList<Integer>();
        int i = 0;
        for (char suit : this.suits){
            for (int cardValue : this.cardValues){
                 this.cards[i] = new Card(suit, cardValue);
                 i++;
            }
        }
        numDecksLoaded++;
    }

    void deal(Player player){
        int randomCardNum = (int) (Math.random() * 52);
        if (!usedCards.contains(randomCardNum)){
            player.hand.cards.add(cards[randomCardNum]);
            usedCards.add(randomCardNum);
        } else deal(player);
    }

    public Card[] getCards() {
        return cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }
}
