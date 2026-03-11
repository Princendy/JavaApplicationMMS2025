public class Exercise6_21{

    static int[][] board = new int[8][8];

    static int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
    static int[] vertical   = {-1,-2,-2,-1,1,2,2,1};

    static int[][] accessibility = {
        {2,3,4,4,4,4,3,2},
        {3,4,6,6,6,6,4,3},
        {4,6,8,8,8,8,6,4},
        {4,6,8,8,8,8,6,4},
        {4,6,8,8,8,8,6,4},
        {4,6,8,8,8,8,6,4},
        {3,4,6,6,6,6,4,3},
        {2,3,4,4,4,4,3,2}
    };

    public static void main(String[] args) {

        int currentRow = 0;
        int currentColumn = 0;

        board[currentRow][currentColumn] = 1;

        for(int move = 2; move <= 64; move++){

            int bestMove = -1;
            int minAccess = 9;

            for(int i=0;i<8;i++){

                int newRow = currentRow + vertical[i];
                int newCol = currentColumn + horizontal[i];

                if(isValidMove(newRow,newCol)){

                    if(accessibility[newRow][newCol] < minAccess){
                        minAccess = accessibility[newRow][newCol];
                        bestMove = i;
                    }
                }
            }

            if(bestMove == -1)
                break;

            currentRow += vertical[bestMove];
            currentColumn += horizontal[bestMove];

            board[currentRow][currentColumn] = move;

            updateAccessibility(currentRow,currentColumn);
        }

        printBoard();
    }

    static boolean isValidMove(int row, int col){
        return (row >= 0 && row < 8 && col >= 0 && col < 8 && board[row][col] == 0);
    }

    static void updateAccessibility(int row,int col){

        for(int i=0;i<8;i++){
            int r = row + vertical[i];
            int c = col + horizontal[i];

            if(r>=0 && r<8 && c>=0 && c<8)
                accessibility[r][c]--;
        }
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