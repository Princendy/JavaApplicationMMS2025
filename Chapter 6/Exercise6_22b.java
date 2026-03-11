import java.util.Random;

public class Exercise6_22b{

    static int[] horizontal = {1,2,2,1,-1,-2,-2,-1};
    static int[] vertical = {-2,-1,1,2,2,1,-1,-2};

    public static void main(String[] args) {

        int[] results = new int[65];
        Random rand = new Random();

        for (int tour = 0; tour < 1000; tour++) {

            int[][] board = new int[8][8];
            int row = 0, col = 0;
            board[row][col] = 1;

            int moves = 1;

            while (true) {

                boolean moved = false;
                int startMove = rand.nextInt(8);

                for (int i = 0; i < 8; i++) {

                    int move = (startMove + i) % 8;

                    int newRow = row + vertical[move];
                    int newCol = col + horizontal[move];

                    if (newRow >= 0 && newRow < 8 &&
                        newCol >= 0 && newCol < 8 &&
                        board[newRow][newCol] == 0) {

                        row = newRow;
                        col = newCol;

                        board[row][col] = ++moves;
                        moved = true;
                        break;
                    }
                }

                if (!moved)
                    break;
            }

            results[moves]++;
        }

        System.out.println("Tour Length  Frequency");

        for (int i = 1; i <= 64; i++){
            if (results[i] > 0){
                System.out.printf("%5d %10d\n", i, results[i]);
			}
		}
    }
}