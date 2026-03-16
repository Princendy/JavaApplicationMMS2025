public class PokerTest {

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();

        Card[] hand1 = new Card[5];
        Card[] hand2 = new Card[5];

        for(int i = 0; i < 5; i++) {
            hand1[i] = deck.dealCard();
            hand2[i] = deck.dealCard();
        }

        System.out.println("Player 1 Hand:");
        for(Card c : hand1)
            System.out.println(c);

        System.out.println();

        System.out.println("Player 2 Hand:");
        for(Card c : hand2)
            System.out.println(c);
    }
}