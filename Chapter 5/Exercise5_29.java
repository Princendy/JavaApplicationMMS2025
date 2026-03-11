import java.util.Random;

public class Exercise5_29 {

    enum Coin { HEADS, TAILS }

    public static Coin flip() {

        Random rand = new Random();

        if (rand.nextInt(2) == 0)
            return Coin.HEADS;
        else
            return Coin.TAILS;
    }

    public static void main(String[] args) {

        int heads = 0;
        int tails = 0;

        for (int i = 1; i <= 100; i++) {

            Coin result = flip();

            if (result == Coin.HEADS)
                heads++;
            else
                tails++;
        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}