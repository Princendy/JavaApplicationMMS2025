public class Exercise6_24{

    static int SIZE = 8;

    public static void main(String[] args) {

        int[] board = new int[SIZE];

        if (placeQueen(board, 0))
            printBoard(board);
        else
            System.out.println("No solution found");
    }

    static boolean placeQueen(int[] board, int row) {

        if (row == SIZE)
            return true;

        for (int col = 0; col < SIZE; col++) {

            if (safe(board, row, col)) {

                board[row] = col;

                if (placeQueen(board, row + 1))
                    return true;
            }
        }

        return false;
    }

    static boolean safe(int[] board, int row, int col) {

        for (int i = 0; i < row; i++) {

            if (board[i] == col ||
                Math.abs(board[i] - col) == Math.abs(i - row))
                return false;
        }

        return true;
    }

    static void printBoard(int[] board) {

        for (int r = 0; r < SIZE; r++) {

            for (int c = 0; c < SIZE; c++) {

                if (board[r] == c)
                    System.out.print(" Q ");
                else
                    System.out.print(" . ");
            }

            System.out.println();
        }
    }
}