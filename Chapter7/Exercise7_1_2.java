// Card.java
public class Card {
    private final Face face;
    private final Suit suit;

    public Card(Face cardFace, Suit cardSuit) {
        face = cardFace;
        suit = cardSuit;
    }

    public Face getFace() { return face; }
    public Suit getSuit() { return suit; }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}

//Exercise7_20a
// Face.java
public enum Face {
    ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

//Exercise7_20b
// Suit.java
public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}

// DeckOfCards.java
import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCards() {
        deck = new Card[NUMBER_OF_CARDS];
        int count = 0;
        for (Suit suit : Suit.values()) {
            for (Face face : Face.values()) {
                deck[count++] = new Card(face, suit);
            }
        }
        currentCard = 0;
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        }
        return null;
    }

    public Card[] dealHand() {
        Card[] hand = new Card[5];
        for (int i = 0; i < 5; i++) {
            hand[i] = dealCard();
        }
        return hand;
    }

    private int[] getFaceCounts(Card[] hand) {
        int[] counts = new int[13];
        for (Card c : hand) {
            counts[c.getFace().ordinal()]++;
        }
        return counts;
    }

    public boolean hasPair(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        for (int c : counts) if (c == 2) return true;
        return false;
    }

    public boolean hasTwoPairs(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        int pairs = 0;
        for (int c : counts) if (c == 2) pairs++;
        return pairs == 2;
    }

    public boolean hasThreeOfAKind(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        for (int c : counts) if (c == 3) return true;
        return false;
    }

    public boolean hasFourOfAKind(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        for (int c : counts) if (c == 4) return true;
        return false;
    }

    public boolean hasFlush(Card[] hand) {
        Suit s = hand[0].getSuit();
        for (Card c : hand) if (c.getSuit() != s) return false;
        return true;
    }

    public boolean hasStraight(Card[] hand) {
        int[] vals = new int[5];
        for (int i = 0; i < 5; i++) {
            vals[i] = hand[i].getFace().ordinal() + 1; // A=1 ... K=13
        }
        Arrays.sort(vals);

        boolean normal = true;
        for (int i = 1; i < 5; i++) {
            if (vals[i] != vals[i - 1] + 1) normal = false;
        }

        boolean wheel = (vals[0] == 1 && vals[1] == 2 && vals[2] == 3 &&
                         vals[3] == 4 && vals[4] == 13);

        return normal || wheel;
    }

    public boolean hasFullHouse(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        boolean three = false, two = false;
        for (int c : counts) {
            if (c == 3) three = true;
            if (c == 2) two = true;
        }
        return three && two;
    }

    // Hand ranking (higher = better)
    public int getHandRank(Card[] hand) {
        if (hasStraight(hand) && hasFlush(hand)) return 8;     // straight flush
        if (hasFourOfAKind(hand)) return 7;
        if (hasFullHouse(hand)) return 6;
        if (hasFlush(hand)) return 5;
        if (hasStraight(hand)) return 4;
        if (hasThreeOfAKind(hand)) return 3;
        if (hasTwoPairs(hand)) return 2;
        if (hasPair(hand)) return 1;
        return 0; // high card
    }

    public void printHand(Card[] hand) {
        for (Card c : hand) {
            System.out.printf("%-19s", c);
        }
        System.out.println();
    }
}

// PokerTest.java (main application)
public class Exercise7_1_2 {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        System.out.println("Hand 1:");
        Card[] hand1 = deck.dealHand();
        deck.printHand(hand1);

        System.out.println("\nHand 2:");
        Card[] hand2 = deck.dealHand();
        deck.printHand(hand2);

        int rank1 = deck.getHandRank(hand1);
        int rank2 = deck.getHandRank(hand2);

        System.out.println("\nHand 1 rank: " + rank1);
        System.out.println("Hand 2 rank: " + rank2);

        if (rank1 > rank2) System.out.println("Hand 1 is better!");
        else if (rank2 > rank1) System.out.println("Hand 2 is better!");
        else System.out.println("Tie!");
    }
}