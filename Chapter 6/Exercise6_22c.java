import java.util.ArrayList;
import java.util.Random;

public class Exercise6_22c{

    static final int[] HORIZONTAL = {2, 1, -1, -2, -2, -1, 1, 2};
    static final int[] VERTICAL   = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        Random rand = new Random();
        int[] lengthCount = new int[65];           // index = tour length
        long attempts = 0;
        boolean foundFullTour = false;

        while (!foundFullTour) {
            attempts++;

            int[][] board = new int[8][8];
            int row = 0;
            int col = 0;
            int moveNumber = 1;
            board[row][col] = moveNumber;

            while (moveNumber < 64) {
                // Collect all possible legal moves
                ArrayList<Integer> possibleDirs = new ArrayList<>();
                for (int d = 0; d < 8; d++) {
                    int nr = row + VERTICAL[d];
                    int nc = col + HORIZONTAL[d];
                    if (nr >= 0 && nr < 8 && nc >= 0 && nc < 8 && board[nr][nc] == 0) {
                        possibleDirs.add(d);
                    }
                }

                if (possibleDirs.isEmpty()) {
                    break;  // stuck
                }

                // Pick one at random
                int chosen = possibleDirs.get(rand.nextInt(possibleDirs.size()));
                row += VERTICAL[chosen];
                col += HORIZONTAL[chosen];
                moveNumber++;
                board[row][col] = moveNumber;
            }

            lengthCount[moveNumber]++;

            if (moveNumber == 64) {
                foundFullTour = true;
                System.out.println("\nFull tour found! (64 squares visited)");
                printBoard(board);
            }
        }

        System.out.println("\nFound after " + attempts + " attempts");
        System.out.println("\nTour length distribution:");
        for (int len = 1; len <= 64; len++) {
            if (lengthCount[len] > 0) {
                System.out.printf("%2d : %d%n", len, lengthCount[len]);
            }
        }
    }

    private static void printBoard(int[][] board) {
        System.out.println("+---+---+---+---+---+---+---+---+");
        for (int r = 0; r < 8; r++) {
            System.out.print("|");
            for (int c = 0; c < 8; c++) {
                int val = board[r][c];
                if (val == 0) {
                    System.out.print("   |");
                } else if (val < 10) {
                    System.out.print(" " + val + " |");
                } else {
                    System.out.print(" " + val + "|");
                }
            }
            System.out.println();
            System.out.println("+---+---+---+---+---+---+---+---+");
        }
    }
}