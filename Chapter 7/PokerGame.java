import java.util.Scanner;

public class PokerGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int playerWins = 0;
        int dealerWins = 0;

        for(int game=1; game<=20; game++){

            System.out.println("\nGAME " + game);

            DeckOfCards deck = new DeckOfCards();
            deck.shuffle();

            Card[] playerHand = new Card[5];
            Card[] dealerHand = new Card[5];

            for(int i=0;i<5;i++){
                playerHand[i] = deck.dealCard();
                dealerHand[i] = deck.dealCard();
            }

            System.out.println("\nYour Hand:");

            for(int i=0;i<5;i++){
                System.out.println((i+1) + ": " + playerHand[i]);
            }

            System.out.println("\nEnter positions of cards to replace (1-5). Enter 0 to stop.");

            while(true){

                int pos = input.nextInt();

                if(pos==0)
                    break;

                if(pos>=1 && pos<=5)
                    playerHand[pos-1] = deck.dealCard();
            }

            // Dealer replaces first two cards automatically
            dealerHand[0] = deck.dealCard();
            dealerHand[1] = deck.dealCard();

            int playerScore = evaluateHand(playerHand);
            int dealerScore = evaluateHand(dealerHand);

            System.out.println("\nYour Final Hand:");
            for(Card c : playerHand)
                System.out.println(c);

            System.out.println("\nDealer Hand:");
            for(Card c : dealerHand)
                System.out.println(c);

            if(playerScore > dealerScore){
                System.out.println("You win!");
                playerWins++;
            }
            else if(dealerScore > playerScore){
                System.out.println("Dealer wins!");
                dealerWins++;
            }
            else{
                System.out.println("Tie!");
            }
        }

        System.out.println("\nAfter 20 games:");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Dealer wins: " + dealerWins);
    }


    public static int evaluateHand(Card[] hand){

        int pairs = 0;

        for(int i=0;i<hand.length;i++){
            for(int j=i+1;j<hand.length;j++){

                if(hand[i].getFace().equals(hand[j].getFace()))
                    pairs++;
            }
        }

        if(pairs == 1)
            return 2;

        if(pairs == 2)
            return 3;

        if(pairs == 3)
            return 4;

        if(pairs >= 4)
            return 6;

        return 1;
    }
}