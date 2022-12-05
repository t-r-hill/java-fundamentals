package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    String name;
    Hand hand;
    int potValue;
    int betAmount;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
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

    public int getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
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

    public void showDealerHand(){
        System.out.println(this.getName() + "'s cards are:");
        System.out.println(this.getHand().getCards().get(0).toString());
        System.out.println("** Hidden **");
    }
}
