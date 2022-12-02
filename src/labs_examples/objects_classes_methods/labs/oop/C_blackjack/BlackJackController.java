package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackJackController {

    public static void playBlackJack() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name, then return: ");
        String name = scanner.nextLine();
        System.out.print("Please enter initial pot for each player: ");
        int initialPotValue = scanner.nextLine();
        Player player1 = new Player(name, initialPotValue);
        Player player2 = new Player("Computer", initialPotValue);
        Deck myDeck = new Deck();
        myDeck.newDeck();
        for (int i = 0; i < 2; i++) {
            myDeck.deal(player1);
            myDeck.deal(player2);
        }
        player1.showHandAndScore();
        System.out.println("Would you like another card? Please answer \"yes\" or \"no\"");
        String dealAgain = scanner.nextLine();
        while ((dealAgain.equals("yes") & !player1.getHand().isBust()) | (player2.computerAI() & !player2.getHand().isBust())) {
            if ((dealAgain.equals("yes") & !player1.getHand().isBust())) {
                myDeck.deal(player1);
                player1.showHandAndScore();
            }
            if ((player2.computerAI() & !player2.getHand().isBust())) {
                myDeck.deal(player2);
                System.out.println(player2.getName() + " took another card");
            }
            System.out.println("Would you like another card? Please answer \"yes\" or \"no\"");
            dealAgain = scanner.nextLine();
        }
        player1.showHandAndScore();
        player2.showHandAndScore();
        if (player1.getHand().score() > player2.getHand().score() & !player1.getHand().isBust()){
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getHand().isBust()) {
            System.out.println("Both players are bust. No one wins");
        } else System.out.println(player2.getName() + " wins!");
    }


    public static void main(String[] args) {
        playBlackJack();
    }
}
