import java.util.Random;

public class Exercise6_22{

    static int[][] board = new int[8][8];

    static int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
    static int[] vertical   = {-1,-2,-2,-1,1,2,2,1};

    public static void main(String[] args) {

        Random rand = new Random();

        int currentRow = 0;
        int currentColumn = 0;

        board[currentRow][currentColumn] = 1;

        int move = 2;
        boolean moved;

        while(move <= 64){

            moved = false;

            for(int i = 0; i < 8; i++){

                int r = rand.nextInt(8);

                int newRow = currentRow + vertical[r];
                int newCol = currentColumn + horizontal[r];

                if(isValidMove(newRow,newCol)){

                    currentRow = newRow;
                    currentColumn = newCol;

                    board[currentRow][currentColumn] = move;

                    move++;
                    moved = true;
                    break;
                }
            }

            if(!moved)
                break;
        }

        printBoard();
        System.out.println("Total moves: " + (move-1));
    }

    static boolean isValidMove(int row, int col){
        return row >= 0 && row < 8 && col >= 0 && col < 8 && board[row][col] == 0;
    }

    static void printBoard(){

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.printf("%3d ", board[i][j]);
            }
            System.out.println();
        }
    }
}