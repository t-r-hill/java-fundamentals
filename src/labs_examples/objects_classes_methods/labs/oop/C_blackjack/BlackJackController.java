package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackJackController {

    public static void playBlackJack() {

        // Instantiate deck
        Deck myDeck = new Deck();

        // Get player name and assign players
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name, then return: ");
        String name = scanner.nextLine();
        Player player1 = new Player(name);
        Player player2 = new Player("Computer");

        // Greet player and ask for starting pot amount
        System.out.print("Welcome " + player1.name + "! How much would you like to start in your betting pot? ");
        int initialPot = scanner.nextInt();
        player1.setPotValue(initialPot);

        do {

            // Take betting from player
            boolean validBet;
            int bet;
            do {
                System.out.println("Let's play!");
                System.out.print("How much would you like to bet? ");
                bet = scanner.nextInt();
                scanner.nextLine();
                validBet = (bet < player1.getPotValue() & bet > 0);
            } while (!validBet);

            player1.setBetAmount(bet);

            // Load a new deck, clear hands and deal two cards to each player
            myDeck.newDeck();
            player1.getHand().getCards().clear();
            player2.getHand().getCards().clear();
            for (int i = 0; i < 2; i++) {
                myDeck.deal(player1);
                myDeck.deal(player2);
            }
            player1.showHandAndScore();
            player2.showDealerHand();

            // Play turns until both players stop taking cards
            System.out.println("Would you like another card? Please answer \"yes\" or \"no\"");
            String dealAgain = scanner.nextLine();
            while (dealAgain.equals("yes") & !player1.getHand().isBust()) {
                myDeck.deal(player1);
                player1.showHandAndScore();
                System.out.println("Would you like another card? Please answer \"yes\" or \"no\"");
                dealAgain = scanner.nextLine();
            }
            while ((player2.computerAI() & !player2.getHand().isBust())) {
                myDeck.deal(player2);
                System.out.println(player2.getName() + " took another card");
                player2.showHandAndScore();
            }


            // Show final hands and assign winner. Allocate betting winnings/losses
            player1.showHandAndScore();
            player2.showHandAndScore();
            if (player1.getHand().score() > player2.getHand().score()) {
                if (!player1.getHand().isBust()) {
                    System.out.println(player1.getName() + " wins!");
                    player1.setPotValue(player1.getPotValue() + player1.getBetAmount() * 2);
                } else if (!player2.getHand().isBust()) {
                    System.out.println(player2.getName() + " wins!");
                    player1.setPotValue(player1.getPotValue() - player1.getBetAmount());
                } else {
                    System.out.println("Both players are bust. No one wins");
                    player1.setPotValue(player1.getPotValue() - player1.getBetAmount() / 2);
                }
            } else if (player1.getHand().score() < player2.getHand().score()) {
                if (!player2.getHand().isBust()) {
                    System.out.println(player2.getName() + " wins!");
                    player1.setPotValue(player1.getPotValue() - player1.getBetAmount());
                } else if (!player1.getHand().isBust()) {
                    System.out.println(player1.getName() + " wins!");
                    player1.setPotValue(player1.getPotValue() + player1.getBetAmount() * 2);
                } else {
                    System.out.println("Both players are bust. No one wins");
                    player1.setPotValue(player1.getPotValue() - player1.getBetAmount() / 2);
                }
            } else if (player1.getHand().isBust()) {
                System.out.println("Both players are bust. No one wins");
                player1.setPotValue(player1.getPotValue() - player1.getBetAmount() / 2);
            } else {
                System.out.println("Its a draw. No one wins");
                player1.setPotValue(player1.getPotValue() - player1.getBetAmount() / 2);
            }


            System.out.println("Your current pot value is: " + player1.getPotValue());
            if (player1.getPotValue() < 1) {
                System.out.println("Sorry that's game over, you've run out of money!");
                break;
            }
            System.out.println("Would you like to play another hand?  Please answer \"yes\" or \"no\"");
            String playAgain = scanner.nextLine();
            if (playAgain.equals("no")) {
                System.out.println("OK, thanks for playing");
                break;
            }
        } while (true);
    }


    public static void main(String[] args) {
        playBlackJack();
    }
}
