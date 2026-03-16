import java.util.Random;

public class DeckOfCards {

    private Card[] deck = new Card[52];
    private int currentCard = 0;
    private Random random = new Random();

    private static final String[] faces = {
        "Ace","2","3","4","5","6","7",
        "8","9","10","Jack","Queen","King"
    };

    private static final String[] suits = {
        "Hearts","Diamonds","Clubs","Spades"
    };

    public DeckOfCards() {

        int count = 0;

        for (int suit = 0; suit < suits.length; suit++) {
            for (int face = 0; face < faces.length; face++) {

                deck[count] = new Card(faces[face], suits[suit]);
                count++;
            }
        }
    }

    public void shuffle() {

        for (int i = 0; i < deck.length; i++) {

            int j = random.nextInt(52);

            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card dealCard() {

        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }
}