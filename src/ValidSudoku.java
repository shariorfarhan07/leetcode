import java.util.HashMap;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean b=true;
        for(int i = 0; i < board.length; i++) {
            b=leanerCheckx(board,i)&& leanerChecky(board,i);
            if (!b) return false;
        }

        return b && boxCheck( board,0,0)&& boxCheck( board,0,3)&& boxCheck( board,0,6)
                && boxCheck( board,3,0)&& boxCheck( board,3,3)&& boxCheck( board,3,6)
                && boxCheck( board,6,0)&& boxCheck( board,6,3)&& boxCheck( board,6,6);
    }
    public boolean leanerCheckx(char[][] board,int row) {

        HashMap<Character,Integer> need=new HashMap<>();
        for(int i = 0; i < board.length; i++) {
            if ('.'!=board[row][i] && need.containsKey(board[row][i])) return false;
            need.put(board[row][i],i);
        }
        return true;
    }
    public boolean leanerChecky(char[][] board,int col) {
        HashMap<Character,Integer> need=new HashMap<>();
        for(int i = 0; i < board.length; i++) {
            if ('.'!=board[i][col] && need.containsKey(board[i][col])) return false;
            need.put(board[i][col],i);
        }
        return true;
    }

    public static  boolean boxCheck(char[][] board,int row,int col){
        HashMap<Character,Integer> need=new HashMap<>();
        for(int i = row; i <row+3 ; i++) {
            for(int j = col; j < col+3; j++) {
                if ('.'!=board[i][j] && need.containsKey(board[i][j])) return false;
                need.put(board[i][j],i);
            }
        }
        return true;
    }
    
    
}
