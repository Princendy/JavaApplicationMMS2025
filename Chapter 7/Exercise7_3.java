public class Exercise7_3 {

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();

        Card[] hand = new Card[5];

        System.out.println("Five Card Hand:\n");

        for(int i = 0; i < 5; i++) {

            hand[i] = deck.dealCard();
            System.out.println(hand[i]);
        }
    }
}