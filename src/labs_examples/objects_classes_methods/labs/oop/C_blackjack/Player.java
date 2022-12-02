package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    String name;
    Hand hand;
    int potValue;

    public Player(String name, int potValue) {
        this.name = name;
        this.hand = new Hand();
        this.potValue = potValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public boolean computerAI(){
        if (this.hand.score() < 16) {
            return true;
        } else return false;
    }

    public void showHandAndScore(){
        System.out.println(this.getName() + "'s cards are:");
        for (Card card : this.getHand().getCards()){
            System.out.println(card.toString());
        }
        System.out.println("These have a score of: " + this.getHand().score());
    }
}
