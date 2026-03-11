import java.util.Random;

public class Exercise6_28{

    public static void main(String[] args) {

        Random rand = new Random();

        int tortoise = 1;
        int hare = 1;

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        while (tortoise < 70 && hare < 70) {

            int tMove = rand.nextInt(10) + 1;
            int hMove = rand.nextInt(10) + 1;

            if (tMove <= 5)
                tortoise += 3;
            else if (tMove <= 7)
                tortoise -= 6;
            else
                tortoise += 1;

            if (hMove <= 2)
                hare += 0;
            else if (hMove <= 4)
                hare += 9;
            else if (hMove == 5)
                hare -= 12;
            else if (hMove <= 8)
                hare += 1;
            else
                hare -= 2;

            if (tortoise < 1) tortoise = 1;
            if (hare < 1) hare = 1;

            for (int i = 1; i <= 70; i++) {

                if (i == tortoise && i == hare)
                    System.out.print("OUCH");
                else if (i == tortoise)
                    System.out.print("T");
                else if (i == hare)
                    System.out.print("H");
                else
                    System.out.print("-");
            }

            System.out.println();
        }

        if (tortoise >= 70 && hare >= 70)
            System.out.println("It's a tie!");
        else if (tortoise >= 70)
            System.out.println("TORTOISE WINS!!!");
        else
            System.out.println("Hare wins. Yuch.");
    }
}