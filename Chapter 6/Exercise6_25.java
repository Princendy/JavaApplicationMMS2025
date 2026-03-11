import java.util.Random;

public class Exercise6_25{

    static Random rand = new Random();

    public static void main(String[] args) {

        int attempts = 0;

        while (true) {

            attempts++;

            int[] board = new int[8];

            for (int i = 0; i < 8; i++)
                board[i] = rand.nextInt(8);

            if (valid(board)) {

                System.out.println("Solution found after " + attempts + " attempts");

                for (int r = 0; r < 8; r++) {

                    for (int c = 0; c < 8; c++) {

                        if (board[r] == c)
                            System.out.print(" Q ");
                        else
                            System.out.print(" . ");
                    }

                    System.out.println();
                }

                break;
            }
        }
    }

    static boolean valid(int[] board) {

        for (int i = 0; i < 8; i++)
            for (int j = i + 1; j < 8; j++)

                if (board[i] == board[j] ||
                    Math.abs(board[i] - board[j]) == Math.abs(i - j))
                    return false;

        return true;
    }
}