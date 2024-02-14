import java.util.Arrays;

public class SurroundedRegions {
    public static void solve(char[][] board) {
        boolean[][] checkIfItsGoingTobeX=new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            System.out.println(i);
            if (board[i][0]=='O') checkCornerCase(board,i,0,checkIfItsGoingTobeX);
            if (board[i][board[0].length-1]=='O')checkCornerCase(board,i,board[0].length-1, checkIfItsGoingTobeX);
        }
        for(int i = 0; i < board[0].length; i++) {
            if (board[0][i]=='O') checkCornerCase(board,0,i,checkIfItsGoingTobeX);
            if (board[board.length-1][i]=='O')checkCornerCase(board,board.length-1,i, checkIfItsGoingTobeX);
        }

        for(int i = 0; i <checkIfItsGoingTobeX.length ; i++)
        System.out.println(Arrays.toString(checkIfItsGoingTobeX[i]));
        for(int row = 1; row < board.length-1; row++) {
            for(int col = 1; col < board[0].length-1; col++) {
                if (!checkIfItsGoingTobeX[row][col]&& board[row][col]=='O')board[row][col]='X';
            }
        }
    }

    public static  void checkCornerCase(char[][] board,int row,int col,boolean[][] check){
        System.out.println(row+" "+col);
        if (row<0||col<0||row>=board.length||col>=board[0].length) return;
        if (board[row][col]=='O'&& !check[row][col]){
            check[row][col]=true;
            checkCornerCase( board,row+1, col,check);
            checkCornerCase( board,row-1, col,check);
            checkCornerCase( board,row, col+1,check);
            checkCornerCase( board,row, col-1,check);

     }
    }


}
