public class PokerDealerTest {

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] playerHand = new Card[5];
        Card[] dealerHand = new Card[5];

        for(int i=0;i<5;i++){
            playerHand[i] = deck.dealCard();
            dealerHand[i] = deck.dealCard();
        }

        System.out.println("Player Hand:");
        for(Card c : playerHand)
            System.out.println(c);

        System.out.println("\nDealer Hand: (Face Down)");
        System.out.println("[Hidden Cards]");

        // Evaluate dealer hand
        int pairs = countPairs(dealerHand);

        int cardsToReplace = 0;

        if(pairs == 0)
            cardsToReplace = 3;
        else if(pairs == 1)
            cardsToReplace = 2;
        else
            cardsToReplace = 1;

        for(int i=0;i<cardsToReplace;i++){
            dealerHand[i] = deck.dealCard();
        }

        System.out.println("\nDealer Final Hand:");
        for(Card c : dealerHand)
            System.out.println(c);
    }

    public static int countPairs(Card[] hand){

        int pairs = 0;

        for(int i=0;i<hand.length;i++){
            for(int j=i+1;j<hand.length;j++){

                if(hand[i].getFace().equals(hand[j].getFace()))
                    pairs++;
            }
        }

        return pairs;
    }
}